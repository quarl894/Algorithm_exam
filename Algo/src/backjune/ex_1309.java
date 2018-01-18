package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//동물원
public class ex_1309 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[N][2];
		dp[0][0] = 1;
		dp[0][1] = 2;
		br.close();
		//[0]이 마지막줄이 둘다 빈칸일경우
		//[1]이 마지막줄이 한칸만 빈칸일 경우
		for(int i=1; i<N; i++){
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
			dp[i][1] = (dp[i-1][0]*2)%9901 + (dp[i-1][1]);
			dp[i][0] %=9901;
			dp[i][1] %=9901;
		}
		long num =(dp[N-1][0] +dp[N-1][1])%9901;
		System.out.println(num);
	}
}
