package backjune;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
public class ex_1157 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		word = scan.nextLine();
		String change_word = word.toLowerCase();
		System.out.println(change_word);
		alph(word);
	}
	
	private static void alph(String word){
		int arr[] = new int[26];
		char[] text = word.toCharArray();
		for(int i=0; i<26; i++){
			arr[i] = 0;
		}
		for(int i=0; i<text.length; i++){
			int num = text[i] -65;
			if(num>26){
				num -=32;
			}
			arr[num] +=1;
		}
		
		int[] arr1;
		arr1 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr);
		if(arr[25]==arr[24]){
			System.out.println("?");
		}else{
			for(int i=0; i<26; i++){
				if(arr[25]== arr1[i]){
					System.out.println((char)(i+65));
				}
			}
		}
	}
}
