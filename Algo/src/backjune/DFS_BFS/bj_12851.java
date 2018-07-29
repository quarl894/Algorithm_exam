package backjune.DFS_BFS;

import java.util.*;

public class bj_12851{
    static int[] check;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        check = new int[100001];
        Arrays.fill(check,-1);

        if(N!=K) bfs(N,K);
        else{
            System.out.println(0);
            System.out.println(1);
        }
        sc.close();
    }

    private static void bfs(int N, int K){
        Queue<xy> q = new LinkedList<>();
        int[] sum = new int[100001];
        Arrays.fill(sum,0);
        q.offer(new xy(N,5,0));
        int nextN = N;
        int depth =0;
        Loop1 : while(!q.isEmpty() && nextN !=K) {
            nextN = q.peek().getX();
            depth = q.poll().getDepth();
            int[] arr = {nextN - 1, nextN + 1, nextN * 2};
            for (int i = 0; i < 3; i++) {
                if (arr[i] >= 0 && arr[i] <= 100000) {
                    sum[arr[i]] +=1;
                    if(check[arr[i]]==-1) {
                        check[arr[i]] = 0;
                        q.offer(new xy(arr[i], nextN, depth + 1));
                    }
                }
            }
        }

        System.out.println(depth);
        System.out.println(sum[5]);
    }

}

//class xy{
//    int x,y,depth;
//
//    public xy(int x, int y, int depth) {
//        this.x = x;
//        this.y = y;
//        this.depth = depth;
//    }
//
//    public xy(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public int getDepth() {
//        return depth;
//    }
//}

