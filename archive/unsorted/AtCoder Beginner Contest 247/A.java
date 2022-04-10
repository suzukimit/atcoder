package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class A {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String[] s = in.next().split("");
        if (s[2].equals("1")) {
            s[3] = "1";
        } else {
            s[3] = "0";
        }
        if (s[1].equals("1")) {
            s[2] = "1";
        } else {
            s[2] = "0";
        }
        if (s[0].equals("1")) {
            s[1] = "1";
        } else {
            s[1] = "0";
        }
        s[0] = "0";
        out.println(s[0] + s[1] + s[2] + s[3]);
    }
}
