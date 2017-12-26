package ch2_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

//LinkedList n번째 삭제하기
public class ex3_link {
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
			System.out.printf(iter.next()+", ");
		}
		list.remove(3);
		System.out.println();
		
		ListIterator iter2 = list.listIterator();
		while(iter2.hasNext()){
			System.out.printf(iter2.next()+", ");
		}
	}

}
