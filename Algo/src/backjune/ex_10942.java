package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//ÆÓ¸°µå·Ò?
public class ex_10942 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] sp = str.split(" ");
		str = str.replaceAll(" ", "");
		int[] dp = new int[N+1];
		for(int i=1; i<N+1; i++){
			dp[i] = Integer.parseInt(sp[i-1]);
		}
		//Áú¹® È½¼ö
		int count = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		for(int i=0; i<count; i++){
			StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(stk.nextToken());
			int end = Integer.parseInt(stk.nextToken());
			st.append(palindrom(str.substring(start-1, end)));
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}
	
	//ÆÓ¸°µå·Ò ÇÔ¼ö
	private static int palindrom(String str){
		int len = str.length();
		int result = 1;
		int end = len;
		//È¦¼öÀÏ½Ã
		if(len%2==1){
			end = (len/2)+1;
		}else{
			end = len/2;
		}
		for(int i=0; i<end; i++){
			if(str.charAt(i)==str.charAt(len-1-i)){
				continue;
			}else{
				result =0;
				break;
			}
		}
		return result;
	}

}
