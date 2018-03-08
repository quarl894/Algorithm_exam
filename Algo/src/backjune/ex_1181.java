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
		//�ߺ��� ���ֱ� ���� hashSet���� ����
		HashSet<String> hs = new HashSet<>();
		int i,j;
		for(int k=0; k<N; k++){
			hs.add(br.readLine());
		}
		//String �迭�� �ű�.
		int size= hs.size();
		String[] arr = new String[size];
		hs.toArray(arr);
		
		//���ڿ� ũ��� ������.
		Arrays.sort(arr, new Comparator<String>(){
			public int compare(String s1, String s2){
				return Integer.compare(s1.length(), s2.length());
			}
		});
		// ���� ���ڿ� ũ�⿡�� ���� �� ����(���Ϲ��ڿ� ���� ã�� Arrays.sort��Ŵ)
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
