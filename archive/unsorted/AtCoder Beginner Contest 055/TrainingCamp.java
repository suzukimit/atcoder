package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class TrainingCamp {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
            ret %= 1000000007;
        }
        out.println(ret);
    }
}
