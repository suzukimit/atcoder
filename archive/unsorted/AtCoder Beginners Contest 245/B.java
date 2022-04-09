package main.java.tasks;

import java.util.*;
import java.io.PrintWriter;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }

        for (int i = 0; i <= 2000; i++) {
            if (!a.contains(Integer.valueOf(i))) {
                out.println(i);
                return;
            }
        }
    }
}
