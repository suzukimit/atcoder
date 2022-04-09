package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

/**
 * 公式解説・ユーザー解説が全部違うっぽいのが面白い。
 *
 * 考えたロジックは、
 */
public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        int wk = 0;
        int wk2 = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            wk = h[i];
            wk2 = i;
            for (int ii = i+1; ii < n; ii++) {
                if (h[ii] == 0) {
                    break;
                } else if (h[ii] <= wk) {
                    wk = h[ii];
                }
                wk2 = ii;
            }
            if (wk > 0) {
                for (int ii = i; ii <= wk2; ii++) {
                    h[ii] -= wk;
                }
                ans += wk;
            }
            if (h[i] > 0) i--;
        }
        out.println(ans);
    }
}
