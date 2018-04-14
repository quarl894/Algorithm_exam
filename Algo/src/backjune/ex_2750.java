package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 수 정렬하기
public class ex_2750 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		StringBuilder st = new StringBuilder();
		for(int a: arr) st.append(a+"\n");
		System.out.println(st);
		br.close();
	}

}
