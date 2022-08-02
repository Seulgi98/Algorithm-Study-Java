package SWEA.D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2805 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 결과를 한 번에 출력하기 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int N =  Integer.parseInt(br.readLine());
            int[][] farm = new int[N][N];
            int sum = 0;

            for(int i=0; i<N; i++) {
                String[] str = br.readLine().split("");
                for(int j=0; j<N; j++) {
                    farm[i][j] = Integer.parseInt(str[j]);
                }
            }
            // 윗 삼각형
            for(int i=0; i<N/2; i++) {
                for(int j=(N/2)-i; j<=(N/2)+i; j++) {
                    sum += farm[i][j];
                }
            }
            // 아래 삼각형
            for(int i=N/2; i>=0; i--) {
                for(int j=(N/2)-i; j<=(N/2)+i; j++) {
                    sum += farm[N-i-1][j];
                }
            }
            System.out.printf("#%d %d\n", test_case, sum);
        }
    }
}
