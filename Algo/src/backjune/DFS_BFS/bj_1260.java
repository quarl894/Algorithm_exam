package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_1260 {
    static int[][] gp;
    static private boolean[] visited;
    static private int N ;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sp[] = br.readLine().split(" ");

        N = Integer.parseInt(sp[0]); //정점
        int M = Integer.parseInt(sp[1]); //간선
        int V = Integer.parseInt(sp[2]); //탐색시작 번호

        gp = new int[N+1][N+1];
        visited = new boolean[N+1];
        for(int i=1; i<=M; i++){
            String[] sp2 = br.readLine().split(" ");
            int t1 = Integer.parseInt(sp2[0]);
            int t2 = Integer.parseInt(sp2[1]);

            gp[t1][t2] = gp[t2][t1] = 1;
        }

        br.close();
        dfs(V);
        System.out.println();
        for(int i=0; i<=N; i++) visited[i] = false;
        bfs(V);
    }

    private static void dfs(int num){
        visited[num] = true;
        System.out.print(num + " ");

        for(int i=1; i<=N; i++){
            if(gp[num][i]==1 && visited[i]==false){
                dfs(i);
            }
        }
    }

    private static void bfs(int num){
        Queue<Integer > q = new LinkedList<>();

        q.offer(num);
        visited[num] = true;

        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp + " ");
            for(int i=1; i<=N; i++){
                if(gp[temp][i] ==1 && visited[i] == false){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}


