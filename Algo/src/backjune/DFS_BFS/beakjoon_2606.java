package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beakjoon_2606 {
    static boolean visited[];
    static int graph[][];
    static int N;
    static int count =0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        int num = Integer.parseInt(br.readLine());
        visited = new boolean[N];
        Arrays.fill(visited, false);

        for(int i=0; i<num; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(stk.nextToken())-1;
            int n2 = Integer.parseInt(stk.nextToken())-1;
            graph[n1][n2] = 1;
            graph[n2][n1] = 1;
        }

        System.out.println(bfs(0));
        br.close();

    }
    public static int bfs(int i){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visited[i] = true;

        int temp;
        while(!q.isEmpty()){
            temp = q.poll();
            for(int j=0; j<N; j++){
                if(graph[temp][j]==1 && visited[j]==false){
                    q.offer(j);
                    visited[j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
