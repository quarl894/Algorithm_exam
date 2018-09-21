package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_6603_2 {
    static boolean[] visited;
    static StringBuilder st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String[] t = br.readLine().split(" ");
            visited = new boolean[50];
            if (t.length != 1) {
                int n = Integer.parseInt(t[0]);
                int[] lotto = new int[n];
                for (int i = 0; i < n; i++) {
                    lotto[i] = Integer.parseInt(t[i + 1]);
                }
                st = new StringBuilder();
                Arrays.sort(lotto);
                dfs(lotto, 0, 0);
                System.out.println(st);
            }else{
                break;
            }

        }
        br.close();
    }

    private static void dfs(int[] arr, int pos, int ans){
        if(ans==6){
            print();
            return;
        }

        for(int i=pos; i<arr.length; i++){
            if(!visited[arr[i]]){
                visited[arr[i]] = true;
                dfs(arr,i+1,ans+1);
                visited[arr[i]] = false;
            }

        }
    }

    private static void print(){
        for(int i=0; i<visited.length; i++){
            if(visited[i]){
                st.append(i +" ");
            }
        }
        st.append("\n");
    }
}
