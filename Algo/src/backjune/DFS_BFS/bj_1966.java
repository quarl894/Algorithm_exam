package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bj_1966 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int n = 0;
        int m = 0;
        StringBuilder st = new StringBuilder();
        while(num-->0){
            String[] t = br.readLine().split(" ");
            n = Integer.parseInt(t[0]);
            m = Integer.parseInt(t[1]);
            int cnt = 0;
            int[] arr = new int[n];
            ArrayList<Integer> tmp =new ArrayList<>();
            Queue<p> q = new LinkedList<>();
            StringTokenizer stk = new StringTokenizer(br.readLine());
            while(stk.hasMoreTokens()){
                int value = Integer.parseInt(stk.nextToken());
                arr[cnt] = value;
                tmp.add(value);
                q.offer(new p(value,cnt));
                cnt++;
            }
            Collections.sort(tmp);
            Collections.reverse(tmp);
            int max = tmp.get(0);
            int ans = 0;
            while(true){
                p result = q.peek();

                if(result.index==m){
                    if(max==result.x) {
                        st.append(ans+1 +"\n");
                        break;
                    }else{
                        p tmp2 = q.poll();
                        q.offer(tmp2);
                    }
                }else{
                    if(result.x==max){
                        q.poll();
                        ans++;
                        max = tmp.get(ans);
                    }else{
                        p tmp3 = q.poll();
                        q.offer(tmp3);
                    }
                }
            }

        }
        System.out.print(st);
        br.close();

    }

    private static class p{
        int x;
        int index;

        public p(int x, int index) {
            this.x = x;
            this.index = index;
        }
    }
}
