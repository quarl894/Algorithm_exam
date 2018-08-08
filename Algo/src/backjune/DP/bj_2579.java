package backjune.DP;

import java.util.Scanner;

public class bj_2579 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        // index over 날 수 있으니 미리 체크
        if(n==1) {
            System.out.println(arr[1]);
            return;
        }else if(n==2) {
            System.out.println(arr[1] + arr[2]);
            return;
        }

        dp[1] = arr[1];
        dp[2] = arr[1] +arr[2];
        dp[3] = Math.max(arr[2]+arr[3], arr[1]+arr[3]);
        if(n==3){
            System.out.println(dp[3]);
            return;
        }

        // 4번째 자리의 최대값: (1번째의 최대값 + 3번째+4번째) or (2번째최대값 + 4번째)
        for(int i=4; i<=n; i++){
            dp[i] = Math.max(dp[i-2], dp[i-3] +arr[i-1]) +arr[i];
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
