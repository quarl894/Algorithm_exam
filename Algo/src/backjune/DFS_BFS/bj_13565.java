package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj_13565{
    static int n;
    static int m;
    static int[][] map;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        m = Integer.parseInt(t[1]);
        map = new int[n][m];

        for(int i=0; i<n; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<m; j++){
                map[i][j] = ch[j] -'0';
            }
        }

        for(int i=0; i<m; i++){
            if(map[0][i]==0) bfs(0,i);
        }
        boolean flag = false;

        for(int i=0; i<m; i++){
            if(map[n-1][i]==2){
                flag = true;
                break;
            }
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");
        br.close();

    }

    private static void bfs(int x, int y){
        Queue<xy> q = new LinkedList<>();

        q.offer(new xy(x,y));

        while(!q.isEmpty()){
            xy result = q.poll();

            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};

            for(int i=0; i<4; i++){
                int dx = ax[i] +result.x;
                int dy = ay[i] +result.y;

                if(dx>=0 && dx<n && dy>=0 && dy<m){
                    if(map[dx][dy]==0){
                        map[dx][dy] =2;
                        q.offer(new xy(dx,dy));
                    }
                }
            }
        }
    }

    private static class xy{
        int x;
        int y;

        public xy(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
