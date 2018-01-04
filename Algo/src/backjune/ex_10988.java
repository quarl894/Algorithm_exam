package backjune;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex_10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(palindrom(str));
	}
	
	private static int palindrom(String str){
		String temp = reverseString(str);
		if(str.equals(temp)) return 1;
		else return 0;
		
	}
	static String reverseString(String text) {
		return (new StringBuilder(text)).reverse().toString();
    }
}
