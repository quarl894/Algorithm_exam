package backjune;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_1032 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		char[] chars = scan.next().toCharArray(); //ù��° ���ڸ� �ٷ� �޾Ƽ� ���ڷ� �ɰ�
		for(int i=1; i<num; i++){ //ù��° �ܾ�� �޾����� �ι�°���� i=1
			String temp = scan.next();
			for(int j=0; j<chars.length; j++){
				if(chars[j] !=temp.charAt(j)){
					chars[j]='?';
				}
			}
		}
		System.out.println(String.valueOf(chars)); //char[]�� String���� ��ȯ���ش�.
	}
}
