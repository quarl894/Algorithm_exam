package backjune;

import java.util.ArrayList;
import java.util.Scanner;

/*���� ��ҹ��ڿ� ���⸸���� �̷���� ������ �־�����. 
 �� ���忡�� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ������ �־�����. 
�� ������ ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еȴ�.*/
public class ex_1152 {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		
		do{
		//	System.out.println("������ �Է����ּ���:");
			str = scan.nextLine();
		}while(str.length()>1000000);
		System.out.println(wordNum(str));
	}
	
	private static int wordNum(String str){
		char[] result = str.toCharArray();
		
		int count = 0;
		for(int i=1; i<result.length-1; i++){
			if(result[i]==' ' && result[i-1]!=' ' && result[i+1]!=' '){
				count++;
			}
		}
	
		if(str.trim().length()==0) return count;
		else return count+1;
	}
}