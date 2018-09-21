package backjune.DFS_BFS;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class bj_14226 {
    static int n;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[10000][10000];
        bfs();

        sc.close();

    }

    private static void bfs(){
        PriorityQueue<emoji> q = new PriorityQueue<>(new Comparator<emoji>() {
            @Override
            public int compare(emoji o1, emoji o2) {
                if(o1.cnt>o2.cnt) return 1;
                else if(o1.cnt<o2.cnt) return -1;
                else return 0;
            }
        });

        q.offer(new emoji(1,1,0));
        while(!q.isEmpty()){
            emoji e = q.poll();
            if(e.ans==n){
                System.out.println(e.cnt+1);
                break;
            }

            if(!visited[e.ans][e.clip]){
                visited[e.ans][e.clip] = true;

                //ㅇㅣ모티콘 생성
                if(e.ans>0) {
                    q.offer(new emoji(e.ans + e.ans, e.ans, e.cnt + 2));
                    q.offer(new emoji(e.ans + e.clip, e.clip, e.cnt + 1));
                }
                if(e.ans-1>0) q.offer(new emoji(e.ans-1, e.clip,e.cnt+1));
            }
        }
    }

    private static class emoji{
        int ans;
        int clip;
        int cnt;

        public emoji(int ans, int clip, int cnt) {
            this.ans = ans;
            this.clip = clip;
            this.cnt = cnt;
        }
    }

}
