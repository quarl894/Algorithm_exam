package backjune.DFS_BFS;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
DFS를 이용한 문제.
루트노드에서 가장 먼 곳을 먼저 탐색함.
그 후 가장먼 것에서 가장 먼것을 탐색함.
둘의 거리를 더함.

dfs를 두번 쓸 때, 방문 초기화 해줘야함.

 */

public class bj_1967 {
    static LinkedList<Node>[] tree;
    static boolean[] visited;
    static int max,v,sum;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        tree = new LinkedList[n+1];
        visited = new boolean[n+1];
        max = 0;
        v = 0;
        sum = 0;

        for(int i=0; i<=n; i++){
            tree[i] = new LinkedList<>();
        }

        while(n-->1){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(stk.nextToken());
            int child = Integer.parseInt(stk.nextToken());
            int weight = Integer.parseInt(stk.nextToken());

            tree[parent].add(new Node(child,weight));
            tree[child].add(new Node(parent,weight));
        }

        dfs(1,0);
        max = 0;
        Arrays.fill(visited,false);
        dfs(v,0);
        System.out.println(max);
        br.close();

    }

    private static void dfs(int s, int w){
        visited[s] = true;
        if(max<w){
            max= w;
            v = s;
        }


        for(Node a : tree[s]){
            if(!visited[a.num]) {
                visited[a.num] = true;
                dfs(a.num, a.weight + w);
                visited[a.num] = false;
            }
        }
    }

    private static class Node{
        int num;
        int weight;

        public Node(int num, int weight) {
            this.num = num;
            this.weight = weight;
        }
    }
}
