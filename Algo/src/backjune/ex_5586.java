package backjune;

import java.util.Scanner;

/*
 * �Է����� �־����� ���ڿ����� �������� 3���� ���ڰ� JOI �Ǵ� IOI�� ���� ���� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ���ڿ��� ���ĺ� �빮�ڷθ� �̷���� �ִ�. 
 * ���� ���, �Ʒ��� ���� "JOIOIOI"���� JOI�� 1��, IOI�� 2�� �ִ�.
 */
public class ex_5586 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text= sc.next();
		Num(text);
	}
	
	//����Ȱ��� 'OI'�̹Ƿ� �ڿ������� �ݺ����� ���� OI�� ã�� J�� I�ΰ͸� ã�Ƽ� counting����.
	private static void Num(String str){
		int countJ=0, countI=0;
		char[] chars = str.toCharArray();
		for(int i=chars.length-1; i>1; i--){
			if(chars[i]=='I' && chars[i-1]=='O'){
				if(chars[i-2]=='J') countJ++;
				if(chars[i-2]=='I') countI++;
			}else{
				continue;
			}
		}
		System.out.println(countJ);
		System.out.println(countI);
	}
}
