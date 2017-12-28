package backjune;

import java.util.Scanner;

/*
 * ��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. 
 * �ٸ� ���ڸ� �������� ���̾��� ���� ��ġ�� ���ư��⸦ ��ٷ��� �Ѵ�.
���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, 
�� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.
������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. 
��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. 
���� ���, UNUCIC�� 868242�� ����. �ҸӴϰ� �ܿ� �ܾ �־����� ��, 
�� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class ex_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word =word.toUpperCase();
		System.out.println(dial(word));
	}
	
	private static int dial(String str){
		char[] chars = str.toCharArray();
		int count =0;
		for(int i=0; i<chars.length; i++){
			count +=change(chars[i]);
		}
		return count;
	}
	
	private static int change(char chars){
		int num = chars -65; //char -> int�� ��ȯ
		switch(num){
		case -33:
			return 2;
		case 0: case 1: case 2: //ABC
			return 3;
		case 3: case 4: case 5: //DEF
			return 4;
		case 6: case 7: case 8: //GHI
			return 5;
		case 9: case 10: case 11: //JKL
			return 6;
		case 12: case 13: case 14: //MNO
			return 7;
		case 15: case 16: case 17: case 18: //PQRS
			return 8;
		case 19: case 20: case 21://TUV
			return 9;
		case 22: case 23: case 24: case 25://WXYZ
			return 10;
		default :
			return 11;
		}
	}
}
