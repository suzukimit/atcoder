package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

/**
 * c0 = a0 * b0
 * c1 = a1 * b0 + a0 * b1
 * c2 = a2 * b0 + a1 * b1 + a0 * b2
 * c3 = a3 * b0 + a2 * b1 + a1 * b2 + a0 * b3
 * c4 = ...
 *
 * ここで、n = 2, m = 3とすると、
 *
 * c5 = a2 * b3 となるので、 b3 = c5 / a2 で求まる（制約上、0除算は発生しない）。
 *
 * また、
 *
 * c4 = a2 * b2 + a1 * b3
 * c3 = a2 * b1 + a1 * b2 + a0 * b3
 * c2 = a2 * b0 + a1 * b1 + a0 * b2
 *
 * なので
 *
 * b2 = (c4 - a0 * b4 - a1 * b3) / a2
 * b1 = (c3 - a1 * b2 - a0 * b3) / a2
 * b0 = (c2 - a1 * b1 - a0 * b2) / a2
 *
 * n, mの大きさを無視すると
 *
 * b3 = (c5 - a0 * b5 - a1 * b4 - a3 * b2 - a4 * b1 - a5 * b0) / a2
 * b2 = (c4 - a0 * b4 - a1 * b3 - a3 * b1 - a4 * b0) / a2
 * b1 = (c3 - a0 * b3 - a1 * b2 - a0 * b3) / a2
 * b0 = (c2 - a0 * b2 - a1 * b1) / a2
 *
 * よって以下のような感じで一般化できる（wkは条件が必要だが省略）
 *
 * bi = (c(i+n) - wk) / an
 * wk += for (int j = 0; j <= i+n; j++) { a[j] * b[i+n-j] }
 */
public class D {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[m+1];
        int[] c = new int[n+m+1];
        for (int i = 0; i < n + 1; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n + m + 1; i++) {
            c[i] = in.nextInt();
        }

        int wk = 0;
        for (int i = m; i >= 0; i--) {
            wk = 0;
            for (int j = 0; j <= i+n; j++) {
                int ia = j;
                int ib = i+n-j;
                if (0 <= ia && ia <= n && 0 <= ib && ib <= m && ib != i) {
                    wk += a[ia] * b[ib];
                }
            }
            b[i] = (c[i + n] - wk) / a[n];
        }

        for (int i = 0; i <= m; i++) {
            out.println(b[i]);
        }
    }
}