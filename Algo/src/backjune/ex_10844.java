package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//���� ��ܼ�
public class ex_10844 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[N+1][11];
		int mod = 1000000000;
		//1�ڸ���
		for(int i=1; i<=9; i++){
			dp[1][i] = 1;
		}
		dp[1][10] = 9;
		
		//1�϶��� 9�϶��� �ٸ��� �������� ����. dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1]
		for(int i=2; i<=N; i++){
			dp[i][0] = (dp[i-1][1]);
			dp[i][10] +=(dp[i][0]);
			for(int j=1; j<=8; j++){
				dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%mod;
				dp[i][10] +=(dp[i][j])%mod;
			}
			dp[i][9] = dp[i-1][8];
			dp[i][10] +=(dp[i][9])%mod;
		}
		//���⵵ ��������� ������.
		System.out.println(dp[N][10]%mod);
	}
}
