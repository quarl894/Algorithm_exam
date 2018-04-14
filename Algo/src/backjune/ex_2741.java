package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//NÂï±â
public class ex_2741 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st= new StringBuilder();
		int num = 0;
		while(num++<N){
			st.append(num+"\n");
		}
		System.out.println(st);
		br.close();
	}

}
