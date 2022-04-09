package main.java.tasks;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class SomeSums {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int ret = 0;
        for (int i = 1; i <= a; i++) {
            int sum = sumOfDigits(i);
            if (b <= sum && sum <= c) ret += i;
        }
        out.append(String.valueOf(ret));
    }

    /**
     * 10進数の各桁の合計値を求める
     * @param number
     * @return
     */
    public int sumOfDigits(int number) {
        int wk = number;
        int sum = 0;
        while (wk > 0) {
            sum += wk % 10;
            wk /= 10;
        }
        return sum;
    }
}
