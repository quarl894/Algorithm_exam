package backjune;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
X�� 3���� ������ ��������, 3���� ������.
X�� 2�� ������ ��������, 2�� ������.
1�� ����.
���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ���� �ּҰ��� ����Ͻÿ�.
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
