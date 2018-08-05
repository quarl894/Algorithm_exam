package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_14503 {
    static int n;
    static int m;
    static int[][] room;
    static int d;
    static int r;
    static int c;
    static int[] ax = { 0, 1, 0, -1 }; // 북 동 남 서
    static int[] ay = { -1, 0, 1, 0 };
    static int ans;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        m = Integer.parseInt(t[1]);
        visited = new boolean[n][m];
        room = new int[n][m];
        ans =0;

        String[] t2 = br.readLine().split(" ");
        r = Integer.parseInt(t2[0]);
        c = Integer.parseInt(t2[1]);
        d = Integer.parseInt(t2[2]);
        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                room[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
//        if(d==1) d=3;
//        else if(d==3) d=1;

        bfs(r,c,d);
        System.out.println(ans);
        br.close();

    }

    private static void bfs(int x, int y, int d){
        Queue<robot> q = new LinkedList<>();

        q.offer(new robot(x,y,d));
        visited[x][y] = true;
        if(room[x][y]==0) ans++;

        while(!q.isEmpty()){
            robot ro = q.poll();
            int cd = ro.d;
            //현재 청소
            if(room[ro.x][ro.y]==0 && visited[ro.x][ro.y]==false) ans++;
            boolean chk = false;

            for(int i= 0; i<4; i++){
                cd = turnDirection(cd);
                int dx = ro.x + ax[cd];
                int dy = ro.y + ax[cd];

                //4방향이 다 막혀있지는 않은 상태 2-1, 2-2상태
                if(dx>=0 && dx<n && dy>=0 && dy<m){
                    if(visited[dx][dy]==false && room[dx][dy]==0){
                        visited[dx][dy] = true;
                        //int di = direct(ax[i],ay[i]);
                        q.offer(new robot(dx,dy,cd));
                        ans++;
                        chk = true;
                        break;
                    }
                }
            }
            if(!chk){
                cd = backDirection(ro.d);
                int d1 = ax[cd] +ro.x;
                int d2 = ay[cd] +ro.y;
                if(d1>=0 && d1<n && d2>=0 && d2<m){
                    if(room[d1][d2]==0){
                        q.offer(new robot(d1,d2,ro.d));
                        break;
                    }
                    else return;
                }else return;

            }
        }
        return;

    }

    private static int direct(int x, int y){
//        static int[] ax = {-1,0,1,0,-1,0,1,0};
//        static int[] ay = {0,-1,0,1,0,-1,0,1};
        if(x==-1) return 3;
        if(y==1) return 2;
        if(x==1) return 1;
        if(y==-1) return 0;
        return -1;
    }

    private static class robot{
        int x;
        int y;
        int d;

        public robot(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    public static int backDirection(int d) {
        if (d == 0) {
            return 2;
        } else if (d == 1) {
            return 3;
        } else if (d == 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int turnDirection(int d) {
        // 0 북, 1 동, 2 남, 3 서
        if (d == 0) {
            return 3;
        } else if (d == 1) {
            return 0;
        } else if (d == 2) {
            return 1;
        } else {
            return 2;
        }
    }

}
