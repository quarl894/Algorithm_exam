package backjune;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ex_11727 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		System.out.println(tile(N));
		br.close();
	}
	
	private static int tile(int N){
		if(N==1) return 1;
		if(N==2) return 3;
		int[] dp = new int[N+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 3;
		for(int i=3; i<=N; i++){
			dp[i] = (dp[i-1] + dp[i-2]*2)%10007;
		}
		return dp[N];
	}

}