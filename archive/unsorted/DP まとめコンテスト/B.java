package tasks;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class B {
    int n = 0;
    int k = 0;
    int[] h;
    long[] dp;
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        k = in.nextInt();
        h = new int[n];
        dp = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
            dp[i] = Long.MAX_VALUE;
        }
        dp[0] = 0;
        out.println(rec(n-1));
    }

    public long rec(int i) {
        if (dp[i] != Long.MAX_VALUE) return dp[i];
        long[] wk = new long[k];
        for (int j = 0; j < k; j++) {
            if (i-j-1 < 0) wk[j] = Long.MAX_VALUE;
            else wk[j] = Math.abs(h[i] - h[i-j-1]) + rec(i-j-1);
        }
        dp[i] = LongStream.of(wk).min().getAsLong();
        return dp[i];
    }
}
