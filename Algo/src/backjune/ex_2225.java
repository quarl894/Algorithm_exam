package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//ÇÕºÐÇØ
public class ex_2225 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mod = 1000000000;
		String[] sp = br.readLine().split(" ");
		int N = Integer.parseInt(sp[0]);
		int k = Integer.parseInt(sp[1]);
		int dp[][] = new int[201][201];
		for(int i=0; i<=N; i++){
			dp[1][i] = 1;
		}
		
		for(int i=1; i<=k; i++){
			for(int j=0; j<=N; j++){
				for(int m=0; m<=j; m++){
					dp[i][j] +=dp[i-1][j-m];
					dp[i][j] %= mod;
				}
			}
		}
		System.out.println(dp[k][N]);
		br.close();
	}

}
