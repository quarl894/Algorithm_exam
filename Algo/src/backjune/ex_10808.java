package backjune;

import java.util.Scanner;

/*
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. �� ��, �� ���ĺ��� �ܾ �� ���� ���ԵǾ� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * �ܾ ���ԵǾ� �ִ� a�� ����, b�� ����, ��, z�� ������ �������� �����ؼ� ����Ѵ�.
 * ex) �Է� : baekjoon
 * ��� :1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
 * ��� :1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0 
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
