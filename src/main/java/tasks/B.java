package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long k = in.nextLong();

        int i = 0;
        do {
            if (a >= b) {
                out.println(i);
                return;
            }
            i++;
            a *= k;
        } while (true);
    }
}
