package backjune;

import java.util.Scanner;

/*
 * 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
 * 다른 숫자를 누르려면 다이얼이 원래 위치로 돌아가기를 기다려야 한다.
숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 
한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 
즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 
예를 들어, UNUCIC는 868242와 같다. 할머니가 외운 단어가 주어졌을 때, 
이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.
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
		int num = chars -65; //char -> int로 변환
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
