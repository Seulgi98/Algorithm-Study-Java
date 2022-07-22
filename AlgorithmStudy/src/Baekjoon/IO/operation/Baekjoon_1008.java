package Baekjoon.IO.operation;

import java.io.*;

public class Baekjoon_1008 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        double num1 = Integer.parseInt(line[0]);
        double num2 = Integer.parseInt(line[1]);

        bw.write(String.valueOf(num1/num2));
        bw.flush();
        bw.close();
    }
}
