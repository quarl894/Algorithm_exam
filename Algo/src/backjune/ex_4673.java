package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//¼¿ÇÁ ³Ñ¹ö
public class ex_4673 {
	public static void main(String[] args) throws Exception{
		int[] dp = new int[10036];
		for(int i=1; i<=10000; i++){
			dp[result(i)]=1;
			if(dp[i]!=1) System.out.println(i);
		}
	}
	static private int result(int i){
		int res =i;
		while(i>0){
			res +=i%10;
			i/=10;
		}
		return res;
	}
}
