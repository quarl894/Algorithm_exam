package backjune;

import java.util.Scanner;

/*
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 */
public class ex_2743 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text;
		text = scan.nextLine();
		
		System.out.println(text.length());
	}
}
