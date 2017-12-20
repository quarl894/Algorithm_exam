package ch2_LinkedList;

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
		
		// ��� ��ġ Ž��
		Node node(int index){
			Node x= head;
			for(int i=0; i<index; i++){
				x = x.next;
			}
			return x;
		}
		// ù��° ��� ��ġ�� �߰�
		public void addFirst(Object input){
			//���ο� ������.
			Node newNode = new Node(input);
			//���� ��� ����
			newNode.next = head;
			
			head = newNode;
			size++;
			if(head.next == null){
				tail = head;
			}
		}
		//������ �����ġ�� �߰�
		public void addLast(Object input){
			Node newNode = new Node(input);
			newNode.next = null;
			//��尡 ���ٸ� ù��° ��� �߰�
			if(size==0){
				addFirst(input);
			}else{
				tail.next = newNode;
				tail = newNode;
				size++;
			}
		}
		//��� �߰� ����
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
		//������ Ȯ��
		public int size(){
			return size;
		}
		// ������Ʈ ��������
		public Object get(int k){
			Node temp = node(k);
			return temp.data;
		}
		
		//Ž���ϱ�
		public int indexOf(Object data){
		    // Ž�� ����� �Ǵ� ��带 temp�� �����մϴ�.
		    Node temp = head;
		    // Ž�� ����� ���° ������Ʈ�� �ִ����� �ǹ��ϴ� ������ index�� ����մϴ�.
		    int index = 0;
		    // Ž�� ���� Ž�� ����� ���� ���մϴ�. 
		    while(temp.data != data){
		        temp = temp.next;
		        index++;
		        // temp�� ���� null�̶�� ���� �� �̻� Ž�� ����� ���ٴ� ���� �ǹ��մϴ�.�� �� -1�� �����մϴ�.
		        if(temp == null)
		            return -1;
		    }
		    // Ž�� ����� ã�Ҵٸ� ����� �ε��� ���� �����մϴ�.
		    return index;
		}
}
