package backjune;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, 
 * �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
 * ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� : ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * ex) �Է� : baekjoon
 * 		��� : 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */
public class ex_10809 {
	public static void main(String[] args) {
		String text;
		Scanner scan = new Scanner(System.in);
		text = scan.nextLine();
		char[] result =  text.toCharArray();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<26; i++){
			list.add(-1);
		}
		for(int i=0; i<result.length; i++){
			int temp = result[i]-97;
			if(list.get(temp)==-1){
				list.set(temp, i);				
			}else{
				continue;
			}
		}
		ListIterator iter = list.listIterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
	}
}
