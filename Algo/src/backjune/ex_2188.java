package backjune;

import java.util.*;
import java.io.*;

public class ex_2188{    
    private static boolean visited[];   
    private static int edges[][], N, M, B[];   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String sp[] = br.readLine().split(" ");
        N = Integer.parseInt(sp[0]);
        M = Integer.parseInt(sp[1]);
        edges = new int[N+1][M+1];
        visited = new boolean[N+1];
        B = new int[N+1];
        
        for(int i = 1; i<=N; i++){
            String sp2[] = br.readLine().split(" ");
            int length = Integer.parseInt(sp2[0]);
            Arrays.fill(edges[i], -1);
            for(int j = 1; j<=length; j++){
                edges[i][j] = Integer.parseInt(sp2[j]);
            }
        }
        
        int result = 0;
        for(int i = 1; i<=N; i++){
            Arrays.fill(visited, false);
            if(dfs(i)) result++;
        }
        System.out.println(result);
        br.close();
    }
    
    private static boolean dfs(int start){
        visited[start] = true;
        for(int i = 1; i<=M; i++){
            if(edges[start][i] == -1) break;
            int v = edges[start][i];
            //아직 방문을 안했거나 || 매칭이 되어 있지만 다른 정점과 매칭을 할 수 있는 상태
            if(B[v] == 0 || (!visited[B[v]] && dfs(B[v]))){
                B[v] = start;
                return true;
            }
        }
        return false;
    }
}