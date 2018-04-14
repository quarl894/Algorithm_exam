package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//모음의 개수
public class ex_10987 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int count =0;
		for(int i=0; i<str.length; i++){
			if(str[i]=='a' || str[i]=='e' || str[i]=='o' || str[i]=='u' || str[i]=='i') count++;
		}
		System.out.println(count);
		br.close();
	}

}
