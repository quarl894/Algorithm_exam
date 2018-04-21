package Algo_tset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Line 1��
public class Line1 {
	// ��� 9.5�� ���ö����� 10���� ������
	// �ð� ���⵵ : O(N) 
	// �������⵵ O(1) Sum�� ����Ǳ� ����
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum =0;
		float avg =0.0f;
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			sum +=Integer.parseInt(stk.nextToken());
		}
		avg = ((float)sum/(float)N);
		int count =0;
		while(avg<9.5){
			sum +=10;
			count++;
			avg = ((float)sum/(float)(N+count));
		}
		System.out.println(count);
		br.close();
	}

}
