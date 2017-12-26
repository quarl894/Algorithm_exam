package ch2_LinkedList;

import ch2_LinkedList.LinkedList.Node;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size =0;
	
	public class Node{
		private Object data;
		private Node next;
		public Node(Object input){
			this.data = input;
			this.next = null;
		}
	}
		public String toString(){
			if(head == null){
				return "[]";
			}
			
			Node temp = head;
			String str = "[";
			while(temp.next !=null){
				str +=temp.data + ", ";
				temp = temp.next;
			}
			str += temp.data;
			return str+"]";
		}
		
		// 노드 위치 탐색
		Node node(int index){
			Node x= head;
			for(int i=0; i<index; i++){
				x = x.next;
			}
			return x;
		}
		// 첫번째 노드 위치에 추가
		public void addFirst(Object input){
			//새로운 노드생성.
			Node newNode = new Node(input);
			//다음 노드 지정
			newNode.next = head;
			
			head = newNode;
			size++;
			if(head.next == null){
				tail = head;
			}
		}
		//마지막 노드위치에 추가
		public void addLast(Object input){
			Node newNode = new Node(input);
			newNode.next = null;
			//노드가 없다면 첫번째 노드 추가
			if(size==0){
				addFirst(input);
			}else{
				tail.next = newNode;
				tail = newNode;
				size++;
			}
		}
		//노드 중간 삽입
		public void add(int k, Object input){
			if(k==0){
				addFirst(input);
			}else{
				Node temp1 = node(k-1);
				Node temp2 = temp1.next;
				Node newNode = new Node(input);
				temp1.next= newNode;
				newNode.next = temp2;
				size++;
				if(newNode.next == null){
					tail = newNode;
				}
				
			}
		}
		
		public Object removeFirst(){
			Node temp = head;
			head = temp.next;
			Object returndata = temp.data;
			temp = null;
			size--;
			return returndata;
		}
		
		public Object remove(int k){
			if(k==0){
				return removeFirst();
			}
			Node temp = node(k-1);
			
			Node deleteNode = temp.next;
			temp.next = temp.next.next;
			
			Object returndata = deleteNode.data;
			if(deleteNode==tail){
				tail = temp;
			}
			
			deleteNode = null;
			size--;
			return returndata;
			
		}
		//사이즈 확인
		public int size(){
			return size;
		}
		// 엘리먼트 가져오기
		public Object get(int k){
			Node temp = node(k);
			return temp.data;
		}
		
		//탐색하기
		public int indexOf(Object data){
		    // 탐색 대상이 되는 노드를 temp로 지정합니다.
		    Node temp = head;
		    // 탐색 대상이 몇번째 엘리먼트에 있는지를 의미하는 변수로 index를 사용합니다.
		    int index = 0;
		    // 탐색 값과 탐색 대상의 값을 비교합니다. 
		    while(temp.data != data){
		        temp = temp.next;
		        index++;
		        // temp의 값이 null이라는 것은 더 이상 탐색 대상이 없다는 것을 의미합니다.이 때 -1을 리턴합니다.
		        if(temp == null)
		            return -1;
		    }
		    // 탐색 대상을 찾았다면 대상의 인덱스 값을 리턴합니다.
		    return index;
		}
		
		public ListIterator listIterator(){
			return new ListIterator();
		}
		
		public class ListIterator {
			private Node lastReturned;
			private Node next;
			private int nextIndex;
			
			ListIterator(){
				next = head;
				nextIndex = 0;
			}
			public Object next() {
			    lastReturned = next;
			    next = next.next;
			    nextIndex++;
			    return lastReturned.data;
			}
			public boolean hasNext() {
			    return nextIndex < size();
			}
			public void add(Object input){
			    Node newNode = new Node(input);
			    if(lastReturned == null){
			        head= newNode;
			        newNode.next = next;
			    } else {
			        lastReturned.next = newNode;
			        newNode.next = next;
			    }
			    lastReturned = newNode;
			    nextIndex++;
			    size++;
			}
			public void remove(){
			    if(nextIndex == 0){
			        throw new IllegalStateException();
			    }
			    LinkedList.this.remove(nextIndex-1);
			    nextIndex--;
			}
		}
}
