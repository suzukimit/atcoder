package main.java.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class CardGameforTwo {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        do {
            a.add(Integer.valueOf(in.nextInt()));
        } while (--n > 0);
        a.sort(Comparator.reverseOrder());
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (i % 2 == 0) {
                sum += a.get(i);
            } else {
                sum -= a.get(i);
            }
        }
        out.append(String.valueOf(sum));
    }
}
