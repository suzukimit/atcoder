package tasks;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int wk = 1;
        for (int i = 1; i <= n; i++) {
            wk = a[wk-1];
            if (wk == 2) {
                out.println(i);
                return;
            }
        }
        out.println(-1);
    }
}
