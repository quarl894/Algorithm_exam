package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_1761 {
    static LinkedList<Node>[] tree;
    static boolean[] visited;
    static StringBuilder st;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new LinkedList[n+1];
        visited = new boolean[n+1];
        st= new StringBuilder();

        for(int i=0; i<=n; i++){
            tree[i] = new LinkedList<>();
        }

        for(int i=1; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            while(stk.hasMoreTokens()){
                int a = Integer.parseInt(stk.nextToken());
                int b = Integer.parseInt(stk.nextToken());
                int c = Integer.parseInt(stk.nextToken());

                //양뱡향
                tree[a].add(new Node(b,c,0));
                tree[b].add(new Node(a,c,0));
            }
        }
        int cnt = Integer.parseInt(br.readLine());

        while(cnt-->0){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int q1 = Integer.parseInt(stk.nextToken());
            int q2 = Integer.parseInt(stk.nextToken());

            bfs(q1,q2);
            Arrays.fill(visited,false);
        }
        System.out.println(st);
        br.close();

    }

    private static void bfs(int s, int e){
        Queue<Node> q = new LinkedList<>();

        for(Node item : tree[s]){
            if(item.num==e){
                st.append(item.weight+"\n");
                return;
            }
            q.offer(new Node(item.num, item.weight, item.ans+item.weight));
        }
        visited[s] = true;

        while(!q.isEmpty()){
            Node item = q.poll();

            for(Node node : tree[item.num]){
                if(!visited[node.num]){
                    visited[node.num] = true;
                    if(node.num==e){
                        st.append(item.ans+node.weight+"\n");
                        return;
                    }else{
                        q.offer(new Node(node.num, node.weight, item.ans+node.weight));
                    }
                }
            }
        }
    }

    private static class Node{
        int num;
        int weight;
        int ans;

        public Node(int num, int weight, int ans) {
            this.num = num;
            this.weight = weight;
            this.ans = ans;
        }
    }
}
