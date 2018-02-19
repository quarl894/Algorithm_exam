package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//연속합
//모두 음수일때도 생각해야함.
// 2차원배열 10만*10만하면 Heap size 초과돼서 런타임에러남.
//케이스 5 -1 -2 5  답: 7이나와야함
public class ex_1912 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[100001];
		int result =0;
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MIN_VALUE;
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++){
			dp[i] = Integer.parseInt(stk.nextToken());
			if(Min<dp[i]) Min = dp[i];
		}
		if(Min<=0 || N==1) System.out.println(Min);
		else{
			Max = dp[0];
			for(int i=0; i<N; i++){
				for(int j=i; j<N; j++){
					result +=dp[j];
					if(result>Max) Max = result;
				}
				result = 0;
			}
			System.out.println(Max);
		}

		br.close();
		
	}

}
