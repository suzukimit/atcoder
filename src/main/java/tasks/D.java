package tasks;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class D {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        //累積和を取る <i, <aの値, 個数>>
        int[][] count = new int[n][n+1];
        for (int i = 0; i < n; i++) {
            for (int ii = i; ii < n; ii++) {
                try {
                    count[ii][a[i]] = count[ii][a[i]] + 1;
                } catch (Exception e) {
                }
            }
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            int x = in.nextInt();

            Integer wk = 0;
            if (l-2 >= 0) {
                wk = count[r-1][x] - count[l-1][x];
            } else {
                wk = count[r-1][x];
            }
            out.println(wk);
        }
    }
}
