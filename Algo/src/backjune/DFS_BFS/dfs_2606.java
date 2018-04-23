package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class dfs_2606 {
    static int n, result;
    static int[] visited;
    static Vector<LinkedList> adj;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()) + 1;
        int e = Integer.parseInt(br.readLine());
        adj = new Vector<>();
        visited = new int[n];
        StringTokenizer token;
        for (int i = 1; i <= n; i++) {
            adj.add(new LinkedList());
        }
        for (int i = 0; i < e; i++) {
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        dfs();
        System.out.print(result);
    }

    private static void dfs() {
        Stack<Integer> st = new Stack<>();

        int init = 1;
        st.push(init);
        visited[init] = 1;
        while (!st.isEmpty()) {
            if (!adj.get(init).isEmpty()) {
                int j = (Integer) adj.get(init).remove();
                if (visited[j] == 1) {
                    continue;
                }
                st.push(j);
                visited[j] = 1;
                result++;
                init = j;
            } else {
                init = st.pop();
                if (!adj.get(init).isEmpty()) st.push(init);
            }
        }
    }
}
