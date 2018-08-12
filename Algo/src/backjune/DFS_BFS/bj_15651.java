package backjune.DFS_BFS;

import java.util.Scanner;

public class bj_15651 {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n];

        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }

        dfs(0,0,"");
        sc.close();

    }

    private static void dfs(int pos, int cnt, String str){
        if(cnt==m){
            System.out.println(str);
            return;
        }

        for(int i=0; i<n; i++){
            if(pos!=3 && !visited[i]) {
                for (int j = pos; j < 3; j++) {
                    if(pos==2) visited[i] = true;
                    dfs(j, cnt + 1, str + (i+1) + " ");
                }
                visited[i] = false;
            }
        }

    }
}
