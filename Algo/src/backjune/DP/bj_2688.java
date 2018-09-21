package backjune.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_2688 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            zul(num);
        }
        br.close();
    }

    private static void zul(int n){
        long[][] dp = new long[n+1][11];

        for(int i=0; i<10; i++){
            dp[1][i] = 1;
        }
        dp[1][10] = 10;

        for(int i=2; i<=n; i++){
            dp[i][0] = dp[i-1][10];
            for(int j=1; j<10; j++){
               dp[i][j] = dp[i][j-1] - dp[i-1][j-1];
               dp[i][10] +=dp[i][j];
            }
            dp[i][10] += dp[i][0];
        }
        System.out.println(dp[n][10]);
    }
}
