package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//수 정렬하기 2
public class ex_2751 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		int[] dp = new int[N];
		for(int i=0; i<N; i++){
			dp[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(dp);
		for(int a : dp){
			st.append(a);
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}

}
