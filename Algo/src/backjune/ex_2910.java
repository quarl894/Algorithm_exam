package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

//������
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
		
		//HashMap���� ���ڿ� ������ ����.
		//list���� ���ڸ� ����(�ߺ� x)
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(stk.nextToken());	
			if(hash.containsKey(num)){
				hash.replace(num, hash.get(num)+1);
			}else{
				hash.put(num, 1);
				list.add(num);
			}
		}
		
		//����, ����, ���� ������ result�� ����.
		for(int i=0; i<list.size(); i++){
			result.add(new ab(list.get(i),hash.get(list.get(i)),i));
		}
		
		//1. ���� ���� ���� �� ���� �� 2.���� �����϶� ���� ���� �� ���� ���� 
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
		
		//���
		for(int i=0; i<result.size(); i++){
			for(int j=0; j<result.get(i).b; j++){
				st.append(result.get(i).a);
				st.append(" ");
			}
		}
		System.out.println(st);
	}
	
	// a=���� b=������ ���� c=���� ����
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
