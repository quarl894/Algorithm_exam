package backjune;

import java.util.Scanner;

/*
 * �Է��� �� �ٷ� �̷���� �ְ�, �ִ� 100������ ���� ���ĺ� �빮��, �ҹ���, 
 * �׸��� ������ ('-', �ƽ�Ű�ڵ� 45)�θ� �̷���� �ִ�. 
 * ù��° ���ڴ� �׻� �빮���̴�. �׸���, ������ �ڿ��� �ݵ�� �빮���̴�. �� ���� ��� ���ڴ� ��� �ҹ����̴�.
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
