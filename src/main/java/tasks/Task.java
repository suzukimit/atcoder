package tasks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;

public class Task {
    HashMap<Integer, Integer> callCount = new HashMap<>();

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String seed = in.next();
        int n = in.nextInt();
        long ans = calc(n);
        for (Map.Entry<Integer, Integer> entry: callCount.entrySet()) {
            ans += call(seed, entry.getKey()) * entry.getValue();
        }
        out.println(calc(n));
    }

    private long calc(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n % 2 == 0) {
            return calc(n - 1)  + calc(n - 2) - calc(n - 3) - calc(n - 4);
        } else {
            if (callCount.containsKey(n)) {
                callCount.put(n, callCount.get(n) + 1);
            } else {
                callCount.put(n, 1);
            }
            return 0;
        }
    }

    private long call(String seed, int n) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            //TODO クエリパラメータを無理やり埋め込む
            HttpRequest req = HttpRequest.newBuilder()
                    .uri(URI.create("http://challenge-server.code-check.io/api/recursive/ask?seed=" + seed + "&n=" + n))
                    .build();
            HttpResponse res = client.send(req, HttpResponse.BodyHandlers.ofString());
            return 100;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
