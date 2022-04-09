package main.java.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class Shiftonly {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        int count = 0;
        while(true) {
            if (isShiftOnly(list)) {
                count++;
            } else {
                break;
            }
        }
        out.append(String.valueOf(count));
    }

    private boolean isShiftOnly(List<Integer> list) {
        list.replaceAll(e -> e % 2 == 0 ? (e / 2) : 0);
        if (list.contains(0)) {
            return false;
        } else {
            return true;
        }
    }
}
