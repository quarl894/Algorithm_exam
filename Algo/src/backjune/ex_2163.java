package backjune;

import java.util.Scanner;

public class ex_2163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		N = sc.nextInt();
		M = sc.nextInt();
		int result = (N-1) + N*(M-1);
		System.out.println(result);
	}
}
