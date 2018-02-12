package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//ÆÓ¸°µå·Ò?
public class ex_10942_2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] dp = new String[N];
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++){
			dp[i] = stk.nextToken();
		}
		//Áú¹® È½¼ö
		int count = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		for(int i=0; i<count; i++){
			String[] sp = br.readLine().split(" ");
			int start = Integer.parseInt(sp[0]);
			int end = Integer.parseInt(sp[1]);
			st.append(palindrom(dp,start,end));
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}
	
	//ÆÓ¸°µå·Ò ÇÔ¼ö
	private static int palindrom(String[] str, int start, int end){
		int len = end-start+1;
		int result = 1;
		//È¦¼öÀÏ½Ã
		int number =1;
		// 1 5    0  2
		for(int i=start-1; i<(len/2)+start-1; i++){
			if(str[i].equals(str[end-number])){
				number++;
				continue;
			}else{
				result =0;
				break;
			}
		}
		return result;
	}

}
