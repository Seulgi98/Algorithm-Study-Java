package algo_ws_03_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_11659 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] line1 = br.readLine().split(" ");
		int N = Integer.parseInt(line1[0]);
		int M = Integer.parseInt(line1[1]);
		
		int[][] arr = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++) {
			String[] str = br.readLine().split(" ");
			for(int j=1; j<=N; j++) {
				arr[i][j] = arr[i][j-1] + Integer.parseInt(str[j-1]);
			}
		}	 
		
		for(int i=0; i<M; i++) {
			int sum = 0;
			String[] mLine = br.readLine().split(" ");
			int x1 = Integer.parseInt(mLine[0]);
			int y1 = Integer.parseInt(mLine[1]);
			int x2 = Integer.parseInt(mLine[2]);
			int y2 = Integer.parseInt(mLine[3]);
			for (int j=x1; j<= x2; j++) {
				sum = sum + (arr[j][y2] - arr[j][y1-1]);
			}
			sb.append(sum+"\n");
			System.out.print(sb);			
		}
	}
}
