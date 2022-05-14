package tasks;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int w = in.nextInt();
        int[] a = new int[n];
        HashSet<Integer> ans = new HashSet();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] <= w) ans.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                if (ii == i) continue;
                int wk = a[i] + a[ii];
                if (wk <= w) ans.add(wk);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                if (ii == i) continue;
                for (int iii = 0; iii < n; iii++) {
                    if (iii == i || iii == ii) continue;
                    int wk = a[i] + a[ii] + a[iii];
                    if (wk <= w) ans.add(wk);
                }
            }
        }
        out.println(ans.size());
    }
}
