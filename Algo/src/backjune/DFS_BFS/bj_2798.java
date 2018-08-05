package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_2798 {
    static int n;
    static int m;
    static int min;
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        m = Integer.parseInt(t[1]);
        arr = new int[n];
        visited = new boolean[n];
        min = Integer.MAX_VALUE;
        String[] tmp = br.readLine().split(" ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(tmp[i]);
        }
        dfs(0,0,0);
        System.out.println(m-min);
        br.close();
    }

    private static void dfs(int pos, int cnt, int num){
        if(cnt==3){
            int s = m-num;
            if(s>-1){
                min = Math.min(min,s);
            }
            return;
        }

        for(int i=pos; i<n; i++){
            if(!visited[i]) {
                num += arr[i];
                dfs(i+1, cnt+1, num);
                num -=arr[i];
                visited[i] = false;
            }
        }
        return;
    }

}
