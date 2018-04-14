package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

//버블소트
public class ex_1517 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<bubble> sort = new ArrayList<>();
		long sum =0;
		StringTokenizer stk = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			sort.add(new bubble(Integer.parseInt(stk.nextToken()),i));
		}
		if(sort.size()==1) System.out.println(0);
		else if(sort.size()==2){
			if(sort.get(0).num>sort.get(1).num) System.out.println(1);
			else System.out.println(0);
		}else{
			Collections.sort(sort, new Comparator<bubble>(){
				@Override
				public int compare(bubble a, bubble b){
					if(a.num> b.num) return 1;
					else if(a.num<b.num) return -1;
					else return 0;
				}
			});
			
			for(int i=0; i<N; i++){
				if(sort.get(i).index-i>0) sum+=(sort.get(i).index-i)+1 ;
			}
			System.out.println(sum);
		}
		br.close();
	}
}

class bubble{
	int num;
	int index;
	
	public bubble(int num, int index){
		this.num = num;
		this.index = index;
	}
	
}
