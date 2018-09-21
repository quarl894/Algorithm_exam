package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj_2346 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Deque<xy> q = new LinkedList<>();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
            q.offer(new xy(arr[i], i+1));
        }
        StringBuilder st = new StringBuilder();
        while(!q.isEmpty()){
            int idx = q.peekFirst().y;
            int num = q.pollFirst().x;
            st.append(idx + " ");
            if(q.isEmpty()) break;
            if(num>0){
                while(--num>0){
                    q.offerLast(q.pollFirst());

                }
            }else if(num<0){
                while(++num<=0){
                    q.offerFirst(q.pollLast());
                }
            }
        }
        System.out.println(st);

        br.close();
    }

    private static class xy{
        int x;
        int y;

        public xy(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
