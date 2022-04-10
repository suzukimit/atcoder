package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String[] s = new String[n];
        String[] t = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
            t[i] = in.next();
        }

        boolean isDuplicateS = false;
        boolean isDuplicateT = false;
        for (int i = 0; i < n; i++) {
            for (int ii = i+1; ii < n; ii++) {
                if (s[i].equals(s[ii]) || s[i].equals(t[ii])) {
                    isDuplicateS = true;
                }
                if (t[i].equals(s[ii]) || t[i].equals(t[ii])) {
                    isDuplicateT = true;
                }
            }
            if (isDuplicateS && isDuplicateT) {
                out.println("No");
                return;
            }
        }
        out.println("Yes");
    }
}
