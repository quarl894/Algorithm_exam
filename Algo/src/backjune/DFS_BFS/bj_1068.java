package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
/*
DFS로 자식들 탐색했다.
삭제되는 것은 탐색안하게 함.
단, 삭제되는 노드가 형제가 없다면 부모노드가 자식노드가 되므로 이부분 처리해줘야함.
 */
public class bj_1068 {
    static LinkedList<Integer>[] tree;
    static boolean[] visited;
    static int ans = 0;
    static int n;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        tree = new LinkedList[n];
        visited = new boolean[n];

        for(int i=0; i<n; i++){
            tree[i] = new LinkedList<>();
        }
        int i = 0;
        int root = 0;
        StringTokenizer stk = new StringTokenizer(br.readLine());

        while(stk.hasMoreTokens()){
            int num = Integer.parseInt(stk.nextToken());
            if(num==-1){
                root = i;
                tree[i].add(i);
            }
            else tree[num].add(i);
            i++;
        }
        int d = Integer.parseInt(br.readLine());
        if(d==root) System.out.println(0);
        else {
            dfs(root, d);
            System.out.println(ans);
        }
        br.close();

    }

    private static void dfs(int s, int d){
        // 최하위 자식 노드 구하기.
        if(tree[s].size()==0){
            ans++;
            return;
        }

        for(int a : tree[s]){
            if(!visited[a]) {
                visited[a] = true;
                if(a!=d){
                    // 삭제노드가 아니라면 탐색
                    dfs(a,d);
                }else{
                    //삭제 노드의 형제가 없다면 부모노드가 자식노드가 되므로 추가
                    if(tree[s].size()==1) ans++;
                }
            }
        }
    }
}
