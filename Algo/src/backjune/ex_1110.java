package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//���ϱ� ����Ŭ
public class ex_1110 {
	static int count =0;
	static int number = 0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		number = N;
		System.out.println(recur(N));
		br.close();
	}
	static private int recur(int N){
		count++;
		int num = N%10; //������ �ڸ�
		int new_num = (num + (N/10))%10; //���ο���� ������ �ڸ�
		int result = num*10 + new_num;
		if(number==result) return count;
		else return recur(result);
	}

}
