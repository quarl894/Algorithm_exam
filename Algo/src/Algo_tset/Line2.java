package Algo_tset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Line 2��
public class Line2 {
	// ���� : 1~N���� �� ���� �������� ���� �ش� �Ǳ� ������ ī�����Ͽ� ���
	// �ð����⵵ : O(N)
	// �������⵵ : O(1) room�� �ʿ��ϱ� ������
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int room = Integer.parseInt(br.readLine());
		int count =0;
		for(int i=1; i<=room; i++){
			if(room%i==0) count++;
		}
		System.out.println(count);
	}

}
