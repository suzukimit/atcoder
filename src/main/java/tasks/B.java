package tasks;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class B {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s[] = in.next().split("");

        boolean hasUpper = false;
        boolean hasLower = false;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i].toLowerCase() == s[i]) hasUpper = true;
            if (s[i].toUpperCase() == s[i]) hasLower = true;
            set.add(s[i]);
        }

        if (s.length == set.size() && hasUpper && hasLower) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }
}
