package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            max = Math.max(max, a[i]);
        }
        for (int i = 0; i < k; i++) {
            b[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != max) continue;
            for (int ii = 0; ii < k; ii++) {
                if (b[ii] == i+1) {
                    out.println("Yes");
                    return;
                }
            }
        }
        out.println("No");
    }
}
