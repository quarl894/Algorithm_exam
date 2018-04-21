package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문자열 반복
public class ex_2675 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cycle = Integer.parseInt(br.readLine());
		for(int k=0; k<cycle; k++){
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(stk.nextToken());
			String str = stk.nextToken();
			StringBuilder st = new StringBuilder();
			for(int i=0; i<str.length(); i++){
				for(int j=0; j<N; j++){
					st.append(str.charAt(i));
				}
			}
			System.out.println(st);
		}
		br.close();
	}
}
