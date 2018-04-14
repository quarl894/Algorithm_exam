package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//알람시계
public class ex_2884 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(stk.nextToken());
		int s = Integer.parseInt(stk.nextToken());
		
		int clock = m*60 + s-45;
		if(clock<0){
			clock +=1440;
		}
		System.out.println(clock/60 +" "+clock%60);
		br.close();
	}
}
