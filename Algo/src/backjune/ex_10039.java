package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Æò±Õ Á¡¼ö
public class ex_10039 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum =0;
		for(int i=0; i<5; i++){
			int num = Integer.parseInt(br.readLine());
			if(num<40) num =40;
			sum+=num;
		}
		System.out.println(sum/5);
		br.close();
	}

}
