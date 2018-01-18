package backjune;

import java.util.Scanner;
import java.util.Stack;

public class ex_1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		int N = sc.nextInt();
		int[] num = new int[N];
		int[] arr = new int[N];
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0; i<N; i++){
			num[i] = i+1;
			arr[i] = sc.nextInt();
		}
		st.push(1);
		str.append("+\n");
		int i=0;
		int j=1;
		while(i!=N){
			try{
				if(st.peek()!=arr[i]){
					str.append("+\n");
					st.push(num[j]);
					j++;
				}else{
					str.append("-\n");
					st.pop();
					i++;
				}
			}catch(Exception e){
				System.out.println("NO");
				return;
			}
		}
		System.out.println(str);
	}
}
