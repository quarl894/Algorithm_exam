package backjune;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ���� -> ���� -> cmd�� �ĺ���. ���� ȭ���� ���� ���δ�. ���⼭ dir�̶�� ġ�� �� ���丮�� �ִ� ������丮�� ������ ��� ���´�. �� �� ���ϴ� ������ ã������ ������ ���� �ϸ� �ȴ�.

dir *.exe��� ġ�� Ȯ���ڰ� exe�� ������ �� ���´�. "dir ����"�� ���� ġ�� �� ���Ͽ� �´� ���ϸ� �˻� ����� ���´�. ���� ���, dir a?b.exe��� �˻��ϸ� ���ϸ��� ù ��° ���ڰ� a�̰�, �� ��° ���ڰ� b�̰�, Ȯ���ڰ� exe�� ���� ��� ���´�. �� �� �� ��° ���ڴ� �ƹ��ų� ���͵� �ȴ�. ���� ���, acb.exe, aab.exe, apb.exe�� ���´�.

�� ������ �˻� ����� ���� �־����� ��, �������� �� �ľ� �� ����� ���������� ����ϴ� �����̴�. ���Ͽ��� ���ĺ��� "." �׸��� "?"�� ���� �� �ִ�. �����ϸ� ?�� ���� ��� �Ѵ�. �� ���丮���� �˻� ����� ���� ���ϸ� �ִٰ� �����ϰ�, ���� �̸��� ���̴� ��� ����.
 */
public class ex_1032 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		char[] chars = scan.next().toCharArray(); //ù��° ���ڸ� �ٷ� �޾Ƽ� ���ڷ� �ɰ�
		for(int i=1; i<num; i++){ //ù��° �ܾ�� �޾����� �ι�°���� i=1
			String temp = scan.next();
			for(int j=0; j<chars.length; j++){
				if(chars[j] !=temp.charAt(j)){
					chars[j]='?';
				}
			}
		}
		System.out.println(String.valueOf(chars)); //char[]�� String���� ��ȯ���ش�.
	}
}
