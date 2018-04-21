package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

//빈도정렬
public class ex_2910 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int N = Integer.parseInt(sp[0]);
		int C = Integer.parseInt(sp[1]);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<ab> result = new ArrayList<>();
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		HashMap<Integer,Integer> hash = new HashMap<>();
		StringBuilder st = new StringBuilder();
		
		//HashMap으로 숫자와 갯수를 받음.
		//list에는 숫자만 받음(중복 x)
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(stk.nextToken());	
			if(hash.containsKey(num)){
				hash.replace(num, hash.get(num)+1);
			}else{
				hash.put(num, 1);
				list.add(num);
			}
		}
		
		//숫자, 갯수, 들어온 순서를 result에 넣음.
		for(int i=0; i<list.size(); i++){
			result.add(new ab(list.get(i),hash.get(list.get(i)),i));
		}
		
		//1. 가장 많이 나온 수 정렬 후 2.같은 갯수일때 먼저 들어온 수 기준 정렬 
		Collections.sort(result, new Comparator<ab>(){
			@Override
			public int compare(ab A, ab B){
				if (A.b > B.b){
					return -1;
                }
                else if (A.b < B.b){
                    return 1;
                }else{
					if(A.c>B.c){
						return 1;
					}else if(A.c<B.c){
						return -1;
					}
	                else {
	                    return 0;
	                }
				}
			}
		});
		
		//출력
		for(int i=0; i<result.size(); i++){
			for(int j=0; j<result.get(i).b; j++){
				st.append(result.get(i).a);
				st.append(" ");
			}
		}
		System.out.println(st);
	}
	
	// a=숫자 b=숫자의 갯수 c=들어온 순서
	private static class ab{
		int a;
		int b;
		int c;
		ab(int a, int b, int c){
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	

}
