package backjune;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_1032 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		char[] chars = scan.next().toCharArray(); //첫번째 문자를 바로 받아서 문자로 쪼갬
		for(int i=1; i<num; i++){ //첫번째 단어는 받았으니 두번째부터 i=1
			String temp = scan.next();
			for(int j=0; j<chars.length; j++){
				if(chars[j] !=temp.charAt(j)){
					chars[j]='?';
				}
			}
		}
		System.out.println(String.valueOf(chars)); //char[]를 String으로 변환해준다.
	}
}
