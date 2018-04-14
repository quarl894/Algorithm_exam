package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//ÆÓ¸°µå·Ò ¸¸µé±â
//aadcd ¹Ý·Ê
public class ex_1254 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder temp = new StringBuilder();
		if(str.length()==1) System.out.println(1);
		else{
			temp.append(str);
			boolean check = true;
			for(int i=0; i<str.length(); i++){
				for(int j=0; j<=temp.length()/2; j++){
					if(temp.charAt(j)!=temp.charAt(temp.length()-(j+1))){
						check = false;
						break;
					}
				}
				if(!check) check =true;
				else{
					System.out.println(str.length()+i);
					break;
				}
				temp.insert(str.length(),str.charAt(i));
			}
		}
		br.close();
	}

}
