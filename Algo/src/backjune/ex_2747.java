package backjune;

import java.util.Scanner;

//피보나치
public class ex_2747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		if(N==0) System.out.println(0);
		else System.out.println(fibo(N));
	}
	
	static private int fibo(long n){
		if(n<=2) return 1;
		else{
			return fibo(n-1)+fibo(n-2);
		}
	}

}
