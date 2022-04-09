package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class Traveling {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int t = 0;
        int x = 0;
        int y = 0;
        do {
            if (t > 0) {
                t = in.nextInt() - t;
                x = in.nextInt() - x;
                y = in.nextInt() - y;
            } else {
                t = in.nextInt();
                x = in.nextInt();
                y = in.nextInt();
            }
            if (!wk(t, x, y)) {
                out.print("No");
                return;
            }
        } while(--n > 0);
        out.print("Yes");
    }

    public boolean wk(int t, int x, int y) {
        t -= Math.abs(x) + Math.abs(y);
        if (t < 0) {
            return false;
        } else if (t % 2 == 0) {
            return true;
        }
        return false;
    }
}
