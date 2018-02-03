package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//��ȣ�ڵ�
public class ex_2011 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len =str.length();
		int mod = 1000000;
		Character[] dp = new Character[len+1];
		for(int i=1; i<=len; i++){
			dp[i] = str.charAt(i-1);
		}
		int[] result = new int[len+1];
		//���� 2�϶� ����Ͽ� [0]�� 1 �Է�
		result[0] = 1;
		result[1] = 1; 
		//0�϶� ����ó��, ���� 1�϶� ����ó��
		if(str.equals("0")) System.out.println(0);
		else if(len==1) System.out.println(1);
		else{
			for(int i=2; i<=len; i++){
				if(dp[i]>'0'){
					result[i] = result[i-1]%mod;
				}
				//���ڸ��� Ȯ��
				int num = Integer.parseInt(str.substring(i-2,i));
				if(num>=10 && num<=26){
					result[i] = (result[i] +result[i-2]%mod)%mod;
				}
			}
			System.out.println(result[len]%mod);
		}
		br.close();
	}
}
