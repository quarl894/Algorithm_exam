package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1937{
    static int[][] map;
    static int[][] panda;
    static int n;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        panda = new int[n][n];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                max = Math.max(max,dfs(i,j));
            }
        }

        System.out.println(max);
    }


    //판다 깊이 우선 탐색으로 돌리기.
    private static int dfs(int x, int y){
        int[] ax = {1,0,-1,0};
        int[] ay = {0,-1,0,1};

        // 0이면 최초방문한것.
        //방문한 것들은 이미 완탐했으므로 max값이 들어있음.
        if (panda[x][y] == 0) {
            panda[x][y] =1;
            for (int k = 0; k < 4; k++) {
                int dx = ax[k] + x;
                int dy = ay[k] + y;
                if (dx >= 0 && dx < n && dy >= 0 && dy < n) {
                    if (map[x][y] < map[dx][dy]) {
                        panda[x][y] = Math.max(panda[x][y], dfs(dx, dy) + 1);
                    }
                }
            }
        }
        return panda[x][y];
    }
}
