package Baekjoon.BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]); //카드의 수
        int M = Integer.parseInt(line[1]);

        int[] cards = new int[N];
        String[] nums = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            cards[i] = Integer.parseInt(nums[i]);
        }

        int res = 0;
        for(int i=0; i<N-2; i++){
            if(cards[i] > M) continue;

            for(int j=i+1; j<N-1; j++){
                if(cards[i]+cards[j]>M) continue;

                for(int k=j+1; k<N; k++){
                    int sum = cards[i]+cards[j]+cards[k];
                    if(sum == M){
                        res = sum;
                    }
                    if(res < sum && sum < M){
                        res = sum;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
