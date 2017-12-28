package backjune;

import java.util.Scanner;

/*
 * 입력은 한 줄로 이루어져 있고, 최대 100글자의 영어 알파벳 대문자, 소문자, 
 * 그리고 하이픈 ('-', 아스키코드 45)로만 이루어져 있다. 
 * 첫번째 글자는 항상 대문자이다. 그리고, 하이픈 뒤에는 반드시 대문자이다. 그 외의 모든 문자는 모두 소문자이다.
 */
public class ex_2902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] chars = word.toCharArray();
		
		for(int i=0; i<word.length(); i++){
			int num = chars[i];
			if(num>=65 && num<=90){
				System.out.print(chars[i]);
			}
		}
	}
}
