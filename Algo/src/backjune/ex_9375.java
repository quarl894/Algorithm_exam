package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

//패션왕 신해빈
public class ex_9375 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<String,Integer> hash = new HashMap<>();
		StringBuilder st =new StringBuilder();
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			hash = new HashMap<>();
			for(int j=0; j<num; j++){
				String[] sp = br.readLine().split(" ");
				//의상종류가 있다면 갯수 +1
				if(hash.containsKey(sp[1])){
					hash.replace(sp[1], hash.get(sp[1])+1);
				}else{
					hash.put(sp[1],1);
				}
			}
			//0은 곱셈이 안되기때문에 1로 초기화
			int result = 1;
			// value : 카테고리안 갯수 //   (한개씩 선택+안입는경우) = value+1 다 곱해주면 경우의 수
			for(int value : hash.values()){
				result *=(value+1);
			}
			// -1은 알몸일경우 제외
			st.append(result-1);
			st.append("\n");
		}
		System.out.println(st);
		br.close();
		
	}
}
