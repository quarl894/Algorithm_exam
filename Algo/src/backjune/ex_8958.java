package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//OXÄûÁî
public class ex_8958 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		for(int i=0; i<N; i++){
			char[] str = br.readLine().toCharArray();
			int score = 0;
			int result =0;
			for(int j=0; j<str.length; j++){
				if(str[j]=='X') score =0;
				else result += ++score;
			}
			st.append(result+"\n");
		}
		System.out.println(st);
		br.close();
	}

}
