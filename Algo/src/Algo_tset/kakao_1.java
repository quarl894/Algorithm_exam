package Algo_tset;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//카카오1
public class kakao_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		//이진수변환 배열
		String[] arr3 = new String[n];
		String[] arr4 = new String[n];
		
		String[] gido = new String[n];
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder st = new StringBuilder();
		StringBuilder st2 = new StringBuilder();
		StringBuilder st3 = new StringBuilder();
		for(int i=0; i<n; i++){
			arr1[i] = Integer.parseInt(stk.nextToken());

		}
		stk = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr2[i] = Integer.parseInt(stk.nextToken());
		}
		
		for(int i=0; i<n; i++){
			String temp = Integer.toBinaryString(arr1[i]);
			if(temp.length()!=n){
				int len = n-temp.length();
				while(len-->0){
					st.append(0);
				}
				st.append(temp);
				arr3[i] = st.toString();

			}else{
				arr3[i] = temp;
			}

			String temp2 = Integer.toBinaryString(arr2[i]);
			if(temp2.length()!=n){
				int len2 = n-temp2.length();
				while(len2-->0) st2.append(0);
				st2.append(temp2);
				arr4[i] = st2.toString();
			}else{
				arr4[i] = temp2;
			}
			//System.out.println(arr3[1]);
			for(int j=0; j<n; j++){
				if(arr3[i].charAt(j)=='1' || arr4[i].charAt(j)=='1'){
					st3.append("#");
				}
				else st3.append(" ");
			}
			gido[i] = st3.toString();
			st.delete(0, st.length());
			st2.delete(0, st2.length());
			st3.delete(0, st3.length());
		}
		StringBuilder result = new StringBuilder();
		result.append("[");
		for(String a : gido) result.append("\""+a+"\""+",");
		result.delete(result.length()-1, result.length());
		result.append("]");
		
		System.out.println(result);
		br.close();
	}

}
