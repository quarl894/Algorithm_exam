package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//문자열 폭탄
public class ex_9935 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
		String bomb = br.readLine();
		StringBuilder st = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--){
			stack.push(str.charAt(i));
			
			//폭탄문자열의 첫글자가 들어오고 스텍길이도 폭탄문자열의 길이만큼 들어와있을때
			if(stack.size()>=bomb.length() && stack.peek().equals(bomb.charAt(0))){
				boolean isBomb = true;
				
				//폭탄값인지 확인 아니면 false
				for(int j=1; j<bomb.length(); j++){
					if(stack.get(stack.size()-j-1)!=bomb.charAt(j)){
						isBomb = false;
						break;
					}
				}
				//폭탄값이 맞으면 push했던것을 pop함.
				if(isBomb){
					for(int j=0; j<bomb.length(); j++) stack.pop();
				}
			}	
		}
		int size = stack.size();
        if(stack.isEmpty()){
               System.out.println("FRULA");
        }else{
        	for(int i=0; i<size; i++) st.append(stack.pop());
        }
        System.out.println(st);
		br.close();
	}
}
