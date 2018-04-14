package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

//ÈüÁ¤·Ä
public class ex_2220 {
	static int dp[];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new int[100001];
		StringBuilder st = new StringBuilder();
		dp[2] = 1;
		dp[1] = 2;
		dp[0] = 3;
		if(N==1) System.out.println(N);
		else if(N==2){
			System.out.println("2 1");
		}else if(N==3){
			System.out.println("3 2 1");
		}
		else{
			for(int i=4; i<=N; i++){
				int len = i-1;
				while((len-1)!=0){
					swap(dp,len-1,(len/2)-1);
					len = len/2;
				}
				dp[0] = i;
				dp[i-1] = 1;
				}
			for(int k=0; k<N; k++){
				st.append(dp[k]);
				st.append(" ");
			}
			System.out.println(st);
		}
		
		br.close();
	}
	
	static private void swap(int[] dp, int start, int end){
		int temp = dp[start];
		dp[start] = dp[end];
		dp[end] = temp;
	}
}
