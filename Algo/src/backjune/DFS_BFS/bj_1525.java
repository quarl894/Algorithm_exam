package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_1525 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[3][3];
        xy t = new xy(0,0,0, map,null);
        boolean[][] visited = new boolean[3][3];

        for(int i=0; i<3; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                map[i][j] = Integer.parseInt(stk.nextToken());
                if(map[i][j]==0) t = new xy(i,j,0, map,visited);
            }
        }
        bfs(t.x, t.y,map,visited);


    }

    private static void bfs(int x, int y, int[][] map, boolean[][] visited){
        Queue<xy> q = new LinkedList<>();
        boolean[][] v = visited;
        v[x][y] = true;
        q.offer(new xy(x,y,0, map, v));
        while(!q.isEmpty()){
            xy result = q.poll();
            int[][] bingo = result.map;
            boolean[][] visit = result.visited;


            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};

            for(int i=0; i<4; i++){
                int dx = ax[i] +result.x;
                int dy = ay[i] +result.y;

                if(dx>=0 &&dx<3 && dy>=0 && dy<3){
                    if(dx==2 && dy==2 && !visit[dx][dy]){
                        visit[dx][dy] = true;
                        int temp = bingo[dx][dy];
                        bingo[dx][dy] = bingo[result.x][result.y];
                        bingo[result.x][result.y] = temp;
                        if(test(bingo)){
                            System.out.println(result.cnt + 1);
                            return;
                        }
                    }

                    if(!visit[dx][dy]){
                        visit[dx][dy] = true;
                        int temp = bingo[dx][dy];
                        bingo[dx][dy] = bingo[result.x][result.y];
                        bingo[result.x][result.y] = temp;
                        q.offer(new xy(dx,dy,result.cnt+1,bingo, visit));
                    }
                }
            }
        }
        System.out.println(-1);
        return;


    }

    private static boolean test(int[][] map){
        int num =1;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(map[i][j] != num) return false;
                num++;
                if(num==9) num =0;
            }
        }
        return true;
    }

    private static class xy{
        int x;
        int y;
        int cnt;
        int[][] map;
        boolean[][] visited;

        public xy(int x, int y, int cnt, int[][] map, boolean[][] visited) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.map = map;
            this.visited = visited;
        }
    }
}
