package main.java.tasks;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        int preA = a[0];
        int preB = b[0];
        for (int i = 1; i < n; i++) {
            int _a = a[i];
            int _b = b[i];
            boolean canA = false;
            boolean canB = false;

            if (preA != 0) {
                if (Math.abs(preA - _a) <= k) {
                    canA = true;
                }
                if (Math.abs(preA - _b) <= k) {
                    canB = true;
                }
            }
            if (preB != 0) {
                if (Math.abs(preB - _a) <= k) {
                    canA = true;
                }
                if (Math.abs(preB - _b) <= k) {
                    canB = true;
                }
            }

            if (canA) preA = _a; else preA = 0;
            if (canB) preB = _b; else preB = 0;

            if (!canA && !canB) {
                out.println("No");
                return;
            }
        }
        out.println("Yes");
    }
}
