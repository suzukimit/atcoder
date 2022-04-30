package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class A {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        int x = in.nextInt();

        int countT = x / (a + c);
        int countA = x / (d + f);

        int yojoT = x % (a + c) - a;
        int yojoA = x % (d + f) - d;

        if (yojoT < 0) yojoT = 0;
        if (yojoA < 0) yojoA = 0;

        int kyoriT = b * (x - countT * c - yojoT);
        int kyoriA = e * (x - countA * f - yojoA);

        if (kyoriT > kyoriA) {
            out.println("Takahashi");
        } else if (kyoriT < kyoriA) {
            out.println("Aoki");
        } else {
            out.println("Draw");
        }
    }
}
