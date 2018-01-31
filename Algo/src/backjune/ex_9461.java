package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//파도반 수열
public class ex_9461 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			System.out.println(Result(num));
		}
		br.close();
	}
	//int 범위 초과하므로 Long으로 선언
	private static Long Result(int num){
		List<Long> arr = new ArrayList<Long>();
		arr.add((long) 1);
		arr.add((long)1);
		arr.add((long)1);
		arr.add((long)2);
		arr.add((long)2);
		// 앞에까지는 주기가 없어서 직접 넣어줌
		int count = num-5;
		int last = 4;
		if(count>0){
			// 6번째 부터  찾을 수 = 바로 앞수 + (찾을수-5번째)수
			for(int i=0; i<count; i++){
				arr.add(arr.get(i) +arr.get(last));
				last++;
			}
		}
		return arr.get(num-1);
	}
}


