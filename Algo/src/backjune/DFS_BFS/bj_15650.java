package backjune.DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bj_15650 {
    static int n;
    static int m;
    static int[] num;
    static boolean[] visited;
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m =sc.nextInt();
        num = new int[n+1];
        visited = new boolean[n+1];

        for(int i=1; i<=n; i++){
            num[i] = i;
        }


        bfs(1,0);
        Collections.sort(arr);
        for(String a : arr) System.out.println(a);
        sc.close();

    }

    public static void bfs(int a,int cnt){
        if(cnt==m){
            print(a);
            return;
        }

        for(int i=a; i<=n; i++){
            if(!visited[i]) {
                visited[i] = true;
                bfs(i+1,cnt + 1);
                visited[i] = false;
            }
        }

    }

    public static void print(int a){
        StringBuilder st = new StringBuilder();
        for(int i=1; i<visited.length; i++){
            if(visited[i]){
                st.append(i + " ");
            }
        }
        arr.add(st.toString());
    }
}
