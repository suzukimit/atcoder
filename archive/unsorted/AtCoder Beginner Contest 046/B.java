package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int ret = (int) (k * Math.pow(k-1, n-1));
        out.println(ret);
    }
}
