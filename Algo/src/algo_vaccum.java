
// �־��� ���ڿ� ���� ��� ������ "%20"���� ��ȯ�ϴ� �޼��带 �ۼ��϶�.
// ���ڿ� ���� �ʿ��� ���ڵ��� ���� �� �մ� ����� ������ �ִٰ� ����.
// ���ڿ� ���̿� ���鵵 ����.
public class algo_vaccum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a b ";
		String result = str.replaceAll(" ", "%20");
		System.out.printf("��ȯ:%s, ���ڿ�����:%d\n",result, result.length());
	}
}
