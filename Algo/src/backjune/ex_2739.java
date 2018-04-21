package backjune;

import java.util.Scanner;

// ±¸±¸´Ü
public class ex_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder st = new StringBuilder();
		for(int i=1; i<=9; i++){
			st.append(N+" * "+i+" = "+N*i+"\n");
		}
		System.out.println(st);
		sc.close();
	}

}
