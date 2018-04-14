package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//Àý´ë°ª Èü
public class ex_11286 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		PriorityQueue<NUM> q = new PriorityQueue<>();
		StringBuilder st = new StringBuilder();
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			if(num==0){
				if(q.isEmpty()) st.append(0 + "\n");
				else{
					NUM result = q.poll();
					st.append(result.sign+"\n");
				}
			}else{
				 q.add(new NUM(Math.abs(num),num));
			}
		}
		System.out.println(st);
		br.close();
	}
}

class NUM implements Comparable<NUM>{
	int num;
	int sign;
	
	public NUM(int num, int sign){
		this.num = num;
		this.sign = sign;
	}
	@Override
    public int compareTo(NUM target) {
        if (this.num > target.num) {
            return 1;
        } else if (this.num < target.num) {
            return -1;
        }else{
        	if(this.sign>target.sign) return 1;
        	else if(this.sign<target.sign) return -1;
        	else return 0;
        }
    }
}