package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex_10815 {
	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		int[] arr= new int[N+1];
		arr[0] = 0;
		String[] spl = br.readLine().split(" ");
		for(int i=1; i<=N; i++){
			int result = Integer.parseInt(spl[i-1]);
			arr[i] = (result+10000000);
		}
		Arrays.sort(arr);
		int num = Integer.parseInt(br.readLine());
		String[] spl2 = br.readLine().split(" ");
		for(int i=1; i<=num; i++){
			int result = Integer.parseInt(spl2[i-1])+10000000;
			if(Arrays.binarySearch(arr,result)>=1){
				st.append("1");
				st.append("\n");
			}else{
				st.append("0");
				st.append("\n");
			}
		}
		br.close();
		System.out.println(st);
	}
}
