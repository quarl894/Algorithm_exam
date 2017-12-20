package ch2_LinkedList;
// 비정렬 연결 리스트에서 중복 문자를 제거하는 코드를 작성하라.
public class ex1_link{
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addFirst(30);
		numbers.addLast(20);
		numbers.addLast(10);
		numbers.add(2, 15);
		
		System.out.println(numbers.toString());
	}
}
