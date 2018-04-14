package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

//민균이의 비밀번호
public class ex_1766 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Hashtable<String,Integer> hash = new Hashtable<>();
		String pw = "";
		for(int i=0; i<N; i++){
			//앞뒤 동시에 저장
			String str = br.readLine();
			String str2 = reverse(str);
			// 1개일 경우 안해서 에러남.
			if(N==1){
				pw = str;
				break;
			}
			//팰린드롬이면 hash에 한번만 저장되서 밑에 조건에 안들어감.
			if(str.equals(str2)){
				pw = str;
				break;
			}
			// 같은 값이 있다면 그 값이 비밀번호
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
	
	//문자열 역순
	static private String reverse(String str){
		String result = "";
		for(int i=str.length()-1; i>=0; i--){
			result +=str.charAt(i);
		}
		return result;
	}

}
