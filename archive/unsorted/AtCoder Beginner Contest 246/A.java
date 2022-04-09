package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class A {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        int x4 = 0;
        int y4 = 0;

        if (x1 == x2) {
            x4 = x3;
        } else if (x2 == x3) {
            x4 = x1;
        } else if (x3 == x1) {
            x4 = x2;
        }
        if (y1 == y2) {
            y4 = y3;
        } else if (y2 == y3) {
            y4 = y1;
        } else if (y3 == y1) {
            y4 = y2;
        }

        out.println(x4);
        out.println(y4);
    }
}
