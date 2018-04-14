package backjune;

import java.util.Scanner;

public class ex_2742 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder st = new StringBuilder();
		while(N>0){
			st.append(N--);
			st.append("\n");
		}
		System.out.println(st);
		sc.close();
	}

}
