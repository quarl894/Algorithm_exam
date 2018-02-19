package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//적어도 대부분의 배수
public class ex_1145 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		int[] dp = new int[5];
		int count =0;
		int result = 0;
		for(int i=0; i<5; i++){
			dp[i] = Integer.parseInt(stk.nextToken());
		}
		Arrays.sort(dp);
		//그냥 노가다... 숫자가 작아서 되나 해봄..
		for(int i=dp[0]+1; ; i++){
			for(int j=0; j<5; j++){
				if(i%dp[j]==0) count++;
			}
			if(count>=3){
				result = i;
				break;
			}else{
				count=0;
			}
		}
		System.out.println(result);
	}

}
