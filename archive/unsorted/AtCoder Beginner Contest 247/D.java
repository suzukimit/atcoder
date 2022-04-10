package tasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.io.PrintWriter;

public class D {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int q = in.nextInt();
        Deque<Long> q1x = new ArrayDeque<>();
        Deque<Long> q1c = new ArrayDeque<>();
        for (int i = 0; i < q; i++) {
            int type = in.nextInt();
            if (type == 1) {
                q1x.add(in.nextLong());
                q1c.add(in.nextLong());
            } else {
                long c = in.nextLong();
                long sum = 0;
                while (c > 0) {
                    long _q1c = q1c.poll();
                    long _q1x = q1x.getFirst();
                    long wk = Math.min(_q1c, c);
                    c -= wk;
                    sum += wk * _q1x;
                    if (_q1c > wk) {
                        q1c.addFirst(_q1c - wk);
                    } else {
                        q1x.removeFirst();
                    }
                }
                out.println(sum);
            }
        }
    }
}
