package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//ÇÑ¼ö
public class ex_1065 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count =99;
		if(N<100){
			System.out.println(N);
		}else if(N==1000){
			System.out.println(144);
		}else{
			for(int i=100; i<=N; i++){
				int result = i;
				int num3 = result%10;
				result /=10;
				int num2 = result%10;
				result /=10;
				int num1 = result%10;
				if((num1-num2)==(num2-num3)){
					count++;
				}
			}
			System.out.println(count);
		}
		br.close();
	}
}
