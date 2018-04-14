package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 줄 세우기
public class ex_2631 {
	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
		int[] dp = new int[N];
		for(int i=0; i<N; i++){
			dp[i] = 1;
			for(int j=0; j<i; j++){
				if(arr[i]>arr[j] && dp[i]<dp[j]+1){
					dp[i]++;
				}
			}
			if(max<dp[i]) max = dp[i];
		}
		System.out.println(N-max);
		br.close();
	}

}
