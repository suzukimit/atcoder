package tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class C {

    int n = 0;
    int[][] s;
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        n = in.nextInt();
        s = new int[n][10];
        for (int i = 0; i < n; i++) {
            s[i] = Arrays.stream(in.next().split("")).mapToInt(str -> Integer.valueOf(str)).toArray();
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            int[] wk1 = calc1(i);
            int[] wk2 = calc2(wk1);
            int max = Arrays.stream(wk2).max().getAsInt();
            ans = Math.min(ans, max);
        }
        out.println(ans);
    }

    //統一する文字をtargetとした場合に、各レールで何秒かかるか
    public int[] calc1(int target) {
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < 10; ii++) {
                if (s[i][ii] == target) {
                    ans[i] = ii;
                }
            }
        }
        return ans;
    }

    //[2, 2, 2] -> [2, 12, 22]
    public int[] calc2(int[] arg) {
        HashMap<Integer, Integer> count = new HashMap();
        for (int i = 0; i < n; i++) {
            int cnt = count.getOrDefault(arg[i], 0);
            count.put(arg[i], cnt+1);
            arg[i] = arg[i] + cnt*10;
        }
        return arg;
    }
}

