package backjune;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 * ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
 * ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. 
 * ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
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
