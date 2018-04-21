package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// ���� �� �����ϴ� �κ� ���� 
public class ex_11053 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		int[] dp = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		for(int i=0; i<N; i++){
			//�ڱ� ���� 1�� ����
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
}
