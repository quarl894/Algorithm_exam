package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex_10828 {
	public static void main(String[] args) throws Exception{
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			switch(str){
			case "push":
				int num = Integer.parseInt(st.nextToken());
				stack.push(num);
				break;
			case "pop":
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.isEmpty()) System.out.println("1");
				else System.out.println("0");
				break;
			case "top":
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.peek());
				break;
			default :
				System.out.println("¹¹°¡ ºüÁ³Áö?");
				break;
			}
		}
		br.close();	
	}
}
