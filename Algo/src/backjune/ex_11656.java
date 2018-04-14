package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//접미사 배열
public class ex_11656 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		String str = br.readLine();
		String[] result = new String[str.length()];
		for(int i=0; i<str.length(); i++){
			result[i] = str.substring(i,str.length());
		}
		Arrays.sort(result);
		for(String a : result) st.append(a +"\n");
		System.out.println(st);
		br.close();
	}
}
