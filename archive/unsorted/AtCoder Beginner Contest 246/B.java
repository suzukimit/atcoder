package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        out.println(a/c);
        out.println(b/c);
    }
}
