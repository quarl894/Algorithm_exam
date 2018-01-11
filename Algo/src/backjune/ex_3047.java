package backjune;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
// 대문자는 65~90까지
public class ex_3047 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[3];
		for(int i=0; i<3; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		sc.nextLine();
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++){
			int result = str.charAt(i) -65;
			System.out.printf(arr[result] + " ");
		}
	}
}
