package backjune;

import java.util.Scanner;

//º°Âï±â
public class ex_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder st = new StringBuilder();
		for(int i=0; i<N; i++){
			for(int j=0; j<=i; j++){
				st.append("*");
			}
			st.append("\n");
		}
		System.out.println(st);
		sc.close();
	}

}
