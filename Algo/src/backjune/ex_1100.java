package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//го╬А д╜
public class ex_1100 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Character[][] dp = new Character[8][8]; 
		for(int i=0; i<8; i++){
			String str = br.readLine();
			for(int j=0; j<8; j++){
				dp[i][j] = str.charAt(j);
			}
			str ="";
		}
		int count =0;
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if((i==0 || i%2==0) && (j==0 || j%2==0)){
					if(dp[i][j]=='F') count++;
				}else if((i%2==1) && (j%2==1)){
					if(dp[i][j]=='F') count++;
				}
			}
		}
		System.out.println(count);
		br.close();
	}

}
