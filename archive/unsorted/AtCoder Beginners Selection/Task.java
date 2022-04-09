package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class Task {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String s = in.next();
        out.append((a+b+c) + " " + s);
    }
}
