package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_1697_2 {
    static int n;
    static int k;
    static int result;
    static boolean chk[];

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        chk = new boolean[100001];
        if(n==k) System.out.println(0);
        else{
            bfs(n);
            System.out.println(result);
        }
        sc.close();
    }

    private static void bfs(int x){
        Queue<sum> q = new LinkedList<>();
        q.offer(new sum(x,0));

        while(!q.isEmpty()){
            sum s= q.poll();

            //3가지 방법 넣기.
            int[] ax = {s.x -1, s.x+1, s.x *2 };
            for(int i=0; i<3; i++){
                // 답을 찾았을 때 빠져나옴.
                if(ax[i]==k){
                    result = s.ans +1;
                    return;
                }
                // -가 있어 음수, 최대값 초과 예외처리
                if(ax[i]>=0 && ax[i]<=100000){
                    if(!chk[ax[i]]){
                        q.offer(new sum(ax[i],s.ans+1));
                        chk[ax[i]] = true;
                    }
                }
            }
        }

    }

    private static class sum{
        int x;
        int ans;

        public sum(int x, int ans) {
            this.x = x;
            this.ans = ans;
        }
    }
}
