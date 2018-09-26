package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
루트 노드의 너비는 1임... 0이 아님...
 */
public class bj_2250 {
    static int n;
    static int[][] tree;
    static boolean[][] visited;
    static int cnt = 1;
    static ArrayList<info> arr;
    static int root[];
    static int r;
    static boolean[] visit;
    static LinkedList<Integer>[] linked;
    static int d = 1;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        tree = new int[n+1][2];
        visited = new boolean[n+1][2];
        root = new int[n+1];
        arr = new ArrayList<>();
        Arrays.fill(root,0);
        visit = new boolean[n+1];
        linked = new LinkedList[n+1];

        for(int i=0; i<=n; i++){
            linked[i] = new LinkedList<>();
        }

        // 트리 구성
        while(n-->0){
            StringTokenizer stk = new StringTokenizer(br.readLine());
                int n1 = Integer.parseInt(stk.nextToken());
                int n2 = Integer.parseInt(stk.nextToken());
                int n3 = Integer.parseInt(stk.nextToken());
                tree[n1][0] = n2;
                tree[n1][1] = n3;
                if(n2!=-1) root[n2] = n1;
                if(n3!=-1) root[n3] = n1;
        }


        for(int i=1; i<=root.length; i++){
            if(root[i]==0){
                r= i;
                break;
            }
        }

        dfs(r,1);
//        for(info a : arr){
//            System.out.println(a.lv + " " + a.index + " "+ a.num);
//        }

//        Collections.sort(arr, new Comparator<info>() {
//            @Override
//            public int compare(info o1, info o2) {
//                if(o1.lv>o2.lv) return -1;
//                else if(o1.lv<o2.lv) return 1;
//                else{
//                    if(o1.index > o2.index) return -1;
//                    else if(o1.index <o2.index) return 1;
//                    else return 0;
//                }
//            }
//        });

        bfs();

        br.close();
    }

    private static void bfs(){
        int ans = 1;
        int lv = 1;

        for(int i=1; i<=d; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int a : linked[i]){
                if(max<a) max = a;
                if(min>a) min= a;
            }
            if(min!=max){
                if(ans<(max-min+1)){
                    ans = (max-min+1);
                    lv = i;
                }
            }
        }
        System.out.println(lv + " " + ans);
    }


    //중위순회
    private static void dfs(int s, int depth){
        if(tree[s][0]==-1 && tree[s][1]==-1){
            linked[depth].add(cnt);
      //      arr.add(new info(depth,cnt,s));
            d = Math.max(d,depth);
            cnt++;
            return;
        }

        if(tree[s][0]!=-1){
            if(!visited[s][0]){
                visited[s][0] = true;
                dfs(tree[s][0],depth+1);
//                linked[depth].add(cnt);
//                d = Math.max(d,depth);
    //            arr.add(new info(depth,cnt,s));
            }
        }
        linked[depth].add(cnt);
        d= Math.max(d,depth);
        cnt++;

        if(tree[s][1]!=-1){
            if(!visited[s][1]){
                visited[s][1] = true;
                dfs(tree[s][1], depth+1);
            }
        }
    }

    private static class info{
        int lv;
        int index;
        int num;

        public info(int lv, int index, int num) {
            this.lv = lv;
            this.index = index;
            this.num = num;
        }
    }
}
