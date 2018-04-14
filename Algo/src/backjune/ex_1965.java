package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//상자 넣기
public class ex_1965 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int Max = 0;
		int[] arr = new int[N];
		int[] dp = new int[N];
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		for(int i=0; i<N; i++){
			dp[i] = 1;
			for(int j=0; j<i; j++){
				if(arr[i]>arr[j] && dp[i]<dp[j]+1) dp[i]++;
			}
			if(Max<dp[i]) Max = dp[i];
		}
		System.out.println(Max);
		br.close();
	}
}
