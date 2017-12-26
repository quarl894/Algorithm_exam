package backjune;
/*
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class ex_1316 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word;
		int N;
		N = scan.nextInt();
		int count =0;
		for(int i=0; i<N; i++){
			word = scan.next();
			count +=gpword(word);
		}
		
		
		System.out.println(count);
	}
	private static int gpword(String word){
		char[] alph = word.toCharArray();
		boolean arr[] = new boolean[26];
		
		for(int i=0; i<26; i++){
			arr[i] = false;
		}
		
		for(int i=0; i<alph.length-1; i++){
			//마지막 값 따로 구혀해줘야함
			int num = alph[i] -97;
			if(alph[i]!=alph[i+1]){
				if(arr[num]==false){
					arr[num] = true;
				}else{
					return 0;
				}
			}
		}
		if(arr[alph[alph.length-1]-97]==true){
			return 0;
		}
		
		return 1;
	}

}
