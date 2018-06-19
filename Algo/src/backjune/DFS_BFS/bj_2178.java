package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_2178 {
    static int N;
    static int M;
    static Miro mr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        N = Integer.parseInt(sp[0]);
        M = Integer.parseInt(sp[1]);
        int[][] miro = new int[N][M];

        for(int i=0; i<N; i++){
            String num = br.readLine();
            for(int j=0; j<M; j++){
                miro[i][j] = Integer.parseInt(num.substring(j,j+1));
            }
        }
        bfs(miro);
        System.out.println(mr.count);
        br.close();
    }

    private static void bfs(int[][] gp){
        Queue<Miro> q = new LinkedList<>();
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        q.offer(new Miro(0,0, 1));
        gp[0][0] = 0;
        while(!q.isEmpty()){
            mr = q.poll();
            if(mr.x == N-1 && mr.y == M-1) break;
            for(int i=0; i<4; i++){
                int ax = mr.x +dx[i];
                int ay = mr.y +dy[i];

                if(ax>=0 && ax<N && ay>=0 && ay<M){
                    if(gp[ax][ay]==1) {
                        q.offer(new Miro(ax, ay,mr.count+1));
                        gp[ax][ay] = 0;
                    }
                }
            }
        }
    }
}

final class Miro{
    int x;
    int y;
    int count;

    public Miro(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
