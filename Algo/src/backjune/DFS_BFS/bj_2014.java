package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class bj_2014 {
    static int k;
    static int n;
    static long[] map;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        k = Integer.parseInt(t[0]);
        n = Integer.parseInt(t[1]);
        map = new long[k];
        String[] tmp = br.readLine().split(" ");
        for(int i=0; i<k; i++){
            map[i] = Long.parseLong(tmp[i]);
        }
        bfs();
        br.close();
    }

    private static void bfs(){
        PriorityQueue<Long> q = new PriorityQueue<>();
        int cnt = 1;
        for(int i=0; i<k; i++){
            q.offer(map[i]);
        }
        long num = 0;

        while(cnt!=n){
            num = q.poll();
            cnt++;

            for(int i=0; i<k; i++){
                long tmp = num * map[i];
                q.offer(tmp);
                if(tmp % map[i] ==0) break;
            }
        }
        System.out.println(num);
    }
}
