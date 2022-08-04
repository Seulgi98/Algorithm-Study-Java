package algo_ws_02_2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	static int[] dx = {0, 0, -1}; //좌우상
	static int[] dy = {-1, 1, 0}; //좌우상
	
	public static void main(String[] args) throws Exception {

		/**
		 * 0. 입력파일 읽어들이기
		 */
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// 결과를 한 번에 출력하기 위한 StringBuilder
		StringBuilder sb = new StringBuilder();

		/**
		 * 1. 입력 파일 객체화
		 */	
		int[][] map = new int[100][100];
		
		
		for(int tc=1; tc<=10; tc++) {
			int T = Integer.parseInt(in.readLine());
			
			for(int i=0; i<100; i++) {
				String[] str = in.readLine().split(" ");
				for(int j=0; j<100; j++) {
					map[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			int startX = 0; // 시작좌표 x
			int startY = 0; // 시작좌표 y
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					if(map[i][j] == 2) { // 시작좌표가 2라면(끝에서부터 시작)
						startX = i; //현재위치로 좌표 변경해줌
						startY = j;
					}
				}
			}
			while(startX > 0) { // 네모 크기보다 클 때
				for(int d = 0; d < 3; d++) { //3방탐색
					//탐색할 방향의 X 좌표는 X+DX이다.
					int x = startX+dx[d]; //x는 탐색하여 이동할 좌표
					int y = startY+dy[d]; //y는 탐색하여 이동할 좌표
					if(y>=0 && y<100 && map[x][y] == 1) { //범위 내이면서 xy가 1일때
						map[startX][startY] = -1; // 뒤로 가지 않도록 마킹함
						startX = x; //x좌표변경
						startY = y; //y좌표변경
						break;
					}
				}
			}
			System.out.printf("#%d %d\n", tc, startY);
		}
		
	}
}
