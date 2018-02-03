package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//암호코드
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
		//길이 2일때 대비하여 [0]에 1 입력
		result[0] = 1;
		result[1] = 1; 
		//0일때 예외처리, 길이 1일때 예외처리
		if(str.equals("0")) System.out.println(0);
		else if(len==1) System.out.println(1);
		else{
			for(int i=2; i<=len; i++){
				if(dp[i]>'0'){
					result[i] = result[i-1]%mod;
				}
				//두자리수 확인
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
