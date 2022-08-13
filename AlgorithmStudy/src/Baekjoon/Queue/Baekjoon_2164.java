package Baekjoon.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Baekjoon_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> list = new ArrayDeque<>();

        for(int i=1; i<=N; i++){
            list.addLast(i);
        }

        while (list.size() != 1){
            list.poll();
            list.offerLast(list.poll());
        }
        System.out.println(list.poll());
    }
}
