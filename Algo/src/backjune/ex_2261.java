package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

//가장 가까운 두점
public class ex_2261 {
	public static void main(String[] args) throws Exception{
		int min = Integer.MAX_VALUE;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<coordin> arr = new ArrayList<>();
		for(int i=0; i<N; i++){
			StringTokenizer stk = new StringTokenizer(br.readLine());
			arr.add(new coordin(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())));
		}
		
		Collections.sort(arr, new Comparator<coordin>(){
			@Override
			public int compare(coordin A, coordin B){
				if(A.x>B.x) return -1;
				else if(A.x<B.x) return 1;
				else{
					if(A.y>B.y) return -1;
					else if(A.y<B.y) return 1;
					else return 0;
				}
			}
		});

		for(int i=0; i<N-1; i++){
			int result = (int) Math.pow(arr.get(i).x -arr.get(i+1).x,2) + (int)Math.pow(arr.get(i).y-arr.get(i+1).y, 2);
			if(min>result){
				min = result;
			}
		}
		System.out.println(min);
		br.close();
	}
}

class coordin{
	int x;
	int y;
	coordin(int x, int y){
		this.x = x;
		this.y = y;
	}
}
