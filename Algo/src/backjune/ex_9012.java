package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//괄호
// 스택으로 괄호 확인
public class ex_9012 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		String[] input = new String[N];
		
		for(int i=0; i<N; i++){
			input[i] = br.readLine();
		}
		
		for(int i=0; i<input.length; i++){
			for(int j=0; j<input[i].length(); j++){
				//'('이면 stack push함.
				if(input[i].charAt(j)=='('){
					stack.push(input[i].charAt(j));
				// ')'이 들어오면 pop을 함.
				}else if(input[i].charAt(j)==')'){
					// 이미 stack이 비어있을 수 있으니 예외처리함.
					if(stack.isEmpty()){
						stack.push('x');
						break;
					}
					else stack.pop();
				}
			}
			if(stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
			stack.clear();
		}
		br.close();
	}
}
