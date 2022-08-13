package SWEA.D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_1208 {

	public static void main(String[] args) throws Exception {

		/**
		 * 0. 입력파일 읽어들이기
		 */
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// 결과를 한 번에 출력하기 위한 StringBuilder
		
		
		/**
		 * 1. 입력 파일 객체화
		 */
		for (int test_case = 1; test_case <= 10; test_case++) {
			StringBuilder sb = new StringBuilder();
			sb.append("#" + test_case + " ");

			int N = Integer.parseInt(in.readLine());
			int[] boxArray = new int[100];
			String[] box = in.readLine().split(" ");

			for (int i=0; i<100; i++) {
				boxArray[i]=Integer.parseInt(box[i]);				
			}


			/**
			 * 2. 알고리즘 풀기
			 */
			Arrays.sort(boxArray); //배열 정리하기
			for(int i=0; i<N; i++) { //제한횟수까지 반복문
				if(boxArray[99]-boxArray[0]<=1) break; //47, 48같이 차이가 1일 경우엔 break
				boxArray[0]+=1; //최저점은 1씩 추가
				boxArray[99]-=1; //최고점은 1씩 제거
				Arrays.sort(boxArray); //다시 배열 정리
			}

			/**
			 * 3. 정답 출력
			 */
			sb.append(boxArray[99]-boxArray[0]).append("\n"); //최고점-최저점 높이 차이출력
			System.out.print(sb.toString());
		}
	}
}
