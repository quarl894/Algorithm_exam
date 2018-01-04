package backjune;

import java.util.Scanner;

/*
 * 입력으로 주어지는 문자열에서 연속으로 3개의 문자가 JOI 또는 IOI인 곳이 각각 몇 개 있는지 구하는 프로그램을 작성하시오. 
 * 문자열을 알파벳 대문자로만 이루어져 있다. 
 * 예를 들어, 아래와 같이 "JOIOIOI"에는 JOI가 1개, IOI가 2개 있다.
 */
public class ex_5586 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text= sc.next();
		Num(text);
	}
	
	//공통된것인 'OI'이므로 뒤에서부터 반복문을 통해 OI를 찾고 J나 I인것만 찾아서 counting해줌.
	private static void Num(String str){
		int countJ=0, countI=0;
		char[] chars = str.toCharArray();
		for(int i=chars.length-1; i>1; i--){
			if(chars[i]=='I' && chars[i-1]=='O'){
				if(chars[i-2]=='J') countJ++;
				if(chars[i-2]=='I') countI++;
			}else{
				continue;
			}
		}
		System.out.println(countJ);
		System.out.println(countI);
	}
}
