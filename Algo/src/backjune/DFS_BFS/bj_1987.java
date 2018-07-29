package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class bj_1987 {
    static char[][] alph;
    static boolean[] visited;
    static int r;
    static int c;
    static int cnt = 0;
    static int ans = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        r = Integer.parseInt(str[0]);
        c = Integer.parseInt(str[1]);
        visited = new boolean[26];
        alph = new char[r][c];

        for(int i=0; i<r; i++){
            char[] ch = br.readLine().toCharArray();
            for(int j=0; j<c; j++){
                alph[i][j] = ch[j];
            }
        }
        dfs(alph,visited,0,0);
        System.out.println(ans+1);
        br.close();

    }

    private static void dfs(char[][] alph, boolean[] visited, int x, int y){
        int num = alph[x][y] - 'A';
        visited[num] = true;

        for(int i=0; i<4; i++){
            int[] ax = {1,0,-1,0};
            int[] ay = {0,-1,0,1};

            int dx = x +ax[i];
            int dy = y +ay[i];
            if(dx>=0 && dx<r && dy>=0 && dy<c){
                int tmp = alph[dx][dy] - 'A';
                if(!visited[tmp]){
                    visited[tmp] = true;
                    ans = Math.max(++cnt, ans);
                    dfs(alph,visited,dx,dy);
                }
            }
        }
        cnt--;
        visited[num] = false;
    }
}