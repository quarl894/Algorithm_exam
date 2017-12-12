// �� �ܾ �ٸ� �ܾ ���Ե� ���ڿ����� �Ǻ��ϴ� isSubString�̶�� �޼��尡 �ִٰ� ����.
// s1�� s2�� �� ���ڿ��� �־����� ��, s2�� s1�� ȸ����Ų ������� �Ǻ��ϴ� �ڵ带 isSubString�� �ѹ��� ȣ���ϵ���
// �Ͽ� �ۼ��϶�(���� 'waterbottle'�� 'erbottlewat'�� ȸ������ ���� �� �ִ� ���ڿ��̴�)

public class algo_isSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		System.out.println("Ȯ��: "+isRotation(s1,s2));
		System.out.println("Ȯ��: "+replace(s1,s2));
	}
	

	//�����ϴ��� Ȯ��
	// false�Ǵ� ������ �����ؼ� �ִ��� ����.
	public static boolean isRotation(String s1, String s2){
		int len = s1.length();
		if(len == s2.length() && len>0){
			String s1s1 = s1+s1;
			return isSubString(s1s1,s2);
		}
		return false;
	}
	
	//s1�� �ΰ� ���ļ� s2�� ����
	// ��ģ ���ڿ��� s2�� ���� ���ڿ��� ������ ȸ���� ���ڿ�
	public static boolean replace(String s1, String s2){
		String s1s1 = s1+s1;

		if(s1.equals(s1s1.replace(s2,""))){
			return true;
		}
		return false;
	}
	
	public static boolean isSubString(String s1, String s2){
		if(s1.length() <s2.length()) return false;
		if(s1.equals(s2)) return true;
		
		//��� �̰� ���ٸ� �ᵵ ��.
		return s1.contains(s2);
	}
}
