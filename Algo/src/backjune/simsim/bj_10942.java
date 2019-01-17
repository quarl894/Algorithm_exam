package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_10942 {
    static int N;
    static int[] arr;
    static int[][] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        dp = new int[N+1][N+1];
        String[] tmp = br.readLine().split(" ");
        StringBuilder st = new StringBuilder();

        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(tmp[i-1]);
        }

        find_pal();

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            String[] t = br.readLine().split(" ");
            int n1 = Integer.parseInt(t[0]);
            int n2 = Integer.parseInt(t[1]);

            if(dp[n1][n2]==1) st.append(1);
            else st.append(0);
            st.append("\n");
        }
        System.out.println(st.toString());
        br.close();

    }

    private static void find_pal(){
        //len : 1
        for(int i=1; i<=N; i++){
            dp[i][i] = 1;
        }
        //len : 2
        for(int i=1; i<N; i++){
            if(arr[i]==arr[i+1]) dp[i][i+1] = 1;
        }

        // len : 3이상
        /*
        DP
        k = 팰린드롬 길이
        i = 시작 인덱스
        j = 끝 인덱스
         */
        for(int k = 3; k<=N; k++){
            for(int i=1; i<=N-k+1; i++){
                int j = i+k-1;
                if(arr[i] == arr[j] && dp[i+1][j-1]==1) dp[i][j] = 1;
            }
        }

    }
}
