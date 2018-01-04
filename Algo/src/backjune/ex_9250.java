package backjune;

import java.util.Scanner;

/*
 * 집합 S는 크기가 N이고, 원소가 문자열인 집합이다. Q개의 문자열이 주어졌을 때, 
 * 각 문자열의 부분 문자열이 집합 S에 있는 판별하는 프로그램을 작성하시오. 
 * 문자열의 여러 부분 문자열 중 하나라도 집합 S에 있으면 'YES'를 출력하고, 아무것도 없으면 'NO'를 출력한다.
 * 예를 들어, 집합 S = {"www","woo","jun"} 일 때, "myungwoo"의 부분 문자열인 "woo" 가 집합 S에 있으므로 답은 'YES'이고, 
 * "hongjun"의 부분 문자열 "jun"이 집합 S에 있으므로 답은 'YES'이다. 
 * 하지만, "dooho"는 모든 부분 문자열이 집합 S에 없기 때문에 답은 'NO'이다.
 */
public class ex_9250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		String words;
		
		N = sc.nextInt();
		String[] arr = new String[N];
		for(int i=0; i<N; i++){
			arr[i] = sc.next();
		}
		M = sc.nextInt();
		for(int i=0; i<M; i++){
			words = sc.next();
			for(int j=0; j<N; j++){
				if(words.contains(arr[j])){
					System.out.println("YES");
					break;
				}else if(j==N-1){
					System.out.println("NO");
				}
			}
		}
	}
}
