package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex_1699 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int dp[] = new int[N+1];
		
		//�ʱ�ȭ(�� 1^2�϶� ����)
		for(int i=1; i<=N; i++){
			dp[i] = i;
		}
		
		// 1�� ���ϴ°� j*j �������� �߰��Ǵ� �ǹ�.
		for(int i=2; i<=N; i++){
			for(int j=2; j*j<=i; j++){
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
			}
		}
		System.out.println(dp[N]);
		br.close();
	}
}
