package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class A {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (a * 60 + b <= c * 60 + d) {
            out.println("Takahashi");
        } else {
            out.println("Aoki");
        }
    }
}
