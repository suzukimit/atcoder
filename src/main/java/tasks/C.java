package tasks;

import java.util.*;
import java.io.PrintWriter;

public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        Set<String> set = new HashSet();
        int max = 0;
        int ret = 0;

        for (int i = 0; i < n; i++) {
            String s = in.next();
            int t = in.nextInt();
            if (set.add(s)) {
                if (t > max) {
                    max = t;
                    ret = i+1;
                }
            }
        }
        out.println(ret);
    }
}
