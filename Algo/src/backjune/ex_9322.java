package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ex_9322 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		int[] order = null;
		for(int i=0; i<N; i++){
			//word_num : 단어 수 text : 제1 공개키 /  ciphertext : 제2공개키 / ciphertext2 : 암호문
			int word_num= Integer.parseInt(br.readLine());
			String[] text = br.readLine().split(" ");
			String[] ciphertext = br.readLine().split(" ");
			String[] ciphertext2 = br.readLine().split(" ");
			
			//order : 제1 공개키에서 제2공개키로 바꾸는 과정의 순서가 뭔지 확인하는 배열
			order = new int[word_num];
			String[] result = new String[word_num];
			HashMap<String,Integer> hash = new HashMap<>();
			for(int j=0; j<word_num; j++){
				hash.put(text[j], j);
			}
			for(int j=0; j<word_num; j++){
				//순서 찾음
				order[j] = hash.get(ciphertext[j]);
				// 순서대로 암호문을 평문으로 바꿈
				result[order[j]] = ciphertext2[j];
			}
			//출력하기 위해 StringBuilder에 집어넣는 과정
			for(int j=0; j<word_num; j++){
				st.append(result[j]);
				st.append(" ");
			}
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}
}
