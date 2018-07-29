package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_14502 {
    static int n;
    static int m;
    static int[][] a;
    static int max;
    static int[][] map;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");

        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        a = new int[n][m];
        max = Integer.MIN_VALUE;
        map = new int[n][m];

        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                a[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        block(a,0, 0, 0);
        System.out.println(max);
        br.close();

    }

    private static void block(int[][] a, int len, int x, int y){
        if(len ==3){
            clear(a);
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(map[i][j]==2)
                        bfs(i,j);
                }
            }
            max = Math.max(chked(map),max);
            return;
            //체크하러 가야 함.리턴안해주면 무한루프돔!!!!
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j] == 0 ){
                    a[i][j] = 1;
                    block(a,len+1, i,j);
                    a[i][j] = 0;
                }
            }
        }
        return;
    }

    private static void bfs(int x, int y){
        //바이러스 퍼트리기.
        Queue<xy> q = new LinkedList<>();
        q.offer(new xy(x,y));
        while(!q.isEmpty()){
            xy tmp = ((LinkedList<xy>) q).pop();
            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};

            for(int i=0; i<4; i++){
                int dx = tmp.x + ax[i];
                int dy = tmp.y + ay[i];

                if(dx>=0 && dx<n && dy>=0 && dy<m){
                    if(map[dx][dy]==0) {
                        map[dx][dy] = 3;
                        q.offer(new xy(dx,dy));
                    }
                }
            }
        }

    }

    private static int chked(int[][] a){
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }

    private static class xy{
        int x;
        int y;

        public xy(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static void clear(int[][] a){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = a[i][j];
            }
        }
    }
}
