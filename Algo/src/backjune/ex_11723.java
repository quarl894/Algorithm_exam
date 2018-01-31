package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//집합
//add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
//remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
//check x: S에 x가 있으면 1을, 없으면 0을 출력한다.
//toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
//all: S를 {1, 2, ..., 20} 으로 바꾼다.
//empty: S를 공집합으로 바꾼다. 
public class ex_11723 {
	static ArrayList<Integer> arr = new ArrayList<>();
	static StringBuilder st = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++){
			String str= br.readLine();
			result(str);
		}
		System.out.println(st);
		br.close();
	}
	private static void result(String str){
		String[] sp = str.split(" ");
		switch(sp[0]){
		case "add" :
			arr.add(Integer.parseInt(sp[1]));
			break;
		case "remove" :
			if(arr.contains(Integer.parseInt(sp[1]))){
				for(int i=0; i<arr.size(); i++){
					if(arr.get(i).equals(Integer.parseInt(sp[1]))){
						arr.remove(i);
						break;
					}
				}
			}
			break;
		case "check" :
			if(arr.contains(Integer.parseInt(sp[1]))) st.append(1);
			else st.append(0);
			st.append("\n");
			break;
		case "toggle" :
			if(arr.contains(Integer.parseInt(sp[1]))){
				for(int i=0; i<arr.size(); i++){
					if(arr.get(i).equals(Integer.parseInt(sp[1]))){
						arr.remove(i);
						break;
					}
				}
			}
			else arr.add(Integer.parseInt(sp[1]));
			break;
		case "all" :
			arr.clear();
			for(int i=0; i<20; i++){
				arr.add(i+1);
			}
			break;
		case "empty" :
			arr.clear();
			break;
		}
	}
}
