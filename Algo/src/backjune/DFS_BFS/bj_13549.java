package backjune.DFS_BFS;

import java.util.*;

public class bj_13549 {
    static int n;
    static int k;
    static boolean[] visited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        visited = new boolean[100001];

        if(n==k){
            System.out.println(0);
            return;
        }
        bfs(n);
        sc.close();

    }

    private static void bfs(int x){
        PriorityQueue<sum> q = new PriorityQueue<>(new Comparator<sum>() {
            @Override
            public int compare(sum o1, sum o2) {
                if(o1.time>o2.time) return 1;
                else if(o1.time<o2.time) return -1;
                else{
                    if(o1.x>o2.x) return 1;
                    else if(o1.x<o2.x) return -1;
                    else return 0;
                }
            }
        });
     //   Queue<sum> q = new LinkedList<>();

        q.offer(new sum(x,0));
        //visited[x] = true;
        Loop : while(!q.isEmpty()){
            sum s = q.poll();
            int num =s.x;
            visited[num] = true;


            int[] ax = {num*2,num+1, num-1};

            for(int i=0; i<3; i++){
                if(ax[i]>=0 && ax[i]<=100000 && !visited[ax[i]]){
                    if(ax[i]==k){
                        if(i==0){
                            System.out.println(s.time);
                            break Loop;
                        }else{
                            System.out.println(s.time+1);
                            break Loop;
                        }
                    }
                    if(i==0){
                        q.offer(new sum(ax[i],s.time));
                    }else{
                        q.offer(new sum(ax[i],s.time+1));
                    }
                }
            }
        }

    }

    private static class sum{
        int x;
        int time;

        public sum(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }
}
