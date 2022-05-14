package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class C {
    int n = 0;
    int[] a;
    int[] b;
    int[] c;
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            c[i] = in.nextInt();
        }
    }

    public void rec(int i) {
    }
}
