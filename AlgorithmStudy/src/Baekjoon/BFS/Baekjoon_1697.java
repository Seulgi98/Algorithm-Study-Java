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
            System.out.println(n - k); //수빈위치 - 동생위치
            // 수빈이 시작위치가 동생보다 크면 무조건 -1해서 만나야하니까 n-k출력
        } else {
            System.out.println(bfs()); //bfs출력
        }

    }

    static int bfs() {
        q.add(n);
        arr[n] = 1; //현재위치 값 1로 변경

        // 큐가 비지 않을 동안 while문 돌고, 다음 next위치를 변경
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

                if (next == k) //동생 찾았을때
                    return arr[x];

                //next가 범위 내에 있고 방문한 이력이 없으면 큐에 넣어줌
                if (next >= 0 && next < 100001 && arr[next] == 0) {
                    arr[next] = arr[x] + 1; // 걸음수 설정
                    q.add(next);
                }
            }
        }
        return 0;
    }

}
