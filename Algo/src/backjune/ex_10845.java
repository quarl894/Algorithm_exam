package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * push X: ���� X�� ť�� �ִ� �����̴�.
pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
size: ť�� ����ִ� ������ ������ ����Ѵ�.
empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 */
// queue class ���� �����ϱ�.
public class ex_10845 {
	public static void main(String[] args) throws Exception{
		queue q = new queue();
		q.arr =  new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			switch(str){
			case "push" :
				int num = Integer.parseInt(st.nextToken());
				q.push(num);
				break;
			case "pop" :
				System.out.println(q.pop());
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				System.out.println(q.empty());
				break;
			case "front":
				System.out.println(q.front());
				break;
			case "back":
				System.out.println(q.back());
				break;
			default :
				System.out.println("�� ��Ʈ����?");
				break;
			}
		}
		br.close();
	}
}

class queue{
	int x;
	int empty;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	public void push(int x){
		arr.add(x);
	}
	public int pop(){
		if(arr.isEmpty()) return -1;
		else{
			int result = arr.get(0);
			arr.remove(0);
			return result;
		}
	}
	public int size(){
		return arr.size();
	}
	public int empty(){
		if(arr.isEmpty()) return 1;
		else return 0;
	}
	public int front(){
		if(arr.isEmpty()) return -1;
		else return arr.get(0);
	}
	public int back(){
		if(arr.isEmpty()) return -1;
		else return arr.get(arr.size()-1);
	}
}
