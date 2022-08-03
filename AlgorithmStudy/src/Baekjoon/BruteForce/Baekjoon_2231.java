package Baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2231 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = 0;

        for(int i=1; i<=N; i++){
            int num = i;
            int sum = 0;

            while (num != 0){
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == N){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}
