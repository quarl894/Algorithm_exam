package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//���ݱ�
//1�� �Ǵ� 3���� ������ �� ���� ���������� �� �������� ����� �̱�.
public class ex_9655 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		if(N%2==0) System.out.println("CY");
		else System.out.println("SK");
		br.close();
		
	}

}
