package backjune.DFS_BFS;

import java.util.Scanner;

public class bj_15651 {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;
    static int sum;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();


        sum = n*m;
        int num =0;
        arr = new int[sum];
        visited = new boolean[sum];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[num++] = i+1;
            }
        }

    }

    private static void bfs(int a, int cnt){
        if(cnt==m){
            print();
            return;
        }

        for(int i=0; i<sum; i++){
            if(!visited[i]){
                visited[i] = true;
                bfs(i,cnt+1);

                visited[i] = false;

            }

        }
    }

    private static void print(){
    }
}
