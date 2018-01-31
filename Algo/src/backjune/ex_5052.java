package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//전화번호 목록
public class ex_5052 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		for(int i=0; i<N; i++){
			int Tk = Integer.parseInt(br.readLine());
			String arr[] = new String[Tk];
			for(int j=0; j<Tk; j++){
				arr[j] = br.readLine();
			}
			st.append(Result(arr));
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}
	
	//
	private static String Result(String[] arr){
		//하나씩 다 비교 
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				//index초과 방지 위해서 더 작은 문자열에 맞춰서 비교함.
				int len = Math.min(arr[i].length(), arr[j].length());
				int count =0; //맞은 횟수
				for(int k=0; k<len; k++){
					if(arr[i].charAt(k) == arr[j].charAt(k)){
						count++;
					}else{
						break;
					}
				}
				//맞은 횟수가 문자열과 동일하면 전체가 다 맞은 경우이니 "NO"출력
				if(count==len){
					return "NO";
				}
			}
		}
		//NO가 없으면 YES 출력
		return "YES";
	}

}
