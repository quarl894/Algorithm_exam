package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_15655 {
    static int n;
    static int m;
    static int[] arr;
    static int[] tmp;
    static boolean[] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t1 = br.readLine().split(" ");
        n = Integer.parseInt(t1[0]);
        m = Integer.parseInt(t1[1]);
        arr = new int[n];
        tmp = new int[m];
        visited = new boolean[10001];
        String[] t2 = br.readLine().split(" ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(t2[i]);
        }
        Arrays.sort(arr);
        dfs(0,0);
        br.close();
    }

    private static void dfs(int pos,int cnt){
        if(cnt==m){
            print();
            return;
        }

        for(int i=pos; i<n; i++){
            if(!visited[arr[i]]) {
                visited[arr[i]]=true;
                dfs(i+1,cnt+1);
                visited[arr[i]] = false;
            }
        }
    }


    private static void print(){
        StringBuilder st = new StringBuilder();
        for(int i=0; i<n; i++){
            if(visited[arr[i]]) st.append(arr[i] + " ");
        }
        System.out.println(st);
    }
}
