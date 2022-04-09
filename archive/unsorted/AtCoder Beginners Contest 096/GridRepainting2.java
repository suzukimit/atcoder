package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class GridRepainting2 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        var h = in.nextInt();
        var w = in.nextInt();
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = in.next().split("");
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j].equals("#")) {
                    if (
                                    wk(s, i-1, j)
                                    || wk(s, i, j-1)
                                    || wk(s, i, j+1)
                                    || wk(s, i+1, j)
                    ) {
                    } else {
                        out.println("No");
                        return;
                    }
                }
            }
        }
        out.println("Yes");
    }

    public boolean wk(String[][] s, int i, int j) {
        try {
            return s[i][j].equals("#");
        } catch (Exception e) {
            return false;
        }
    }
}
