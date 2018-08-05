package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// bfs로 풀면 시간초과 남.
public class bj_1890 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        // 경로수가 2의64승 -1 이므로 int범위 초과
        long[][] dp = new long[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(stk.nextToken());
            }
        }

        dp[0][0] = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(dp[i][j]==0 || (i==n-1 && j==n-1)) continue;

                int d = map[i][j];
                int dx = d + i;
                int dy = d + j;

                if(dx<n){
                    dp[dx][j] +=dp[i][j];
                }
                if(dy<n){
                    dp[i][dy] +=dp[i][j];
                }
            }
        }

        System.out.println(dp[n-1][n-1]);
        br.close();
    }
}
