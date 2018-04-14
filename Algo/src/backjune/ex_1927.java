package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// ÃÖ¼Ò Èü
public class ex_1927 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		PriorityQueue<Integer> q= new PriorityQueue<>();
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			if(num==0){
				if(q.size()==0) st.append(0+"\n");
				else{
					st.append(q.poll()+"\n");
				}
			}else{
				q.add(num);
			}
		}
		System.out.println(st);
		br.close();
	}

}
