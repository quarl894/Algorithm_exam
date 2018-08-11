package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_15654 {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;
    static int[] ans;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        arr = new int[n];
        visited = new boolean[10001];
        ans = new int[n];
        String[] t = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(t[i]);
        }
        Arrays.sort(arr);
        bfs(0);
        br.close();

    }

    private static void bfs(int cnt){
        if(cnt==m){
            print();
            return;
        }

        for(int i=0; i<n; i++){
            if(!visited[arr[i]]) {
                visited[arr[i]] = true;
                ans[cnt] = arr[i];
                bfs(cnt + 1);
                visited[arr[i]] = false;
            }
        }
    }

    private static void print(){
        StringBuilder st = new StringBuilder();
        for(int i=0; i<m; i++){
            st.append(ans[i] + " ");
        }
        System.out.println(st);
    }
}
