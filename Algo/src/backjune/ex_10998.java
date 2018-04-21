package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//A*B
public class ex_10998 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().trim().split(" ");
		System.out.println(Double.parseDouble((sp[0]))/Double.parseDouble((sp[1])));
		
		br.close();
	}
}
