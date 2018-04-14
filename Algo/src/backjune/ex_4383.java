package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

//점프는 줄거워
public class ex_4383{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int N = System.in.read()-'0';
			if(N<=1) break;
			System.in.read();
			int[] sp = new int[N];
			System.out.println("N: "+N);
			for(int i=0; i<N; i++){
				
				char word = (char)System.in.read();
				sp[i] = word -48;
				System.in.read();
			}
			if(sp.length==0) break;
			HashMap<Integer,Integer> hash = new HashMap<>();
			for(int a : sp) System.out.printf(a+" ");
			for(int i=0; i<N-1; i++){
				int num = Math.abs(sp[i]-sp[i+1]);
				if(!hash.containsKey(num) && num!=0){
					hash.put(num, 1);
				}
			}
			int result =0;
			for(int i=1; i<N; i++){
				if(!hash.containsKey(i)){ 
					result = 1;
					break;
				}
			}
			if(result==1) System.out.println("Not jolly");
			else if(result==0) System.out.println("Jolly");
			hash.clear();
			result=0;
		}
		
		br.close();
	}

}