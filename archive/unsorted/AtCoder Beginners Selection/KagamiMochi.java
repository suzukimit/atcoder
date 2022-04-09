package main.java.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;

public class KagamiMochi {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        Set<Integer> d = new HashSet<>();
        do {
            d.add(in.nextInt());
        } while (--n > 0);
        out.print(d.size());
    }
}
