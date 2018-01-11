package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
// queue class 설계 구현하기.
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
				System.out.println("뭘 빠트렸지?");
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
