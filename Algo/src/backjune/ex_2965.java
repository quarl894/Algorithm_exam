package backjune;

import java.util.Scanner;

public class ex_2965 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		int section = Math.max(C-B, B-A);
		System.out.println(section-1);
	}
}
