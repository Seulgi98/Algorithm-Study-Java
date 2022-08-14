package Baekjoon.Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, N) - 1)).append('\n'); //math.pow = 제곱함수

        hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }

    private static void hanoi(int n, int start, int temp, int dest) {
        //종료조건(이동할 원반 수가 1개일때)
        if(n==1){
            sb.append(start + " " + dest + "\n");
            return;
        }
        //첫번째 이동
        hanoi(n-1, start, dest, temp);
        //두번째 이동(마지막 1개만 출발지에서 도착지로)
        sb.append(start + " " + dest + "\n");
        //세번째 이동(나머지 n-1개 도착지로)
        hanoi(n-1, temp, start, dest);

    }
}
