package Algo_tset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

//우아한 형제 시험
public class brother {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int N = Integer.parseInt(sp[0]);
		int d = Integer.parseInt(sp[1]);
		int k = Integer.parseInt(sp[2]);
		int j = Integer.parseInt(sp[3]);
		LinkedList<temp> arr = new LinkedList<>();
		
		if(d==1){
			for(int i=0; i<N; i++){
				arr.add(new temp(i+1, i+1));
			}
		}else{
			arr.add(new temp(1, 1));
			for(int i=N-1; i>=1; i--){
				arr.add(new temp(i+1, i+1));
			}
		}
		int count = k-j;
		while(arr.size()!=1){
			count+=j;
			count /=arr.size();
			
			arr.remove(count);
		}
		System.out.println(arr.get(0));
		br.close();
	}
}

class temp{
	int x;
	int y;
	temp(int x, int y){
		this.x = x;
		this.y = y;
	}
}
