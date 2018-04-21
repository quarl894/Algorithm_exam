package Algo_tset;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 문자열 중 홀수만 추출한 후 각 홀수의 제곱의 합을 출력하는 것
public class Business_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder st = new StringBuilder();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				st.append(str.charAt(i));
			}else{
				st.append(" ");
			}
		}
		long sum =0;
		String[] sp = st.toString().split(" ");
		for(int i=0; i<sp.length; i++){
			if(!sp[i].equals("")){
				if(Integer.parseInt(sp[i])%2==1){	
					sum +=Math.pow((double)Integer.parseInt(sp[i]), 2);
				}
			}
		}
		System.out.println(sum);
		br.close();
	}

}
