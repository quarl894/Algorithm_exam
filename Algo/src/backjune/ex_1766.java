package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

//�α����� ��й�ȣ
public class ex_1766 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Hashtable<String,Integer> hash = new Hashtable<>();
		String pw = "";
		for(int i=0; i<N; i++){
			//�յ� ���ÿ� ����
			String str = br.readLine();
			String str2 = reverse(str);
			// 1���� ��� ���ؼ� ������.
			if(N==1){
				pw = str;
				break;
			}
			//�Ӹ�����̸� hash�� �ѹ��� ����Ǽ� �ؿ� ���ǿ� �ȵ�.
			if(str.equals(str2)){
				pw = str;
				break;
			}
			// ���� ���� �ִٸ� �� ���� ��й�ȣ
			if(hash.containsKey(str) || hash.containsKey(str2)){
				pw =str;
				break;
			}else{
				hash.put(str,0);
				hash.put(str2,0);
			}
		}
		int len = pw.length()/2 ;
		System.out.println(pw.length() + " " +pw.charAt(len));
		br.close();
	}
	
	//���ڿ� ����
	static private String reverse(String str){
		String result = "";
		for(int i=str.length()-1; i>=0; i--){
			result +=str.charAt(i);
		}
		return result;
	}

}
