package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bj_2667_2 {
    static int n ;
    static int[][] map;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr= new ArrayList<>();
        map = new int[n][n];

        for(int i=0; i<n; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<n; j++){
                map[i][j] = (ch[j] - '0');
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1){
                    arr.add(bfs(i,j));

                }
            }
        }
        Collections.sort(arr);
        StringBuilder st = new StringBuilder();
        st.append(arr.size()+"\n");
        for(int a: arr) st.append(a +"\n");
        System.out.print(st.toString());
        br.close();


    }

    private static int bfs(int x, int y){
        Queue<xy> q = new LinkedList<>();
        int ans = 1;

        map[x][y] = 0;
        q.offer(new xy(x,y));
        while(!q.isEmpty()){
            xy t = q.poll();

            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};

            for(int i=0; i<4; i++){
                int dx = ax[i] +t.x;
                int dy = ay[i] +t.y;

                if(dx>=0 && dy>=0 && dx<n && dy<n){
                    if(map[dx][dy]==1){
                        q.offer(new xy(dx,dy));
                        ans++;
                        map[dx][dy] = 0;
                    }
                }
            }
        }
        return ans;

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
