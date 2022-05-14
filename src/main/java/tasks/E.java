package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class E {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];

        long ans1 = 0;
        long ans2 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (i % 2 == 0) {
                if (i == n-1) {
                    ans1 += Math.min(a[i], a[i-1]);
                } else {
                    ans1 += a[i];
                }
            } else {
                ans2 += a[i];
            }
        }
        if (n % 2 == 1) {
            ans2 += Math.min(a[0], a[n-1]);
        }
        out.println(Math.min(ans1, ans2));
    }
}
