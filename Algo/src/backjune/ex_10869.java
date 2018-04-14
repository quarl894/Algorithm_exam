package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//사칙연산
public class ex_10869 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().trim().split(" ");
		int a = Integer.parseInt(sp[0]);
		int b = Integer.parseInt(sp[1]);
		
		StringBuilder st = new StringBuilder();
		st.append(a+b+"\n");
		st.append(a-b+"\n");
		st.append(a*b+"\n");
		st.append(a/b+"\n");
		st.append(a%b);
		System.out.println(st);
		br.close();
	}

}
