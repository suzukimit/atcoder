package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

/**
 * メモ化再帰による別解。
 *
 * rec関数では、計算量が無視できるならmemoの配列は不要（memoに値を格納せずにそのままreturn）。
 * 実際はメモ化しないと大変なことになるため必須。
 */
public class A_rec {
    int n = 0;
    int[] h;
    long[] memo;  //メモ化した結果を格納
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        h = new int[n];
        memo = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
            memo[i] = Long.MAX_VALUE;
        }
        out.println(rec(n-1));
    }

    public long rec(int i) {
        if (memo[i] != Long.MAX_VALUE) return memo[i];
        if (i == 0) {
            memo[i] = 0;
        } else if (i == 1) {
            memo[i] = Math.abs(h[i] - h[i-1]);
        } else {
            long wk1 = Math.abs(h[i] - h[i-1]) + rec(i-1);
            long wk2 = Math.abs(h[i] - h[i-2]) + rec(i-2);
            memo[i] = Math.min(wk1, wk2);
        }
        return memo[i];
    }
}
