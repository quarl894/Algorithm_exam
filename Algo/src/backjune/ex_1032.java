package backjune;

import java.util.Scanner;

/*
 * ���� -> ���� -> cmd�� �ĺ���. ���� ȭ���� ���� ���δ�. ���⼭ dir�̶�� ġ�� �� ���丮�� �ִ� ������丮�� ������ ��� ���´�. �� �� ���ϴ� ������ ã������ ������ ���� �ϸ� �ȴ�.

dir *.exe��� ġ�� Ȯ���ڰ� exe�� ������ �� ���´�. "dir ����"�� ���� ġ�� �� ���Ͽ� �´� ���ϸ� �˻� ����� ���´�. ���� ���, dir a?b.exe��� �˻��ϸ� ���ϸ��� ù ��° ���ڰ� a�̰�, �� ��° ���ڰ� b�̰�, Ȯ���ڰ� exe�� ���� ��� ���´�. �� �� �� ��° ���ڴ� �ƹ��ų� ���͵� �ȴ�. ���� ���, acb.exe, aab.exe, apb.exe�� ���´�.

�� ������ �˻� ����� ���� �־����� ��, �������� �� �ľ� �� ����� ���������� ����ϴ� �����̴�. ���Ͽ��� ���ĺ��� "." �׸��� "?"�� ���� �� �ִ�. �����ϸ� ?�� ���� ��� �Ѵ�. �� ���丮���� �˻� ����� ���� ���ϸ� �ִٰ� �����ϰ�, ���� �̸��� ���̴� ��� ����.
 */
public class ex_1032 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text1, text2, text3;
		int N;
		N = scan.nextInt();
		text1 = scan.next();
		text2 = scan.next();
		text3 = scan.next();
		String result="";
		
		for(int i=0; i<text1.length(); i++){
			if(text1.charAt(i)==text2.charAt(i) && text1.charAt(i)==text3.charAt(i) && text2.charAt(i)==text3.charAt(i)){
				result +=text1.charAt(i);
			}else{
				result +="?";
			}
		}
		System.out.println(result);
	}
}
