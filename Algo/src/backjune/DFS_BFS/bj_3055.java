package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj_3055 {
    static int r;
    static int c;
    static char[][] map;
    static xy s;
    static xy d;
    static Queue<xy> q = new LinkedList<>();
    static boolean[][] visited;
    static boolean[][] visited2;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        r = Integer.parseInt(t[0]);
        c = Integer.parseInt(t[1]);

        map = new char[r][c];
        visited = new boolean[r][c];
        visited2 = new boolean[r][c];

        for(int i=0; i<r; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<c; j++){
                map[i][j] = ch[j];
                if(ch[j]=='S'){
                    s= new xy(i,j,ch[j],0);
                }else if(ch[j] == 'D'){
                    d = new xy(i,j,ch[j],0);
                }else if(ch[j]=='*'){
                    q.offer(new xy(i,j,ch[j],0));
                }
            }
        }
        bfs(s.x, s.y,'S');
        br.close();

    }

    private static void bfs(int x, int y, char ch){
        q.offer(new xy(x,y,ch,0));
        visited[x][y] = true;

        while(!q.isEmpty()){
            xy result = q.poll();

            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};

            for(int i=0; i<4; i++){
                int dx = ax[i] + result.x;
                int dy = ay[i] + result.y;

                if(dx>=0 && dx<r && dy>=0 && dy<c){
                    if(map[dx][dy]=='.' && result.ch=='*' && !visited[dx][dy]){
                        map[dx][dy] = '*';
                        visited[dx][dy] = true;
                        q.offer(new xy(dx,dy,result.ch,0));
                    }else if(map[dx][dy]=='.' && result.ch=='S' && !visited2[dx][dy]){
                        map[dx][dy] = 'S';
                        visited2[dx][dy] = true;
                        q.offer(new xy(dx,dy,result.ch,result.cnt+1));
                    }else if(dx == d.x && dy==d.y && result.ch=='S'){
                       System.out.println(result.cnt+1);
                        return;
                    }
                }
            }
        }
        System.out.println("KAKTUS");
        return;

    }

    private static class xy{
        int x;
        int y ;
        char ch;
        int cnt;

        public xy(int x, int y, char ch, int cnt) {
            this.x = x;
            this.y = y;
            this.ch = ch;
            this.cnt =cnt;
        }
    }
}
