package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//°ýÈ£
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
				if(input[i].charAt(j)=='('){
					stack.push(input[i].charAt(j));
				}else if(input[i].charAt(j)==')'){
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
