package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_9376 {
    static int r;
    static int c;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while(n-->0){
            String[] t = br.readLine().split(" ");
            r = Integer.parseInt(t[0]);
            c = Integer.parseInt(t[1]);
            int[][] prison = new int[r][c];
            xy a1 = new xy(-1,-1);
            xy a2 = new xy(-1,-1);

            for(int i=0; i<r; i++){
                char[] ch = br.readLine().toCharArray();
                for(int j=0; j<c; j++){
                    prison[i][j] = ch[j];
                    if(ch[j]=='$' && a1.x==-1) a1= new xy(i,j);
                    else if(ch[j]=='$' && a1.x!=-1) a2= new xy(i,j);
                }
            }
            boolean[][][][] visited = new boolean[100][100][100][100];
            bfs(prison, a1,a2, visited);
        }
    }

    private static void bfs(int[][] prison, xy a1, xy a2, boolean[][][][] visited){
        Queue<tal> q = new LinkedList<>();
        q.offer(new tal(a1,a2,0));

        while(!q.isEmpty()){{
            tal t = q.poll();
            int c = t.cnt;
            if(t.x.x>=0 && t.x.x<r && t.x.y>=0 && t.x.y<c && t.y.x>=0 && t.y.y<r && t.y.x>=0 && t.y.y<c){
                int[] ax = {1,0,-1,0};
                int[] ay = {0,-1,0,1};

                for(int i=0; i<4; i++){
                    int m1 = ax[i] + t.x.x;
                    int m2 = ay[i] + t.x.y;
                    for(int j=0; j<4; j++){
                        int m3 = ax[j] + t.y.x;
                        int m4 = ay[j] + t.y.y;
                        if(!visited[m1][m2][m3][m4]){
                            if(prison[m1][m2]=='*' && prison[m3][m4]=='*'){
                                q.offer(new tal(new xy(m1,m2),new xy(m3,m4),c));
                                visited[m1][m2][m3][m4] = true;
                            }


                        }
                    }
                }
            }
        }}

    }

    private static class tal{
        xy x;
        xy y;
        int cnt;

        public tal(xy x, xy y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
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
