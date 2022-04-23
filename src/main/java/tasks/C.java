package tasks;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
        }

        int ret = 0;
        for (int i = 0; i<(1<<n); i++) {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((1 & i>>j) == 1) {
                    sb.append(s[j]);
                    count++;
                }
            }
            if (count < k) continue;
            int calc = calc(sb.toString(), k);
            if (calc > ret) {
                ret = calc;
            }
        }
        out.println(ret);
    }

    public int calc(String s, int k) {
        if (s.isEmpty()) return 0;
        String[] strings = s.split("");
        Arrays.sort(strings);

        String wk = "";
        int count = 1;
        int ret = 0;
        for (int i = 0; i < strings.length; i++) {
            boolean isLast = i == strings.length - 1;
            if (isLast && strings[i].equals(wk)) count++;
            if (strings[i].equals(wk) && (i != strings.length-1)) {
                count++;
            } else {
                if (count == k) ret++;
                count = 1;
            }
            wk = strings[i];
        }

        return ret;
    }
}
