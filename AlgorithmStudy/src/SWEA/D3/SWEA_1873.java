package SWEA.D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class SWEA_1873 {
	static int[] dx = {0, 1, 0, -1}; //R:[0] D:[1] L:[2] U:[3]
	static int[] dy = {1, 0, -1, 0}; //우하좌상
	static int dir = 0;
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for(int tc=1; tc<=1; tc++) {
			String[] line = br.readLine().split(" ");

			int h = Integer.parseInt(line[0]);
			int w = Integer.parseInt(line[1]);

			char[][] hw = new char[h][w];

			for(int i=0; i<h; i++) {
				String str = br.readLine();
				for(int j=0; j<w; j++) {
					hw[i][j] = str.charAt(j);
				}
			}

			int num = Integer.parseInt(br.readLine());
			String[] cmd = br.readLine().split("");
			for(int i=0; i<cmd.length; i++) {
				System.out.print(cmd[i]);
			}
			int pointX = -1;
			int pointY = -1;
			int x;
			int y;

			//구현
			//탱크 찾기
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(hw[i][j] == '^') {
						dir = 3;
						pointX = i;
						pointY = j;

					}
					else if(hw[i][j] == '<') {
						dir = 2;
						pointX = i;
						pointY = j;
					}
					else if(hw[i][j] == '>') {
						dir = 0;
						pointX = i;
						pointY = j;
					}
					else if(hw[i][j] == 'v') {
						dir = 1;
						pointX = i;
						pointY = j;
					}
				}
			}
			//명령어
			for(int i=0; i<num; i++) {
				if(cmd[i] == "S") {

				}
				else if(cmd[i] == "R") {
					dir = 0; //방향바꾸기
					x = pointX+dx[dir]; //한칸 이동
					y = pointY+dy[dir]; //한칸 이동
					if(x < 0 || x > h || y <0 || y>w || hw[x][y] == '#' || hw[x][y] == '*' || hw[x][y] == '-') {
						x = pointX;
						y = pointY;
					}
				}
				else if(cmd[i] == "D") {
					dir = 1;
					x = pointX+dx[dir]; //한칸 이동
					y = pointY+dy[dir];
					if(x < 0 || x > h || y <0 || y>w || hw[x][y] == '#' || hw[x][y] == '*' || hw[x][y] == '-') {
						x = pointX;
						y = pointY;
					}
				}
				else if(cmd[i] == "L") {
					dir = 2;
					x = pointX+dx[dir]; //한칸 이동
					y = pointY+dy[dir];
					if(x < 0 || x > h || y <0 || y>w || hw[x][y] == '#' || hw[x][y] == '*' || hw[x][y] == '-') {
						x = pointX;
						y = pointY;
					}
				}
				else if(cmd[i] == "U") {
					dir = 3;
					x = pointX+dx[dir]; //한칸 이동
					y = pointY+dy[dir];
					if(x < 0 || x > h || y <0 || y>w || hw[x][y] == '#' || hw[x][y] == '*' || hw[x][y] == '-') {
						x = pointX;
						y = pointY;
					}
				}
			}
		}
	}
}
