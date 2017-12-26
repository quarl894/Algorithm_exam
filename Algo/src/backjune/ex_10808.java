package backjune;

import java.util.Scanner;

/*
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 이 때, 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
 * ex) 입력 : baekjoon
 * 출력 :1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
 * 출력 :1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0 
 */
public class ex_10808 {

	public static void main(String[] args) {
		String text;
		Scanner scan = new Scanner(System.in);
		text = scan.nextLine();
		char[] word =  text.toCharArray();
		int arr[] = new int[26];
		for(int i=0; i<26; i++){
			arr[i] = 0;
		}
		
		for(int i=0; i<word.length; i++){
			int num = word[i] -97;
			arr[num] +=1;
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
