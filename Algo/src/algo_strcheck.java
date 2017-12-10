import java.util.ArrayList;

// ���ڿ��� ���Ե� ���ڵ��� ���� ���������� �˻��ϴ� �˰����� �����϶�. 
// �ٸ� �ڷᱸ���� ����� �� ���� ��Ȳ�̶�� ��� �ϰڴ°�?
public class algo_strcheck {
	public static void main(String[] args) {
		String a= "abc";
		String b = "Hab";
		String c ="�����ٶ�";
		System.out.println(isUniqueChar2(a));
		System.out.println(isUniqueChar(c));
	}
	
	//�ѱ��� ������ �ȵ� 
	public static boolean isUniqueChar2(String str){
		//���ڴ� �� 256�����̹Ƿ� �ʰ��ϸ� �ߺ��� �ִٴ� ��.
		if(str.length() > 256) return false;
		boolean[] char_set = new boolean[256];
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i);
			//�ߺ��̵Ǿ� true�� �ٲ� ���̸� �����
			if(char_set[val]){
				return false;
			}
			//�ϳ��� ������̵�
			char_set[val] = true;
		}
		return true;
	}
	
	//��Ʈ���� �̿�
	public static boolean isUniqueChar(String str){
		//���ĺ� ������ 26���̱� ������
		if(str.length()>26) return false;
		
		int checker = 0;
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i) - 'a';
			if((checker &(1 <<val))>0){
				return false;
			}
			checker |= (1<<val);
		}
		return true;
	}
}


