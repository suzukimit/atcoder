package tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int a = n / 1000;
        int b = (n-a*1000) / 100;
        int c = (n-a*1000-b*100) / 10;
        int d = n-a*1000-b*100-c*10;

        if (check(a, b, c, d, OPE.PLUS, OPE.PLUS, OPE.PLUS, out)) return;
        if (check(a, b, c, d, OPE.PLUS, OPE.PLUS, OPE.MINUS, out)) return;
        if (check(a, b, c, d, OPE.PLUS, OPE.MINUS, OPE.PLUS, out)) return;
        if (check(a, b, c, d, OPE.PLUS, OPE.MINUS, OPE.MINUS, out)) return;
        if (check(a, b, c, d, OPE.MINUS, OPE.PLUS, OPE.PLUS, out)) return;
        if (check(a, b, c, d, OPE.MINUS, OPE.PLUS, OPE.MINUS, out)) return;
        if (check(a, b, c, d, OPE.MINUS, OPE.MINUS, OPE.PLUS, out)) return;
        if (check(a, b, c, d, OPE.MINUS, OPE.MINUS, OPE.MINUS, out)) return;
    }

    public boolean check(int a, int b, int c, int d, OPE ope1, OPE ope2, OPE ope3, PrintWriter out) {
        int wk = ope1.calc(a, b);
        wk = ope2.calc(wk, c);
        wk = ope3.calc(wk, d);
        if (wk == 7) {
            out.println(String.format("%d%s%d%s%d%s%d=7",
                    a, ope1.toString(), b, ope2.toString(), c, ope3.toString(), d));
        }
        return wk == 7;
    }

    enum OPE {
        PLUS {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
            @Override
            public String toString() {
                return "+";
            }
        },
        MINUS{
            @Override
            public int calc(int a, int b) {
                return a - b;
            }

            @Override
            public String toString() {
                return "-";
            }
        };
        public abstract int calc(int a, int b);
        public abstract String toString();
    }
}
