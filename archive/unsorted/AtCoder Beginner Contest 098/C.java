package tasks;

import java.util.*;
import java.io.PrintWriter;

/**
 * とりあえず自力で出した解法。
 * E -> W または W -> E の場合はどっちも同じ、
 * E -> E だと後ろがリーダーの方が良くて、
 * W -> W だと前がリーダーの方が良いよね、みたいな考え。
 *
 * 累積和を使うともっと簡単そうなので、そっちのやり方でも解いてみる。
 */
public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String[] s = in.next().split("");

        String wk = s[0];
        int[] score = new int[n];
        int highScore = 0;
        int highScoreIndex = 0;
        for (int i = 1; i < n; i++) {
            String wk2 = s[i];
            if (wk.equals("E") && wk2.equals("E")) {
                score[i] = score[i-1] + 1;
                if (score[i] > highScore) {
                    highScore = score[i];
                    highScoreIndex = i;
                }
            } else if (wk.equals("W") && wk2.equals("W")) {
                score[i] = score[i-1] - 1;
            } else {
                score[i] = score[i-1];
            }
            wk = s[i];
        }

        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (i < highScoreIndex && s[i].equals("W")) {
                ret++;
            } else if (i > highScoreIndex && s[i].equals("E")) {
                ret++;
            }
        }
        out.println(ret);
    }
}
