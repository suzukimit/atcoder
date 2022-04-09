package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        for (int i = 1; i <= b; i++) {
            int wk = a * i;
            int wk2 = wk % b;
            if (wk2 == c) {
                out.println("YES");
                return;
            }
            //out.println(String.valueOf(wk) + " " + String.valueOf(wk2));
        }
        out.println("NO");
    }
}
