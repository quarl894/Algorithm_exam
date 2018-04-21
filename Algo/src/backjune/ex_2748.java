package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex_2748 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder st= new StringBuilder();
		long[] fibo = new long[92];
		
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i=2; i<=91; i++){
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		System.out.println(fibo[num]);
		br.close();
		
	}
}
