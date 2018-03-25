package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

//나는야 포켓몬
public class ex_1620 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int N = Integer.parseInt(sp[0]);
		int M = Integer.parseInt(sp[1]);
		Hashtable<String, String> hash = new Hashtable<>();
		Hashtable<String, String> hash2 = new Hashtable<>();
		StringBuilder st = new StringBuilder();
		for(int i=1; i<=N; i++){
			String str = br.readLine();
			hash.put(String.valueOf(i), str);
			hash2.put(str, String.valueOf(i));
		}
		for(int i=0; i<M; i++){
			String str = br.readLine();
			if(hash.get(str)==null){
				st.append(hash2.get(str));
				st.append("\n");
			}else{
				st.append(hash.get(str));
				st.append("\n");
			}
		}
		System.out.println(st);
		br.close();
	}

}
