package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//¸®¸ðÄÁ
public class ex_1107 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int channel = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[500001];
		int[] fail = new int[N];
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			fail[i] = Integer.parseInt(stk.nextToken());
		}
		int Min = Math.abs(100-N);
		if(Min==0) System.out.println(0);
		else{
			int temp = N;
			while(temp<=500000){
				
				
			}
		}
		br.close();
	}

}
