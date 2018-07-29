package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class bj_6603 {
    static StringBuilder st;
    static boolean[] visited;
    static int N;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] tmp = br.readLine().split(" ");
            N = Integer.parseInt(tmp[0]);
            if(N==0) break;
            visited = new boolean[50];
            int[] lotto = new int[N];
            for(int i=0; i<N; i++){
                lotto[i] = Integer.parseInt(tmp[i+1]);
            }
            Arrays.sort(lotto);
            st = new StringBuilder();
            dfs(lotto, 0,0);
            System.out.println(st);
        }
    }

    private static void dfs(int[] lotto,int pos, int len){
        if(len == 6){
            print();
            return;
        }

        for(int i=pos; i<N; i++){
            if(!visited[lotto[i]]){
                visited[lotto[i]] = true;
                dfs(lotto,i+1,len+1);
                visited[lotto[i]] = false;
            }
        }
    }

    private static void print(){
        for(int i=0; i<visited.length; i++){
            if(visited[i]==true) st.append(i+" ");
        }
       // st.delete(6,6);
        st.append("\n");
    }
}