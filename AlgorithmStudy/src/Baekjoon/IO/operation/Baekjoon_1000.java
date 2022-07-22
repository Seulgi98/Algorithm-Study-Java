package Baekjoon.IO.operation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1000 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");

        int num1 = Integer.parseInt(line[0]);
        int num2 = Integer.parseInt(line[1]);

        System.out.println(num1+num2);
    }
}
