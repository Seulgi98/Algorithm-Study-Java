package Baekjoon.BFS;

import java.util.LinkedList;
import java.util.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1697 {
    static int n, k;
    static int[] arr = new int[100001];
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n >= k) {
            System.out.println(n - k);
        } else {
            System.out.println(bfs());
        }

    }

    static int bfs() {
        q.add(n);
        arr[n] = 1;

        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0)
                    next = x - 1;
                else if (i == 1)
                    next = x + 1;
                else
                    next = x * 2;

                if (next == k)
                    return arr[x];

                if (next >= 0 && next < 100001 && arr[next] == 0) {
                    arr[next] = arr[x] + 1;
                    q.add(next);
                }
            }
        }
        return 0;
    }

}
