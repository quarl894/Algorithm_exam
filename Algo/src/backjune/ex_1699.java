package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex_1699 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dp[] = new int[N+1];
		
		//초기화(다 1^2일때 가정)
		for(int i=1; i<=N; i++){
			dp[i] = i;
		}
		
		// 1을 더하는건 j*j 제곱수가 추가되는 의미.
		for(int i=2; i<=N; i++){
			for(int j=2; j*j<=i; j++){
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
			}
		}
		System.out.println(dp[N]);
		br.close();
	}
}
