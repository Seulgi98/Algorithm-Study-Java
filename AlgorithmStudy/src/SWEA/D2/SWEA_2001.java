package SWEA.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2001 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			String[] line1 = br.readLine().split(" ");
			int N = Integer.parseInt(line1[0]);
			int M = Integer.parseInt(line1[1]);
			
			int[][] map = new int[N][N];
			
			for(int i=0; i<N; i++) {
				String[] str = br.readLine().split(" ");
				for(int j=0; j<N; j++) {
					map[i][j] = Integer.parseInt(str[j]);
				}
			}
			int sum=0;
			int max = 0;
			
			for(int i=0; i<=N-M; i++) {
				for(int j=0; j<=N-M; j++) {
					for(int k=0; k<M; k++) {
						for(int l=0; l<M; l++) {
							sum += map[i+k][j+l];
						}
					}
					max = Math.max(max, sum);
					sum = 0;
				}
			}
			System.out.printf("#%d %d\n", tc, max);
		}
	}
}
