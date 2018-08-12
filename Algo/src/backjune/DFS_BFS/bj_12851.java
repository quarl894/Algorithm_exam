package backjune.DFS_BFS;

import java.util.*;

public class bj_12851{
    static int n;
    static int k;
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        visited = new boolean[100001];
        if(n==k){
            System.out.println(0);
            System.out.println(1);
            return;
        }

        bfs(n);
        sc.close();


    }

    private static void bfs(int x){
        Queue<sum> q = new LinkedList<>();
        int ans = 0;
        int result = Integer.MAX_VALUE;

        q.offer(new sum(x,0));

        while(!q.isEmpty()){
            sum s = q.poll();

            if(s.cnt>=result) break;
            int num = s.x;
            visited[num] = true;
            int[] ax = {num+1, num-1, num*2};

            for(int i=0; i<3; i++){
                if(ax[i]>=0 && ax[i]<=100000 && !visited[ax[i]]){
                    if(ax[i]==k){
                        ans++;
                        result = s.cnt+1;
                    }
                    q.offer(new sum(ax[i],s.cnt+1));
                }
            }
        }
        System.out.println(result);
        System.out.println(ans);
    }

    private static class sum{
        int x;
        int cnt;

        public sum(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
}
