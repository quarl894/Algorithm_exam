package backjune;
/*
 * �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. 
 * ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, 
 * kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, 
 * aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
 * �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
			//������ �� ���� �����������
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
