package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> s = new ArrayList<>();
        s.add(new ArrayList<>());
        s.get(0).add(1);

        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> wk = s.get(i-1);
            s.add(new ArrayList<>(wk));
            s.get(i).add(i+1);
            s.get(i).addAll(wk);
        }

        s.get(n-1).forEach(e -> out.println(e));
    }
}
