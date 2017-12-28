package backjune;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최소값을 출력하시오.
 */
public class ex_1463 {
	static int count =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		division(n);
		System.out.println(count);
		count =0;
	}
	
	private static int division(int N){
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		int num = N;
		int max =(int)Math.pow(10, 6);
		for(int i=2; i<=max; i*=2){
			list2.add(i);
		}
		for(int i=3; i<=max; i*=3){
			list3.add(i);
		}
		if(num==1){
			return 0;
		}else{
			count++;
		if(num%3!=0 && num%2!=0){
			--num;
		}else if(list2.contains(num)){
			num /=2;
		}else if(list3.contains(num)){
			num /=3;
		}else if(list2.contains(num-1)){
			--num;
		}else if(list3.contains(num-1)){
			--num;
		}else if(N%3==0){
			num /=3;
		}else if(N%2==0){
			num /=2;
		}
		System.out.printf(num +" ");
		return division(num);
		}
	}
}
