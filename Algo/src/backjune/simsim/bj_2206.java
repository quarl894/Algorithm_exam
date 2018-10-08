package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
/*
방문 1번 한 것과 안한것을 따로 확인하는 방법
 */

public class bj_2206 {
    static int n,m;
    static int[][] map;
    static boolean[][] visited1;
    static boolean[][] visited2;
    static int[] ax = {1,0,-1,0};
    static int[] ay = {0,-1,0,1};
    static int ans =-1;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        map = new int[n][m];
        visited1 = new boolean[n][m];
        visited2 = new boolean[n][m];

        for(int i=0; i<n; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<ch.length; j++){
                map[i][j] = ch[j] -'0';
            }
        }
        if(n==1 && m==1){
            System.out.println(1);
            return;
        }
        bfs();
        System.out.println(ans);
        br.close();

    }

    private static void bfs(){
        Queue<xy> q = new LinkedList<>();

        q.offer(new xy(0,0,1,0));
        visited1[0][0] = true;
        visited2[0][0] = true;
        while(!q.isEmpty()){
            xy w = q.poll();

            for(int i=0; i<4; i++){
                int dx = w.x +ax[i];
                int dy = w.y +ay[i];

                if(dx>=0 && dx<n && dy>=0 && dy<m) {
                    if (dx == n - 1 && dy == m - 1) {
                        ans = w.cnt + 1;
                        return;
                    }
                    if (map[dx][dy] == 0) {
                        if (w.chk == 0 && !visited1[dx][dy]) {
                            visited1[dx][dy] = true;
                            q.offer(new xy(dx, dy, w.cnt + 1, 0));
                        } else if (w.chk == 1 && !visited2[dx][dy]) {
                            visited2[dx][dy] = true;
                            q.offer(new xy(dx, dy, w.cnt + 1, 1));
                        }
                    } else if (map[dx][dy] == 1 && !visited2[dx][dy]) {
                        if (w.chk == 0) {
                            visited2[dx][dy] = true;
                            q.offer(new xy(dx, dy, w.cnt + 1, 1));
                        }
                    }
                }
            }

        }

    }


    private static class xy{
        int x;
        int y;
        int cnt;
        int chk;


        public xy(int x, int y, int cnt, int chk) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.chk = chk;
        }
    }
}
