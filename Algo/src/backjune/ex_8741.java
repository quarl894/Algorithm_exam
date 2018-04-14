package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//이진수의 합
public class ex_8741 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder One = new StringBuilder();
		StringBuilder Zero = new StringBuilder();
		final int K = Integer.parseInt(br.readLine());
		for (int i = 1; i <= K; i++){
			One.append('1');
		}
		System.out.print(One.toString());
		for (int i = 1; i < K; i++){
			Zero.append('0');
		}
		System.out.print(Zero.toString());
		br.close();
	}

}
