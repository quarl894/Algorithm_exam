package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//µ¿Àü 1
public class ex_2293 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int n = Integer.parseInt(sp[0]);
		int k = Integer.parseInt(sp[1]);
		int[] coin = new int[n];
		int[] dp = new int[k+1];
		for(int i=0; i<n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		dp[0] = 1;
		for(int i=0; i<n; i++) {
			for(int j=1; j<=k; j++) {
				if(coin[i] <= j) dp[j] += dp[j-coin[i]];
			}
		}
		System.out.print(dp[k]);
		br.close();
	}
}
