package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_1743 {
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int m;
    static int k;
    static int[] ax = {1,0,-1,0};
    static int[] ay = {0,-1,0,1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        m = Integer.parseInt(t[1]);
        k = Integer.parseInt(t[2]);
        map = new int[n][m];
        visited = new boolean[n][m];
        int max = 0;
        while(k-->0){
            String[] t1 = br.readLine().split(" ");
            map[Integer.parseInt(t1[0])-1][Integer.parseInt(t1[1])-1] = 1;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]==1 && !visited[i][j]){
                    max = Math.max(max,dfs(i,j,1));
                }
            }
        }
        System.out.println(max);
        br.close();

    }

    private static int dfs(int x, int y, int cnt){
        visited[x][y] = true;
        for(int i=0; i<4; i++){
            int dx = ax[i] +x;
            int dy = ay[i] +y;

            if(dx>=0 && dx<n && dy>=0 && dy<m && map[dx][dy]==1){
                if(!visited[dx][dy]){
                  cnt =  dfs(dx,dy, cnt+1);
                }else{
                    continue;
                }
            }
        }
        return cnt;
    }
}
