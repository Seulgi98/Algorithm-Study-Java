package Baekjoon.IO.operation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_10430 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");

        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);

        bw.write(String.valueOf((a+b)%c+"\n"));
        bw.write(String.valueOf(((a%c)+(b%c))%c+"\n"));
        bw.write(String.valueOf((a*b)%c+"\n"));
        bw.write(String.valueOf(((a%c)*(b%c))%c));

        bw.flush();
        bw.close();
    }
}
