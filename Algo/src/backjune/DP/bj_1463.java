package backjune.DP;

import java.util.Scanner;

public class bj_1463 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n+1];
        if(n==1){
            System.out.println(0);
            return;
        }else if(n==2 || n==3){
            System.out.println(1);
            return;
        }
        dp[0] = Integer.MAX_VALUE;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        //dp[4] = 2;
        int n3 =0;
        int n2 = 0;
        int n1 = 0;

        for(int i=4; i<=n; i++){
            if(i%3==0) n3=i/3;
            else n3 = 0;

            if(i%2==0) n2=i/2;
            else n2 = 0;

            n1 = i-1;
            dp[i] = Math.min(dp[n3], Math.min(dp[n2],dp[n1]))+1;
        }

        System.out.println(dp[n]);

    }
}
