package Baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_24444 {
    static StringTokenizer st;
    static int N, M, R;
    static List<Integer> []list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        R=Integer.parseInt(st.nextToken());
        list=new ArrayList[N+1];
        for(int i=1;i<=N;i++) list[i]=new ArrayList<>();

        for(int i=0;i<M;i++) {
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }
        for(int i=1;i<=N;i++) Collections.sort(list[i], Collections.reverseOrder());
        bfs(R);
    }

    private static void bfs(int x) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(x);

        boolean []visited=new boolean[N+1];
        visited[x]=true;

        int cnt=0;
        int []order=new int[N+1];
        while(!queue.isEmpty()) {
            int q=queue.poll();
            cnt++;
            order[q]=cnt;

            for(int i:list[q]) {
                if(!visited[i]) {
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }

        for(int i=1;i<=N;i++) System.out.println(order[i]);
    }

}