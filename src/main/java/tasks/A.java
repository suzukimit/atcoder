package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class A {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s[] = in.next().split("");
        List<String> ss = Arrays.asList(s);
        for (int i = 0; i <= 9; i++) {
            if (!ss.contains(String.valueOf(i))) {
                out.println(i);
            }
        }
    }
}
