package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
처음 루트 노드가 1이므로 루트의 자식노드를 큐에 넣고 부모노드를 찾는 방식.
양뱡향이므로 인접리스트로 둘 다 연결.
 */
public class bj_11725 {
    static int[] parents;
    static boolean[] visited;
    static LinkedList<Integer>[] node;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        node = new LinkedList[n+1];
        parents = new int[n+1];
        visited = new boolean[n+1];

        for(int i=0; i<=n; i++){
            node[i] = new LinkedList<>();
        }


        while(n-->1){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            node[a].add(b);
            node[b].add(a);
        }

        visited[1] = true;
        dfs(1);
        br.close();

    }

    private static void dfs(int s){
        Queue<Integer> q = new LinkedList<>();

        q.offer(s);

        while(!q.isEmpty()){
            int num = q.poll();

            for(int a : node[num]){
                if(!visited[a]) {
                    q.offer(a);
                    visited[a] = true;
                    parents[a] = num;
                }
            }
        }

        StringBuilder st = new StringBuilder();

        for(int i=2; i<parents.length; i++){
            st.append(parents[i]+"\n");
        }
        System.out.println(st);
    }
}
