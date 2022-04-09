package tasks;

import java.util.*;
import java.io.PrintWriter;

/**
 * [要復習]
 *
 * 思ったよりロジックが複雑になってしまい、計算量が自分でよくわからなくなってしまった。
 *
 * https://blog.hamayanhamayan.com/entry/2021/06/07/024320 の解説がわかりやすい。
 *
 * 以下の公式の解説にDFSやBFSというキーワードが出てきたので、そちらも確認したい。
 *
 * https://atcoder.jp/contests/abc204/editorial/1991
 */
public class C {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        HashMap<Integer, ArrayList<Integer>> wk = new HashMap();

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (wk.containsKey(a)) {
                wk.get(a).add(b);
            } else {
                wk.put(a, new ArrayList<>(Arrays.asList(b)));
            }
        }

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            Queue<Integer> queue = new ArrayDeque<>();
            Set<Integer> canGo = new HashSet<>();
            canGo.add(i);
            if (wk.containsKey(i)) {
                queue.addAll(wk.get(i));
            }

            while (!queue.isEmpty()) {
                int wk2 = queue.poll();
                if (wk.containsKey(wk2) && !canGo.contains(wk2)) {
                    queue.addAll(wk.get(wk2));
                }
                canGo.add(wk2);
            }
            ans += canGo.size();
        }
        out.println(ans);
    }
}
