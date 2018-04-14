package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//��� ������
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
		 //index �ʰ��� ���� if��
		 if(N>2){
			 dp[2] = arr[1]+arr[2];
			 // 1. �����ϰ� ������ �ƴ� ��� 2. �����ϰ� �����ΰ��(�ռ��� ���ý�) 
			 for(int i=3; i<=N; i++){
				 dp[i] = Math.max(arr[i-1]+dp[i-3],dp[i-2]) + arr[i];
			 }
		 }
		 System.out.println(dp[N]);
	}
}
