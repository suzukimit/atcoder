package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class 白昼夢 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        if (wk(s, false)) {
            out.print("YES");
        } else {
            out.print("NO");
        }
    }

    private boolean wk(String s, boolean isDream) {
        if (s.startsWith("eraser")) {
            s = s.substring("eraser".length());
            isDream = false;
        } else if (s.startsWith("erase")) {
            s = s.substring("erase".length());
            isDream = false;
        } else if (s.startsWith("er") && isDream) {
            s = s.substring("er".length());
            isDream = false;
        } else if (s.startsWith("dream")) {
            s = s.substring("dream".length());
            isDream = true;
        } else {
            return false;
        }
        if (s.length() == 0) {
            return true;
        } else {
            return wk(s, isDream);
        }
    }
}
