package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
 * 국어 점수가 감소하는 순서로
국어 점수가 같으면 영어 점수가 증가하는 순서로
국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로
 */
class grade{
	String name;
	int han;
	int eng;
	int math;
	grade(String name, int han, int eng, int math){
		this.name = name;
		this.han = han;
		this.eng = eng;
		this.math = math;
	}
}
public class ex_10825 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		grade arr[] = new grade[N];
		for(int i=0; i<N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			int han = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			arr[i] = new grade(name,han,eng,math);
		}
		br.close();
		Arrays.sort(arr, new Comparator<grade>(){
			@Override
			public int compare(grade a1, grade a2){
				if(a1.han<a2.han) return 1;
				else if(a1.han>a2.han) return -1;
				else{
					if(a1.eng>a2.eng) return 1;
					else if(a1.eng<a2.eng) return -1;
					else{
						if(a1.math<a2.math) return 1;
						else if(a1.math>a2.math) return -1;
						else{
							return a1.name.compareTo(a2.name);
						}
					}
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		for(grade a : arr){
			sb.append(a.name).append('\n');
		}
		System.out.println(sb.toString());
	}
}
