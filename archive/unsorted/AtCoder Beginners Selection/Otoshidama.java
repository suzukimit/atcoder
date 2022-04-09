package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class Otoshidama {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int y = in.nextInt();
        int n1000 = y / 1000;
        int n5000 = 0;
        int n10000 = 0;
        int diff = n1000 - n;
        int count = diff / 9 + 1;
        for (int i = 0; i <= count; i++) {
            if ((diff - 9 * i) % 4 == 0) {
                n10000 = i;
                n5000 = (diff - 9 * i) / 4;
                n1000 = n - n10000 - n5000;
                if (n10000 >= 0 && n5000 >= 0 && n1000 >= 0) {
                    out.print(n10000 + " " + n5000 + " " + n1000);
                    return;
                }
            }
        }
        out.print("-1 -1 -1");
    }
}
