package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj_2178_2 {
    static int n;
    static int m;
    static int[][] map;
    static int cnt;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        cnt =0;
        map = new int[n][m];

        //입력 받기.
        for(int i=0; i<n; i++){
            char[] temp = br.readLine().toCharArray();
            for(int j=0; j<m; j++){
                map[i][j] = temp[j] -'0';
            }
        }
        bfs(0,0);
        System.out.println(cnt);
        br.close();


    }

    //bfs 탐색
    private static void bfs(int x, int y){
        Queue<miro> q = new LinkedList<>();
        q.offer(new miro(x,y,1));

        while(!q.isEmpty()){
            miro a = q.poll();

            // 갈 수 있는 방향이 상하좌우이기 떄문에 4가지 탐색.
            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};
            for(int i=0; i<4; i++){
                int dx = ax[i] + a.x;
                int dy = ay[i] + a.y;

                if(dx>=0 && dx<n && dy>=0 && dy<m){
                    // 목적지 도착하면 빠져나옴.
                    if(dx==n-1 && dy==m-1){
                        cnt = a.ans+1;
                        return;
                    }
                    // 길이 있을 때 큐에 집어넣기.
                    if(map[dx][dy]==1){
                        q.offer(new miro(dx,dy,a.ans+1));
                        // 방문 했으면 0 만들어서 재방문 안하게 만듬. (이거 안해서 시간초과 나옴)
                        map[dx][dy] = 0;
                    }
                }

            }
        }

    }

    private static class miro{
        int x;
        int y;
        int ans;

        public miro(int x, int y, int ans) {
            this.x = x;
            this.y = y;
            this.ans = ans;
        }
    }
}
