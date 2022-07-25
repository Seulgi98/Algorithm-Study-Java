package Baekjoon.Condition;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_1330 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        if(a>b){
            System.out.print(">");
        }
        if(a<b){
            System.out.print("<");
        }
        else if(a==b) {
            System.out.print("==");
        }
    }
}
