package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//µÚÁýÈù µ¡¼À
public class ex_1357 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		String num1 = reverse(sp[0]);
		String num2 = reverse(sp[1]);
		int number = Integer.parseInt(num1) + Integer.parseInt(num2);
		String temp  = reverse(String.valueOf(number));
		System.out.println(Integer.toString(Integer.parseInt(temp)));
		br.close();
	}
	
	static private String reverse(String str){
		String temp = "";
		for(int i=str.length()-1; i>=0; i--){
			temp +=str.charAt(i);
		}
		return temp;
	}
}
