package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//������
//��� �����϶��� �����ؾ���.
// 2�����迭 10��*10���ϸ� Heap size �ʰ��ż� ��Ÿ�ӿ�����.
//���̽� 5 -1 -2 5  ��: 7�̳��;���
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
