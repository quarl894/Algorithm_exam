package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//감소하는 수
public class ex_1038 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[10][10];
		int[][] result = new int[10][10000001];
		int count =0;
		
		for(int i=0; i<10; i++){
			dp[0][i] = 1;
			result[0][i] = i;
		}
		for(int i=1; i<10; i++){
			for(int j=0; j<dp[i-1].length; j++){
				result[1][i-1] = 10*i +dp[i-1][j];
			}
		}
		for(int i=0; i<10; i++){
			System.out.println(result[1][i]);
		}
		
	}

}
