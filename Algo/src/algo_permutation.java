
public class algo_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcde";
		String b = "adceb";
		
		System.out.println(permutation(a,b));
	}
	
	//���� �� ��
	public static boolean permutation(String a, String b){
		if(a.length() !=b.length()) return false;
		
		//���ڿ��� ���ڵ��� �迭�� �������
		char[] a_result = a.toCharArray();
		char[] b_result = b.toCharArray();
		
		//����
		java.util.Arrays.sort(a_result);
		java.util.Arrays.sort(b_result);
		
		//�ٽ� String���� ��ȯ 
		String str1 = new String(a_result);
		String str2 = new String(b_result);
		
		//��
		if(str1.equals(str2)){
			return true;
		}else{
			return false;
		}
	}
	
	//�ڵ� �������� �� �޼ҵ� �� ���� �޼ҵ带 ���� �и��ϸ� �� ����
}
