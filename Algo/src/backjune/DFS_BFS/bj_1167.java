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

public class bj_1167 {
    static LinkedList<Node>[] linked;
    static boolean[] visited;
    static int r,u;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        linked = new LinkedList[n+1];
        visited = new boolean[n+1];
        for(int i=1; i<=n; i++){
            linked[i] = new LinkedList<Node>();
        }

        while(n-->0){
            String[] tmp = br.readLine().split(" ");
            int parent = Integer.parseInt(tmp[0]);
            for(int i=1; i<tmp.length; i+=2){
                if(Integer.parseInt(tmp[i])==-1) break;
                linked[parent].add(new Node(Integer.parseInt(tmp[i]),Integer.parseInt(tmp[i+1])));
            }
        }

        long sum = 0;

        dfs(1,0);

        r = 0 ;
        Arrays.fill(visited,false);

        dfs(u,0);

        sum =r;

        System.out.println(sum);

    }

    private static void dfs(int s, int d){
        visited[s] = true;

        if(d>r){
            r = d;
            u = s;
        }

        for(Node root : linked[s]) {
            if (!visited[root.num]) {
                visited[root.num] = true;
                dfs(root.num, d + root.weight);
                visited[root.num] = false;
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
