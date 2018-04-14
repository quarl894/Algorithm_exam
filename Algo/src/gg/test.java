package gg;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class test {

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
		
		removeDuplicate3(list);

//		ListIterator iter = list.listIterator();
//
//		while(iter.hasNext()){
//			System.out.println(iter.next());
//		}
	}
	
	//1번 해결방법 속도 : 꼴등
	private static void removeDuplicate(LinkedList<String> linkedList){
		long startTime = System.nanoTime();	
		ListIterator<String> it = linkedList.listIterator();

		while(it.hasNext()){
			int firstIndex = linkedList.indexOf(it.next());
			int lastIndex = linkedList.lastIndexOf(linkedList.get(firstIndex));
			if(firstIndex != lastIndex){
				it.remove();
			}
		}
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime));

	}
	
	//2번 해결방법 속도 : 1위 pop 이용
	private static void removeDuplicate2(LinkedList<String> linkedList){
		long startTime = System.nanoTime();
		int loopCnt = linkedList.size();
		for(int i=0;i<loopCnt;i++){
			String em = linkedList.pop();
			if(linkedList.contains(em)) continue;
			linkedList.addLast(em);
		}
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime));
	}
	
	//3번째 LinkedHashSet 속도: 2위(내가 짠 알고리즘)
	private static void removeDuplicate3(LinkedList<String> linkedList){
		long startTime = System.nanoTime();	
		LinkedHashSet<String> result= new LinkedHashSet<String>();
		//Collections.sort(linkedList);
		result.addAll(linkedList);

		//System.out.println("확인:"+result);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime));
		Iterator<String> iter = result.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}
