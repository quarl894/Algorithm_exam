package Algo_tset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Line 2번
public class Line2 {
	// 설명 : 1~N까지 중 나눠 떨어지는 수는 해당 되기 때문에 카운팅하여 계산
	// 시간복잡도 : O(N)
	// 공간복잡도 : O(1) room만 필요하기 때문에
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int room = Integer.parseInt(br.readLine());
		int count =0;
		for(int i=1; i<=room; i++){
			if(room%i==0) count++;
		}
		System.out.println(count);
	}

}
