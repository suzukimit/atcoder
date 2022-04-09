package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class Coins {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n500 = in.nextInt();
        int n100 = in.nextInt();
        int n50 = in.nextInt();
        int sum = in.nextInt();

        var ret = 0;
        for (int i500 = 0; i500 <= n500; i500++) {
            for (int i100 = 0; i100 <= n100; i100++) {
                for (int i50 = 0; i50 <= n50; i50++) {
                    if (i500 * 500 + i100 * 100 + i50 * 50 == sum) {
                        ret++;
                    }
                }
            }
        }

        out.append(String.valueOf(ret));
    }
}
