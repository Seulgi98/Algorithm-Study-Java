package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_2440 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++){
            for(int j=0;j<N-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
