package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

//회사에 있는사람
public class ex_7785 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Hashtable<String, Integer> hash = new Hashtable<>();
		StringBuilder st = new StringBuilder();
		for(int i=0; i<N; i++){
			String[] sp = br.readLine().split(" ");
			if(sp[1].equals("enter")) hash.put(sp[0], i);
			else hash.remove(sp[0]);
		}
		ArrayList result = new ArrayList(hash.keySet());
		Collections.sort(result);
		Collections.reverse(result);
		for(int i=0; i<result.size(); i++){
			st.append(result.get(i));
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}

}
