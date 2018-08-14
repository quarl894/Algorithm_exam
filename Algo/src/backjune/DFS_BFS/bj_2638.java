package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_2638{
    static int n;
    static int m;
    static int[][] map;
    static int res = 0;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        m = Integer.parseInt(t[1]);
        map = new int[n][m];
        int cnt = 0;
        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(stk.nextToken());
                if(map[i][j]==1) res++;
            }
        }
        if(res==0){
            System.out.println(0);
            return;
        }

        do{
            cnt++;
        }while(!bfs());

        System.out.println(cnt);
        br.close();
    }

    public static boolean bfs(){
        Queue<xy> q = new LinkedList<>();
        q.offer(new xy(0,0));
        int[][] visited = new int[n][m];

        while(!q.isEmpty()){
            xy result = q.poll();
            int[] ax= {1,0,-1,0};
            int[] ay= {0,-1,0,1};

            for(int i=0; i<4; i++){
                int dx = ax[i] +result.x;
                int dy = ay[i] +result.y;

                if(dx>=0 && dx<n && dy>=0 && dy<m){
                    if(map[dx][dy]==0 && visited[dx][dy]==0){
                        visited[dx][dy]= 2;
                        q.offer(new xy(dx,dy));
                    }else if(map[dx][dy]==1 && visited[dx][dy]==0){
                        visited[dx][dy] +=1;
                    }else if(map[dx][dy]==1 && visited[dx][dy]==1){
                        map[dx][dy]=0;
                        visited[dx][dy] =2;
                    }
                }
            }
        }

        boolean flag = true;

        Loop : for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j]==1){
                    flag= false;
                    break Loop ;
                }
            }
        }
        return flag;
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

