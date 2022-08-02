package SWEA.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_1954 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];

            for (int i = 0; i < arr.length; i++) {
                Arrays.fill(arr[i], 0);
            }

            int dir = 0;
            int x = 0;
            int y = 0;
            int lastNum = N * N;
            int num = 1;
            arr[0][0] = 1;

            while (num < lastNum) {
                x = x + dx[dir];
                y = y + dy[dir];

                if (x >= N || y >= N || x < 0 || y < 0 || arr[x][y] != 0) {
                    x = x - dx[dir];
                    y = y - dy[dir];
                    dir = (dir + 1) % 4;
                    continue;
                }
                num += 1;
                arr[x][y] = num;
            }
            System.out.printf("#%d\n", tc);
            for (int[] a : arr) {
                for (int k : a) {
                    System.out.printf("%d ", k);
                }
                System.out.println();
            }
        }
    }
}

