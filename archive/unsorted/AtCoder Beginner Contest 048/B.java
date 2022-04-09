package tasks;

import java.math.BigDecimal;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * a 以上 b 以下の整数という問題は、f(n)を0以上n以下の
 *
 * f(b) - f(a-1)
 *
 * で考えると楽だよ、とのこと
 */
public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long x = in.nextLong();

        long retB = b / x + 1;
        long retA = (a-1) / x + 1;
        if (a > 0) {
            out.println(retB - retA);
        } else {
            out.println(retB);
        }
    }
}
