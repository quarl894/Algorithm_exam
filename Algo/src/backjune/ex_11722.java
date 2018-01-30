package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex_11722{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		int[] dp = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		reverse(arr);

		for(int i=0; i<N; i++){
			dp[i] =1;
			for(int j=0; j<i; j++){
				if(arr[j]<arr[i] && dp[i]<dp[j]+1){
					dp[i] = dp[j] +1;
				}
			}
		}
		Arrays.sort(dp);
		System.out.println(dp[N-1]);
		br.close();
	}
	
	//역순 출력
	private static int[] reverse(int[] arr){
		int count =0;
		int i=0;
		int j = arr.length-1;
		while(i!=arr.length/2){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}
}
