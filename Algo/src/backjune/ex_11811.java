package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//데스스타
// 전부 and 연산자값이니 다 or한 값이 적어도 1이 다 들어갈수밖에없음.
public class ex_11811 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		StringTokenizer stk;
		for(int i=0; i<N; i++){
			stk = new StringTokenizer(br.readLine());
			int num =0;
			for(int j=0; j<N; j++){
				num |= Integer.parseInt(stk.nextToken());
			}
			st.append(num+" ");
		}
		System.out.println(st);
		br.close();
	}

}
