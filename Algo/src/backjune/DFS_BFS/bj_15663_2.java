package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class bj_15663_2 {
    static int n;
    static int len;
    static int[] arr;
    static ArrayList<xy> visited;
    static HashSet<String> hash;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        len = Integer.parseInt(t[1]);
        String[] t2 = br.readLine().split(" ");
        hash = new HashSet<>();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(t2[i]);
        }
        Arrays.sort(arr);
        visited = new ArrayList<>();
        for(int m : arr){
            visited.add(new xy(m,false));
        }

        dfs(0,0);

    }

    private static void dfs(int pos, int ans){
        if(ans==len){
            print();
            return;
        }

        for(int i=pos; i<n; i++){
            if(!visited.get(i).flag){
                dfs(pos+1, ans+1 );
            }

        }

    }
    private static void print(){

    }

    private static class xy{
        int x;
        boolean flag;

        public xy(int x, boolean flag) {
            this.x = x;
            this.flag = flag;
        }
    }
}
