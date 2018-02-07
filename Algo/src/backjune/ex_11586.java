package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//한수
public class ex_11586 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] dp = new String[N];
		for(int i=0; i<N; i++){
			dp[i] = br.readLine();
		}
		StringBuilder st= new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		switch(num){
		//그대로
		case 1 :
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					st.append(dp[i].charAt(j));
				}
				st.append("\n");
			}
			break;
			//좌우 대칭
		case 2 :
			for(int i=0; i<N; i++){
				for(int j=N-1; j>=0; j--){
					st.append(dp[i].charAt(j));
				}
				st.append("\n");
			}
			break;
			//상하
		case 3 :
			for(int i=N-1; i>=0; i--){
				for(int j=0; j<N; j++){
					st.append(dp[i].charAt(j));
				}
				st.append("\n");
			}
			break;
		}

		System.out.println(st);
		br.close();
	}
}
