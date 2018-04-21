package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//계단 오르기
public class ex_2579 {
	public static void main(String[] args) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 int N = Integer.parseInt(br.readLine());
		 int arr[] = new int[N+1];
		 arr[0] = 0;
		 int dp[] = new int[N+1];
		 for(int i=1; i<=N; i++){
			 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			 arr[i] = Integer.parseInt(st.nextToken());
		 }
		 br.close();
		 
		 if(N>0) dp[1] = arr[1];
		 if(N==2) dp[2] = arr[1]+arr[2];
		 //index 초과를 위한 if문
		 if(N>2){
			 dp[2] = arr[1]+arr[2];
			 // 1. 선택하고 연속이 아닌 경우 2. 선택하고 연속인경우(앞수도 선택시) 
			 for(int i=3; i<=N; i++){
				 dp[i] = Math.max(arr[i-1]+dp[i-3],dp[i-2]) + arr[i];
			 }
		 }
		 System.out.println(dp[N]);
	}
}
