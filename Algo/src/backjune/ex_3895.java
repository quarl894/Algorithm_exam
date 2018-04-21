package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//그리고 하나 남았다
public class ex_3895 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		while(true){
			String[] sp = br.readLine().split(" ");
			int n = Integer.parseInt(sp[0]);
			int k = Integer.parseInt(sp[1]);
			int m = Integer.parseInt(sp[2]);
			
			if(n==0 && k==0 && m==0) break;
			
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i=0; i<n; i++){
				arr.add(i+1);
			}
			arr.remove(m-1);
			int idx = m-1;
			while(arr.size()!=1){
				idx +=k-1;
				idx %=arr.size();
				arr.remove(idx);
			}
			st.append(arr.get(0));
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}
}
