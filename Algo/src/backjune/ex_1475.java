package backjune;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �ټ��̴� �������� ������ ���� �̻�Դ�.
 *  �ټ��̴� �ڱ� �� ��ȣ�� ���� �ö�ƽ ���ڷ� ���� ���̷��� �Ѵ�.
 *  �ټ����� ���������� �ö�ƽ ���ڸ� �� ��Ʈ�� �Ǵ�. 
 *  �� ��Ʈ���� 0������ 9������ ���ڰ� �ϳ��� ����ִ�. 
 *  �ټ����� �� ��ȣ�� �־����� ��, �ʿ��� ��Ʈ�� ������ �ּҰ��� ����Ͻÿ�. 
 *  (6�� 9�� ����� �̿��� �� �ְ�, 9�� 6�� ����� �̿��� �� �ִ�.)
 */
public class ex_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		char[] chars = word.toCharArray();
		int arr[] = new int[10];
		for(int i=0; i<10; i++){
			arr[i] =0;
		}
		
		for(int i=0; i<chars.length; i++){
			int number = chars[i] -48;
			arr[number]++;
		}
		int max= Math.round((float)(arr[6] +arr[9])/2);
		
		for(int i=0; i<10; i++){
			if(i==6 || i==9) continue;
			else{
				if(max<arr[i]){
					max = arr[i];
				}
			}
		}
		System.out.println(max);
	}
}
