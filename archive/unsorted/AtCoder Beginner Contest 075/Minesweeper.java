package main.java.tasks;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class Minesweeper {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int h = in.nextInt();
        int w = in.nextInt();
        String[][] s = new String[h][w];

        for (int i = 0; i < h; i++) {
            String str = in.next();
            s[i] = str.split("");
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j].equals(".")) {
                    int count = 0;
                    count += wk(s, i-1, j-1);
                    count += wk(s, i-1, j);
                    count += wk(s, i-1, j+1);
                    count += wk(s, i, j-1);
                    count += wk(s, i, j+1);
                    count += wk(s, i+1, j-1);
                    count += wk(s, i+1, j);
                    count += wk(s, i+1, j+1);
                    s[i][j] = String.valueOf(count);
                }
                out.print(s[i][j]);
            }
            out.println("");
        }
    }

    public int wk(String[][] ss, int i, int j) {
        try {
            if (ss[i][j].equals("#")) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
}
