package ch2_LinkedList;
// ������ ���� ����Ʈ���� �ߺ� ���ڸ� �����ϴ� �ڵ带 �ۼ��϶�.
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
