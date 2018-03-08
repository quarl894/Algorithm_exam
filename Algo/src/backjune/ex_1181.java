package backjune;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ex_1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		//중복을 없애기 위해 hashSet으로 받음
		HashSet<String> hs = new HashSet<>();
		int i,j;
		for(int k=0; k<N; k++){
			hs.add(br.readLine());
		}
		//String 배열에 옮김.
		int size= hs.size();
		String[] arr = new String[size];
		hs.toArray(arr);
		
		//문자열 크기로 정렬함.
		Arrays.sort(arr, new Comparator<String>(){
			public int compare(String s1, String s2){
				return Integer.compare(s1.length(), s2.length());
			}
		});
		// 동일 문자열 크기에서 사전 순 정렬(동일문자열 구간 찾아 Arrays.sort시킴)
		for(i=0; i<size; i++){
			int len =arr[i].length();
			for(j=i; j<size; j++){
				int temp = arr[j].length();
				if(len!=temp) break; 
			}
			Arrays.sort(arr,i,j);
			i = j-1;
		}
		for(String a : arr){
			bw.write(a+"\n");
		}
		bw.flush();
		bw.close();
	}
}
