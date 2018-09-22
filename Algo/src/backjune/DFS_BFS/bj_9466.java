package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9466 {
    static int len;
    static int[] arr;
    static int sum = 0;
    static boolean[] chk;
    static int ans = 1;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder st = new StringBuilder();
        while(n-->0){
            len = Integer.parseInt(br.readLine());
            arr = new int[len+1];
            int i = 1;
            sum = 0;
            chk = new boolean[len+1];
            StringTokenizer stk = new StringTokenizer(br.readLine());
            while(stk.hasMoreTokens()){
                int tmp = Integer.parseInt(stk.nextToken());
                // 혼자 팀은 미리 방문 체크해놓음.
                if(i==tmp) chk[i] = true;
                arr[i++] = tmp;
            }
            dfs(0,arr[0],0, 1);
            st.append(sum+"\n");
//            System.out.println(sum);
        }
        System.out.println(st);
        br.close();
    }

    private static void dfs(int s, int num, int cnt, int k){
        // 방문한 것일때
        if(chk[num]){
            ans+=1;
            // 팀을 이뤘다면 끝냄.
            if(num==s){
                return;
            }else{
                // 팀을 못이뤘다면 사람 수 더해줌.
                sum +=cnt;
                return;
            }
        }else{
            if(s!=0){
                chk[num] = true;
                dfs(s,arr[num],cnt+1,k);
            }
        }

        // 방문안한 것만 탐색
        for(int i=k; i<=len; i++){
            if(!chk[i]){
                chk[i] = true;
                dfs(i,arr[i],1,k+1);
            }
        }
    }
}
