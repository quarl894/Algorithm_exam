package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//À½°è
public class ex_2920 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[8];
		int[] answer = new int[8];
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		for(int i=0; i<8; i++){
			answer[i] = i+1;
			arr[i] = Integer.parseInt(stk.nextToken()); 
		}
		int check = 0;
		int check2 = 0;
		for(int i=0; i<8; i++){
			if(answer[i]==arr[i]) check+=i+1;
			if(answer[i]==arr[7-i]) check2+=i+1;
		}
		if(check==36) System.out.println("ascending");
		else if(check2==36) System.out.println("descending");
		else System.out.println("mixed");
		br.close();
		
		
		
		
		
	}

}
