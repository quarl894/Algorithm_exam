package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//지능형 기차
public class ex_2455 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int max = 0;
		int[] dp = new int[4];
		for(int i=0; i<4; i++){
			String[] sp = br.readLine().split(" ");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			dp[i] = b-a;
			num += dp[i];
			if(max<num) max =num;
		}
		System.out.println(max);
		br.close();
	}

}
