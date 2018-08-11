package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bj_15649 {
    static int n;
    static int m;
    static int[] num;
    static boolean[] visited;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m =sc.nextInt();
        num = new int[n+1];
        visited = new boolean[n+1];


        bfs(0);


    }

    public static void bfs(int cnt){
        if(cnt==m){
            print();
            return;
        }

        for(int i=1; i<=n; i++){
            if(!visited[i]) {
                visited[i] = true;
                num[cnt+1] = i;
                bfs(cnt + 1);
                visited[i] = false;
            }
        }

    }

    public static void print(){
        StringBuilder st = new StringBuilder();
        for(int i=1; i<=m; i++){
            st.append(num[i] + " ");
        }
        System.out.println(st);
    }
}
