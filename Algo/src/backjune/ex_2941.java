package backjune;

import java.util.Scanner;

public class ex_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		change(str);
	}

	private static void change(String str){
		String[] words = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		//char[] chars = str.toCharArray();
		String temp =str;
		for(int i=0; i<words.length; i++){
			if(temp.indexOf(words[i])>-1){
				str =str.replace(words[i], "a");
			}
		}
		int result = str.length();
		System.out.println(result);
	}
}
