package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj_2206 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static boolean[][] visited2;
    static boolean[][] visited3;
    static int[] ax = {1,0,-1,0};
    static int[] ay = {0,-1,0,1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        m = Integer.parseInt(t[1]);
        map = new int[n][m];
        visited = new boolean[n][m];
        visited2 = new boolean[n][m];
        visited3 = new boolean[n][m];
        for(int i=0; i<n; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<m; j++){
                map[i][j] = ch[j] -'0';
            }
        }
        if(n==1 && m==1){
            System.out.println(1);
            return;
        }
        bfs(0,0);
        br.close();

    }

    private static void bfs(int x, int y){
        Queue<wall> q = new LinkedList<>();
        boolean flag = false;
        int ans = 0;

        q.offer(new wall(x,y,1,false));
        visited[x][y] = true;
        visited2[x][y] = true;
        Loop: while(!q.isEmpty()){
            wall w = q.poll();

            for(int i=0; i<4; i++){
                int dx = w.x +ax[i];
                int dy = w.y +ay[i];

                if(dx>=0 && dx<n && dy>=0 && dy<m){
                    if(dx==n-1 && dy==m-1){
                        flag = true;
                        ans = w.cnt+1;
                        break Loop;
                    }
                    if(map[dx][dy]==0){
                        if(!w.chk && !visited[dx][dy]) {
                            visited[dx][dy] = true;
                            q.offer(new wall(dx, dy, w.cnt + 1, w.chk));
                        }else if(!visited2[dx][dy] && w.chk){
                            visited2[dx][dy] = true;
                            q.offer(new wall(dx,dy,w.cnt+1, w.chk));
                        }
                    }else if(map[dx][dy]==1 && !visited2[dx][dy]){
                        if(!w.chk){
                            visited2[dx][dy] = true;
                            q.offer(new wall(dx,dy,w.cnt+1, true));
                        }
                    }
                }
            }
        }

        if(flag) System.out.println(ans);
        else System.out.println(-1);

    }

    private static class wall{
        int x;
        int y;
        int cnt;
        boolean chk;

        public wall(int x, int y, int cnt, boolean chk) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.chk = chk;
        }
    }
}
