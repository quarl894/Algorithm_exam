package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//숫자카드2
public class ex_10816 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer,Integer> hash = new HashMap<>();
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			int temp = Integer.parseInt(stk.nextToken());
			if(hash.containsKey(temp)){
				hash.put(temp, hash.get(temp)+1);
			}else{
				hash.put(temp, 1);
			}
			
		}
		StringBuilder st = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		StringTokenizer stk2 = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++){
			int result = Integer.parseInt(stk2.nextToken());
			if(hash.containsKey(result)){
				st.append(hash.get(result));
			}else{
				st.append(0);
			}
			st.append(" ");
		}
		System.out.println(st);

		br.close();
		
		
	}

}
