package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//돌줍기
//1개 또는 3개만 가져갈 수 있음 마지막남은 거 가져가는 사람이 이김.
public class ex_9655 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		if(N%2==0) System.out.println("CY");
		else System.out.println("SK");
		br.close();
		
	}

}
