package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_1880 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char keys[] = br.readLine().toCharArray();
        char msg[] = br.readLine().toCharArray();

        for(int i=0; i<msg.length; i++){

            if(msg[i] == ' '){ //공백일때
                System.out.print(msg[i]);
                continue;
            }
            if(msg[i] < 97){ //대문자일때
                msg[i] += 32; //소문자로 변경
                System.out.print((char)(keys[msg[i]-97]-32));
                continue;
            }
            //소문자일때
            System.out.print(keys[msg[i]-97]);
        }

    }
}
