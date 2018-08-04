package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bj_1260_2 {
    static int n;
    static int m;
    static int v;
    static int[][] map;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        v = Integer.parseInt(tmp[2]);
        map = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0; i<m; i++){
            String[] t = br.readLine().split(" ");
            int a = Integer.parseInt(t[0]);
            int b = Integer.parseInt(t[1]);
            map[a][b] = map[b][a] = 1;
        }
        dfs(v);
        System.out.println();
        Arrays.fill(visited,false);
        bfs(v);
        br.close();
    }

    private static void dfs(int num){
        visited[num] = true;
        System.out.printf(num + " ");

        for(int i=1; i<=n; i++){
            if(!visited[i] && map[num][i]==1){
                dfs(i);
            }
        }
    }

    private static void bfs(int num){
        Queue<Integer> q = new LinkedList<>();

        q.offer(num);
        visited[num] = true;

        while (!q.isEmpty()){
            int k = q.poll();
            System.out.printf(k+ " ");

            for(int i=1; i<=n; i++){
                if(!visited[i] && map[k][i]==1){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
