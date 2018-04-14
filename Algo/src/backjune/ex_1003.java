package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ex_1003 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder st= new StringBuilder();
		ArrayList<fibo> arr = new ArrayList<>();
		arr.add(new fibo(1,0));
		arr.add(new fibo(0,1));
		for(int i=2; i<=40; i++){
			arr.add(new fibo(arr.get(i-2).a+arr.get(i-1).a,arr.get(i-2).b+arr.get(i-1).b));
		}
		for(int i=0; i<num; i++){
			int result = Integer.parseInt(br.readLine());
			st.append(arr.get(result).a+" "+ arr.get(result).b+"\n");
		}
		System.out.println(st);
		br.close();
		
	}
}

class fibo{
	int a;
	int b;
	
	public fibo(int a, int b){
		this.a = a;
		this.b = b;
	}
}
