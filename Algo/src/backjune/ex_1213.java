package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//팰린드롬 만들기
public class ex_1213 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name= br.readLine();
		ArrayList<Character> list = new ArrayList<>();
		StringBuilder st = new StringBuilder();
		int[] dp = new int[27];
		for(int i=0; i<name.length(); i++){
			char alph = name.charAt(i);
			int count = alph-65;
			if(dp[count]==0){
				list.add(alph);
				dp[count] =1;
			}else{
				dp[count]++;
			}
		}
		Collections.sort(list);
		
		//홀수인 알파벳 찾기
		int index =-1;
		int count =0;
		for(int i=0; i<27; i++){
			if(dp[i]!=0 && dp[i]%2==1){
				index = i;
				count++;
				if(count==2) break;
			}
		}
		int len =list.size();
		int only =0;
		if(index!=-1){
			char word = ((char)(index+65));
			for(int i=0; i<list.size(); i++){
				if(list.get(i).equals(word)){
					only = i;
					break;
				}
			}
			list.add(word);
			len = list.size()-1;
		}
		if(count==2){
			System.out.println("I'm Sorry Hansoo");
		}else{
			//팰린드롬 만들기
			for(int i=0; i<len; i++){
				int result = (char)(list.get(i))-65;
				for(int j=0; j<dp[result]/2; j++){
					st.append(list.get(i));
				}
			}
			if(count==1){
				st.append(list.get(only));
			}
			for(int i=len-1; i>=0; i--){
				int result = (char)(list.get(i))-65;
				for(int j=0; j<dp[result]/2; j++){
					st.append(list.get(i));
				}
			}
			System.out.println(st);
		}
		br.close();
	}

}
