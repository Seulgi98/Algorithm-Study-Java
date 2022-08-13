package Baekjoon.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10872 {
    static int res = 1;
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        fato(N);
        System.exit(0);
    }
    //10! = 10*9*8*7*6*5*4*3*2*1
    //n! = n*(n-1)*(n-2)*..*(n-9)
    private static void fato(int n) {
        if(n == 1 || n == 0){
            System.out.print(res);
            return;
        }
        res = n*res;

        fato(n-1);
    }
}
