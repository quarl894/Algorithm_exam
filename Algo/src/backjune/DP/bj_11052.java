package backjune.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_11052 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] tmp = br.readLine().split(" ");
        int[] p = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            p[i] = Integer.parseInt(tmp[i-1]);
        }

        //dp[1],dp[2]는 구해놓고 인덱스 오류 나기전에 리턴.
        dp[1] = p[1];
        if(n==1){
            System.out.println(dp[1]);
            return;
        }

        dp[2] = Math.max(dp[1]+p[1],p[2]);

        if(n==2){
            System.out.println(dp[2]);
            return;
        }

        for(int i=3; i<=n; i++){
            for(int j=1; j<=i/2; j++){
                dp[i] = Math.max(dp[j]+dp[i-j],Math.max(dp[i],p[i]));
            }
        }
        System.out.println(dp[n]);
        br.close();

    }
}
