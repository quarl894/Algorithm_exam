package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class bj_1261 {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] chk;
    static int ans;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        map = new int[m][n];
        chk = new boolean[m][n];
        ans = Integer.MAX_VALUE;

        for(int i=0; i<m; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<n; j++){
                map[i][j] = ch[j] - '0';
            }
        }
        bfs(0,0);
        if(n==1 && m==1) System.out.println(0);
        else System.out.println(ans);
        // 1 1 인 경우를 생각안하고 함.
        br.close();

    }

    private static void bfs(int x, int y){
        PriorityQueue<alog> q = new PriorityQueue<>(new Comparator<alog>() {
            @Override
            public int compare(alog o1, alog o2) {
                if(o1.cnt>o2.cnt) return 1;
                else return -1;
            }
        });

        q.offer(new alog(x,y,0));
        chk[x][y] = true;
        while(!q.isEmpty()){
            alog a = q.poll();

            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};

            for(int i=0; i<4; i++){
                int dx = ax[i] + a.x;
                int dy = ay[i] + a.y;


                if(dx>=0 && dx<m && dy>=0 && dy<n){
                    if(dx==m-1 && dy==n-1){
                       // ans = map[dx][dy] == 1 ? a.cnt+1 : a.cnt;
                        int num = a.cnt;
                        ans = Math.min(num,ans);
                        return;
                    }
                    if(!chk[dx][dy]){
                        if(map[dx][dy] == 1) q.offer(new alog(dx,dy,a.cnt+1));
                        else q.offer(new alog(dx,dy,a.cnt));

                        chk[dx][dy] = true;
                    }
                }
            }
        }
        return;

    }

    private static class alog{
        int x;
        int y;
        int cnt;

        public alog(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
