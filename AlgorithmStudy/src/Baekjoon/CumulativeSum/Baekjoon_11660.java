package algo_ws_03_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] line1 = br.readLine().split(" ");
		int N = Integer.parseInt(line1[0]);
		int M = Integer.parseInt(line1[1]);

		int[] nums = new int[N];
		int[] sum = new int[N+1];
		sum[0] = 0;
		String[] line2 = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(line2[i]);
		}
		
		for(int i=1; i<=N; i++) {
			sum[i] = sum[i-1] + nums[i-1];
		}
		
		for(int i=0; i<M; i++) {
			String[] line3 = br.readLine().split(" ");
			int startIdx = Integer.parseInt(line3[0]);
			int endIdx = Integer.parseInt(line3[1]);
		
			System.out.println(sum[endIdx] - sum[startIdx-1]);
		}
	}
}
