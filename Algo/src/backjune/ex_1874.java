package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class ex_1874 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		Stack<Integer> stk = new Stack<>();
		int count =1;
		stk.push(1);
		st.append("+"+"\n");
		Loop1:for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			if(stk.isEmpty()){
				stk.push(++count); 
				st.append("+"+"\n");
			}
			while(stk.peek()!=num){
				if(stk.peek()<num){
					stk.push(++count);
					st.append("+"+"\n");
				}else{
					count =0;
					break Loop1;
				}
			}
			stk.pop();
			st.append("-"+"\n");
		}
		
		if(count==0) System.out.println("NO");
		else System.out.println(st);
		br.close();
	}
}
