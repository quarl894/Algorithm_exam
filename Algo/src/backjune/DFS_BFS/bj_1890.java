package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj_1890 {
    static int n;
    static int[][] map;
    static int ans = 0;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0; i<n; i++){
            String[] tmp = br.readLine().split(" ");
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        bfs(0,0);
        br.close();
    }

    private static void bfs(int x, int y){
        Queue<jump> q = new LinkedList<>();

        q.offer(new jump(x,y));
        visited[x][y] = true;

        while(!q.isEmpty()){
            jump j = q.poll();
            int ax = j.x;
            int ay = j.y;

            int[] dx = {ax+map[ax][ay], ax};
            int[] dy = {ay, ay+map[ax][ay]};

            for(int i=0; i<2; i++){
                if(dx[i]>=0 && dx[i]<n && dy[i]>=0 && dy[i]<n){
                    if(dx[i]==n-1 && dy[i]==n-1) ans++;
                    else if(visited[dx[i]][dy[i]]){
                        if(map[dx[i]][dy[i]]==0){}
                        else ans++;
                    }
                    else{
                        q.offer(new jump(dx[i],dy[i]));
                        visited[dx[i]][dy[i]] = true;
                    }
                }
            }
        }
        System.out.println(ans);
        return;
    }

    private static class jump{
        int x;
        int y;

        public jump(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
