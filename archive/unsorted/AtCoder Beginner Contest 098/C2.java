package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class C2 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String[] s = in.next().split("");

        int[] w = new int[n];
        int[] e = new int[n];

        if (s[0].equals("W")) {
            w[0] = 1;
        } else {
            e[0] = 1;
        }

        for (int i = 1; i < n; i++) {
            w[i] = w[i-1];
            e[i] = e[i-1];
            if (s[i].equals("W")) {
                w[i]++;
            } else {
                e[i]++;
            }
        }

        int ret = e[n-1] - e[0];
        for (int i = 1; i < n; i++) {
            int wk = w[i-1] + e[n-1] - e[i];
            if (wk < ret) {
                ret = wk;
            }
        }
        out.println(ret);
    }
}
