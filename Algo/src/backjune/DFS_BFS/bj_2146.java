package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bj_2146 {
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int num;
    static int min = Integer.MAX_VALUE;
    static int[] ax = {1,0,-1,0};
    static int[] ay = {0,1,0,-1};
    static int index;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        num = 2;
        HashSet<Integer> chk = new HashSet<>();
        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int j=0;
            while(stk.hasMoreTokens()){
                map[i][j++] = Integer.parseInt(stk.nextToken());
            }
        }

        //대륙 구분하기
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && map[i][j]==1){
                    bfs(new xy(i,j,0));
                    num+=1;
                }
            }
        }

        //다리 찾기
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]!=0){
                    index = map[i][j];
                    result_bfs(new xy(i,j,0));
                    chk.add(index);
                    clear();
                }
            }
        }

        System.out.println(min);
        br.close();



    }

    private static void result_bfs(xy s){
        Queue<xy> q = new LinkedList<>();

        q.offer(s);
        visited[s.x][s.y] = true;

        while(!q.isEmpty()){
            xy tmp = ((LinkedList<xy>) q).pop();

            for(int i=0; i<4; i++){
                int dx = tmp.x + ax[i];
                int dy = tmp.y + ay[i];

                if(dx>=0 && dx<n && dy>=0 && dy<n){
                    if(!visited[dx][dy]){
                        if(map[dx][dy]==0) {
                            visited[dx][dy] = true;
                            q.offer(new xy(dx, dy, tmp.cnt + 1));
                        }else if(map[dx][dy]!=0 && map[dx][dy]!=index){
                            if(tmp.cnt!=0) {
                                min = Math.min(min, tmp.cnt);
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    //방문 초기화
    private static void clear(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                visited[i][j] = false;
            }
        }
    }

    //대륙 구분하기 숫자로 나눔 2부터 시작.
    private static void bfs(xy s){
        Queue<xy> q = new LinkedList<>();

        q.offer(s);

        visited[s.x][s.y] = true;
        map[s.x][s.y] = num;

        while(!q.isEmpty()){
            xy tmp = ((LinkedList<xy>) q).pop();

            for(int i=0; i<4; i++){
                int dx = ax[i] +tmp.x;
                int dy = ay[i] +tmp.y;

                if(dx>=0 && dx<n && dy>=0 && dy<n){
                    if(!visited[dx][dy] && map[dx][dy]==1){
                        visited[dx][dy] = true;
                        q.offer(new xy(dx,dy,0));
                        map[dx][dy] = num;
                    }
                }
            }
        }

    }



    private static class xy{
        int x;
        int y;
        int cnt;

        public xy(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
