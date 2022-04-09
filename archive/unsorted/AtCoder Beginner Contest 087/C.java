package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

/**
 * 累積和を利用。
 *
 * DPを使う解法も解説にあったので、そちらも試す。
 * https://blog.hamayanhamayan.com/entry/2018/01/28/225409
 */
public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] aSum1 = new int[n];
        int[] aSum2 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = in.nextInt();
            if (i > 0) {
                aSum1[i] = aSum1[i-1] + a1[i];
            } else {
                aSum1[i] = a1[i];
            }
        }
        for (int i = 0; i < n; i++) {
            a2[i] = in.nextInt();
            if (i > 0) {
                aSum2[i] = aSum2[i-1] + a2[i];
            } else {
                aSum2[i] = a2[i];
            }
        }

        int ret = 0;
        for (int i = 0; i < n; i++) {
            int wk = aSum1[i] + aSum2[n-1];
            if (i > 0) {
                wk -= aSum2[i-1];
            }
            if (wk > ret) {
                ret = wk;
            }
        }
        out.println(ret);
    }
}
