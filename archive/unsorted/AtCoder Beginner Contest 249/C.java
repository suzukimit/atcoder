package tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * 【要復習】
 * bit全探索が使えるのはわかったが、文字数をカウントするロジックが非効率でTLEが2個
 */
public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
        }

        long ans = 0;
        for (int i = 0; i < (1<<n); i++) {
            HashMap<String, Integer> count = new HashMap<String, Integer>();
            for (int j = 0; j < n; j++) {
                if ((1 & i>>j) == 1) {
                    Arrays.stream(s[j].split("")).forEach(str -> {
                        if (count.containsKey(str)) {
                            count.put(str, count.get(str)+1);
                        } else {
                            count.put(str, 1);
                        }
                    });
                }
            }
            long cnt = count.entrySet().stream().filter(entry -> entry.getValue() == k).count();
            ans = Math.max(ans, cnt);
        }
        out.println(ans);
    }
}
