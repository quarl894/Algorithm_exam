package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// ¼³ÅÁ¹è´Þ
public class ex_2839 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 0;
		int num = 0;
		int min = Integer.MAX_VALUE;
		boolean check = false;
		while(N>=5*i){
			if((N-(5*i))%3==0){
				num = i+(N-(5*i))/3;
				check = true;
			}
			if(min>num) min=num;
			i++;
		}
		if(!check) System.out.println(-1);
		else System.out.println(num);
		br.close();
	}

}
