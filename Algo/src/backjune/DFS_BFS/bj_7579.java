package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_7579 {
    static int m;
    static int n;
    static int[][] map;
    static int ans;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        m = Integer.parseInt(tmp[0]); //y
        n = Integer.parseInt(tmp[1]); //x
        map = new int[n][m];
        ans = 0;
        ArrayList<toma> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(stk.nextToken());
                // 먼저 토마토가 익은 곳은 저장함.
                if(map[i][j]==1) arr.add(new toma(i,j,0));
            }
        }
        bfs(arr);
        if(chked()) System.out.println(ans);
        else System.out.println(-1);
        br.close();

    }

    private static void bfs(ArrayList<toma> arr){
        Queue<toma> q = new LinkedList<>();
        // 동시에 시작해야하므로 익은 곳은 처음에 넣어줌.
        for(int i=0; i<arr.size(); i++) q.offer(new toma(arr.get(i).x,arr.get(i).y,0));

        while(!q.isEmpty()){

            toma t = q.poll();
            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};
            ans = t.cnt;

            for(int i=0; i<4; i++){
                int dx = ax[i] +t.x;
                int dy = ay[i] +t.y;

                if(dx>=0 && dx<n && dy>=0 && dy<m){
                    if(map[dx][dy]==0){
                        q.offer(new toma(dx,dy,t.cnt+1));
                        map[dx][dy] = 1;
                    }
                }
            }
        }
        return;
    }
    // 모두 익지 못하는 경우 있는지 체크
    private static boolean chked(){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] == 0) return false;
            }
        }
        return true;
    }

    private static class toma{
        int x;
        int y;
        int cnt;

        public toma(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
