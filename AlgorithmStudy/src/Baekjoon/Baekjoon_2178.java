package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 희진이의 답
// 미로탐색
public class Baekjoon_2178 {
    static String[] map;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);

        map = new String[n];

        for(int i=0;i<n;i++) map[i] = br.readLine();

        System.out.println(bfs(0,0));

    }

    public static int bfs(int x, int y) {
        int answer=0;
        int dir_x[] = {1,0,-1,0};
        int dir_y[] = {0,1,0,-1};

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        q.add(new int[] {x,y,1});
        visited[x][y]=true;

        while(!q.isEmpty()) {
            int[] aa =q.poll();
            x=aa[0];y=aa[1];

            //도착지점에 도착. 종료.
            if(aa[0]==n-1&&aa[1]==m-1) {
                answer = aa[2];
                break;
            }

            for(int i=0;i<4;i++) {
                int now_x= x+dir_x[i];
                int now_y= y+dir_y[i];

                if(now_x<0||now_x>=n||now_y<0||now_y>=m)continue;

                if(!visited[now_x][now_y] && map[now_x].charAt(now_y)=='1') {
                    q.add(new int[] {now_x,now_y,aa[2]+1});
                    visited[now_x][now_y]=true;
                }
            }
        }

        return answer;
    }
}