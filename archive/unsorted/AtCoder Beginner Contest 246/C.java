package tasks;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] >= x && x > 0) {
                int wk = Math.min(a[i]/x, k);
                a[i] -= wk * x;
                k -= wk;
            }
        }

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        aList.sort(Comparator.reverseOrder());
        long ret = aList.stream().skip(k).mapToLong(e -> e).sum();
        out.println(ret);
    }
}
