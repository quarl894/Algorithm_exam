package backjune;

import java.util.ArrayList;
import java.util.Scanner;

/*영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 
 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다. 
이 문장의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분된다.*/
public class ex_1152 {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		
		do{
		//	System.out.println("문장을 입력해주세요:");
			str = scan.nextLine();
		}while(str.length()>1000000);
		System.out.println(wordNum(str));
	}
	
	private static int wordNum(String str){
		char[] result = str.toCharArray();
		
		int count = 0;
		for(int i=1; i<result.length-1; i++){
			if(result[i]==' ' && result[i-1]!=' ' && result[i+1]!=' '){
				count++;
			}
		}
	
		if(str.trim().length()==0) return count;
		else return count+1;
	}
}