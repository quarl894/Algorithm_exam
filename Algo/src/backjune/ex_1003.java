package backjune;

import java.util.Scanner;

public class ex_1003 {
	static int c0=0;
	static int c1=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, result;
		num = sc.nextInt();

		for(int i=0; i<num; i++){
			result = sc.nextInt();
			fibonacci(result);
			System.out.println(c0+" "+c1);
			c0=0;
			c1=0;
		}
	}
	
	//fivonacci function
	private static int fibonacci(int n) {
	    if (n==0) {
	    	c0++;
	    	//System.out.print("0");
	        return 0;
	    } else if (n==1) {
	    	c1++;
	    	//System.out.print("1");
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
}
