package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class A {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] h = new int[n];
        long[] dp = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[i] = 0;
            } else if (i == 1) {
                dp[i] = Math.abs(h[1] - h[0]);
            } else {
                long wk1 = Math.abs(h[i] - h[i-1]) + dp[i-1];
                long wk2 = Math.abs(h[i] - h[i-2]) + dp[i-2];
                dp[i] = Math.min(wk1, wk2);
            }
        }

        out.println(dp[n-1]);
    }
}
