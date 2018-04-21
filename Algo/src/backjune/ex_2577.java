package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//¼ýÀÚÀÇ °¹¼ö
public class ex_2577 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int result = a*b*c;
		int[] arr = new int[10];
		while(result>0){
			int num =result%10;
			result/=10;
			arr[num]++;
		}
		for(int answer : arr) System.out.println(answer);
		br.close();
	}

}
