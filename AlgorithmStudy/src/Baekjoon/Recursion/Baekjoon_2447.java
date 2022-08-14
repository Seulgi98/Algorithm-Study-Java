package Baekjoon.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2447 {
    static char[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        star(0, 0, N, false);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static void star(int x, int y, int n, boolean b) {
        if (b) { //공백일 때
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 더 이상 못 쪼갤때
        if(n==1){
            arr[x][y] = '*';
            return;
        }

        int blockSize = n/3;
        int starCnt = 0;
        for(int i=x; i<x+n; i+=blockSize){
            for(int j=y; j<y+n; j+=blockSize){
                starCnt++;
                if(starCnt == 5){
                    star(i, j, blockSize, true);
                } else {
                    star(i, j, blockSize, false);
                }
            }
        }

    }
}

