package backjune;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
 * 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * 조건 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * ex) 입력 : baekjoon
 * 		출력 : 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
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
