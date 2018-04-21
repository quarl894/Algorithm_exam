package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//ÆÓ¸°µå·Ò
public class ex_13235 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		boolean palin = false;
		for(int i=0; i<str.length/2; i++){
			if(str[i]!=str[str.length-(i+1)]){
				palin = true;
				break;
			}
		}
		if(palin==true) System.out.println("false");
		else System.out.println("true");
		br.close();
	}

}
