package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex_1001 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		
		int N = Integer.parseInt(sp[0]);
		int M = Integer.parseInt(sp[1]);
		System.out.println(N-M);
		br.close();
		
	}
}
