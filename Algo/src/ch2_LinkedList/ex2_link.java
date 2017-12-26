package ch2_LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

//링크드리스트 끝에서 n번째 값 찾기
public class ex2_link {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("kkk");
		
		ListIterator iter = list.listIterator();

		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		Nfind(list,0);
	}
	
	private static void Nfind(LinkedList link, int number){
		long startTime = System.nanoTime();	
		//revers로 역정렬함.
		Collections.reverse(link);
		//뒤에서 n번째 입력한 값을 찾음.
		System.out.println(link.get(number).toString());
		long endTime = System.nanoTime();	
		System.out.println(endTime-startTime);
	}

}
