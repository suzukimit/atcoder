package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class Product {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a * b % 2;
        if (c == 0) {
            out.append("Even");
        } else {
            out.append("Odd");
        }
    }
}
