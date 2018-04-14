package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//���ڿ� ��ź
public class ex_9935 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
		String bomb = br.readLine();
		StringBuilder st = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--){
			stack.push(str.charAt(i));
			
			//��ź���ڿ��� ù���ڰ� ������ ���ر��̵� ��ź���ڿ��� ���̸�ŭ ����������
			if(stack.size()>=bomb.length() && stack.peek().equals(bomb.charAt(0))){
				boolean isBomb = true;
				
				//��ź������ Ȯ�� �ƴϸ� false
				for(int j=1; j<bomb.length(); j++){
					if(stack.get(stack.size()-j-1)!=bomb.charAt(j)){
						isBomb = false;
						break;
					}
				}
				//��ź���� ������ push�ߴ����� pop��.
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
