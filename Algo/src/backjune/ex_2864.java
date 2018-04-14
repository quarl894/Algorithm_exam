package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//5와 6의 차이
public class ex_2864 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int max = Integer.valueOf(sp[0].replaceAll("5", "6")) + Integer.valueOf(sp[1].replaceAll("5", "6"));
		int min = Integer.valueOf(sp[0].replaceAll("6", "5")) + Integer.valueOf(sp[1].replaceAll("6", "5"));
		System.out.println(min + " " + max);
		br.close();
	}

}
