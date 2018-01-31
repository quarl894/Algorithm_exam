package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//��ȭ��ȣ ���
public class ex_5052 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		for(int i=0; i<N; i++){
			int Tk = Integer.parseInt(br.readLine());
			String arr[] = new String[Tk];
			for(int j=0; j<Tk; j++){
				arr[j] = br.readLine();
			}
			st.append(Result(arr));
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}
	
	//
	private static String Result(String[] arr){
		//�ϳ��� �� �� 
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				//index�ʰ� ���� ���ؼ� �� ���� ���ڿ��� ���缭 ����.
				int len = Math.min(arr[i].length(), arr[j].length());
				int count =0; //���� Ƚ��
				for(int k=0; k<len; k++){
					if(arr[i].charAt(k) == arr[j].charAt(k)){
						count++;
					}else{
						break;
					}
				}
				//���� Ƚ���� ���ڿ��� �����ϸ� ��ü�� �� ���� ����̴� "NO"���
				if(count==len){
					return "NO";
				}
			}
		}
		//NO�� ������ YES ���
		return "YES";
	}

}
