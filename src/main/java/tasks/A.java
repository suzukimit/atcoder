package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class A {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        String ret = "";
        while (true) {
            ret += s;
            if (ret.length() >= 6) {
                out.println(ret);
                break;
            }
        }
    }
}
