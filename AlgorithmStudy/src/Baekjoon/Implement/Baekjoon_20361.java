package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_20361 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
//        int temp = 0;

        for(int i=0; i<K; i++){
            String[] split = br.readLine().split(" ");
            int Ai = Integer.parseInt(split[0]);
            int Bi = Integer.parseInt(split[1]);

            if (Ai == X){
                X = Bi;
            } else if (Bi == X){
                X = Ai;
            }
//            System.out.println("if문 안의 temp는? : "+X);
        }
        System.out.println(X);
    }
}
