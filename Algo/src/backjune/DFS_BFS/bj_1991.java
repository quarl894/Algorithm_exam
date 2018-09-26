package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1991 {
    static int[][] tree;
    static boolean[] visited;
    static StringBuilder st;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        tree = new int[n+1][2];
        visited = new boolean[n+1];
        int b,c;
        // '.' -'A' = -19;
        for(int i=0; i<n; i++){
            char[] ch = br.readLine().replaceAll(" ","").trim().toCharArray();
            int a = ch[0] - 'A';
            if(ch[1]=='.') b = -1;
            else b = ch[1] - 'A';
            if(ch[2]=='.') c = -1;
            else c = ch[2] -'A';

         //   tree[a][0] = b;
         //   tree[a][1] = c;
            System.out.println(a+""+b +""+c);
        }
        st = new StringBuilder();
        st.append("A");
        dfs(1);
        System.out.println(st);
        br.close();
    }

    private static void dfs(int s){
        if(!visited[s]) {
            if (tree[s][0] > -1) {
                st.append((char)(tree[s][0])+'A');
                visited[s] = true;
                dfs(tree[s][0]);
                visited[s] = false;
            } else if (tree[s][0] < 0 && tree[s][1] > -1) {
                st.append((char)(tree[s][1]+'A'));
                visited[s] = true;
                dfs(tree[s][1]);
                visited[s] = false;
            } else if (tree[s][0] < 0 && tree[s][1] < 0) {
                visited[s] = false;
                return;
            }
        }
    }
}
