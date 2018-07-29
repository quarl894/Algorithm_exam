package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj_2589 {
    static int l;
    static int w;
    static int max = 0;
    static char[][] bomul;
    static char[][] temp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        l = Integer.parseInt(num[0]);
        w = Integer.parseInt(num[1]);
        bomul = new char[l][w];
        temp = new char[l][w];
        for(int i=0; i<l; i++){
            char[] zido = br.readLine().toCharArray();
            for(int j=0; j<w; j++){
                bomul[i][j] = temp[i][j] = zido[j];

            }
        }

        for(int i=0; i<l; i++){
            for(int j=0; j<w; j++){
                clear(); //따로 함수로 초기화해줘야함.
                if(bomul[i][j] == 'L') {
                    bfs(bomul, i, j);
                }
            }
        }
        System.out.println(max);
        br.close();

    }

    private static void bfs(char[][] arr, int s, int e){
        Queue<xy> q = new LinkedList<>();
        q.offer(new xy(s,e,0));

        while(!q.isEmpty()){
            xy tmp = ((LinkedList<xy>) q).pop();

            for(int i=0; i<4; i++){
                int[] ax = {1,0,-1,0};
                int[] ay = {0,-1,0,1};

                int dx = tmp.x + ax[i];
                int dy = tmp.y + ay[i];
                if(dx>=0 && dx<l && dy>=0 && dy<w){
                    if(arr[dx][dy] == 'L'){
                        q.offer(new xy(dx,dy,tmp.count+1));

                        arr[dx][dy] = 'W';
                    }
                }

            }
            max = Math.max(tmp.count,max);
        }

    }

    private static class xy{
        int x;
        int y;
        int count;

        public xy(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    private static void clear(){
        for(int i=0; i<l; i++){
            for(int j=0; j<w; j++){
                bomul[i][j] = temp[i][j];
            }
        }
    }
}
