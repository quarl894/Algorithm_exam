package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj_2573 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] chk;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        m = Integer.parseInt(t[1]);
        map = new int[n][m];
        chk = new boolean[n][m];

        for(int i=0; i<n; i++){
            String[] tmp = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        int ans = 1;
        int result = 0;
        while (ans==1) {
            ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] != 0 && chk[i][j]==false) {
                        bfs(i, j);
                        ans+=1;
                    }
                }
            }
            clean();
            result++;
        }
        if(ans==0) System.out.println(0);
        else System.out.println(result-1);
        br.close();


    }

    private static void bfs(int x, int y){
        Queue<xy> q = new LinkedList<>();
        int[][] tmp = new int[n][m];
        tmp = clear(map);

        q.offer(new xy(x,y));
        chk[x][y] = true;

        while(!q.isEmpty()){
            xy bing = q.poll();

            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};
            int cnt = 0;

            for(int i=0; i<4; i++){
                int dx = ax[i] + bing.x;
                int dy = ay[i] + bing.y;

                if(dx>=0 && dx<n && dy>=0 && dy<m){
                    if(map[dx][dy]==0){
                        cnt++;
                    }else if(map[dx][dy]!=0 && chk[dx][dy]==false){
                        q.offer(new xy(dx,dy));
                        chk[dx][dy] = true;
                    }
                }
            }
            tmp[bing.x][bing.y] -=cnt;
            if(tmp[bing.x][bing.y]<0) tmp[bing.x][bing.y] = 0;
        }
        map = clear(tmp);
        return;
    }

    private static class xy{
        int x;
        int y;

        public xy(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[][] clear(int[][] arr){
        int[][] t = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                t[i][j] = arr[i][j];
            }
        }
        return t;
    }

    private  static void clean(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                chk[i][j]= false;
            }
        }
    }

}
