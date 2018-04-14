package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//일곱 난쟁이
public class ex_2309 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum =0;
		int[] arr = new int[9];
		for(int i=0; i<9; i++){
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum +=num;
		}
		//삭제시 Index초과 에러나서 임의값 한개 넣어줌. 
		Arrays.sort(arr);
		// 9개중 2개뺀값이 100일때 찾음
		Loop:for(int i=0; i<8; i++){
			for(int j=i+1; j<9; j++){
				int temp = arr[i] +arr[j];
				if(sum-temp==100){
					arr[i] = Integer.MAX_VALUE;
					arr[j] = Integer.MAX_VALUE;
					break Loop;
				}
			}
		}
		Arrays.sort(arr);
		StringBuilder st = new StringBuilder();
		for(int i=0; i<7; i++){
			st.append(arr[i]);
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}
}
