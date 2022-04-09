package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class PlacingMarbles {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String a = in.next();
        String ret = String.valueOf(a.replace("0", "").length());
        out.append(ret);
    }
}
