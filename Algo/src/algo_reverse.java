// �� ���ڷ� ������ ���ڿ��� ������ reverse�� �����϶�.
public class algo_reverse {

	public static void main(String[] args) {
		String result = "�ȳ��ϼ��� �ݰ����ϴ�";
		System.out.println(Str_reverse(result));
	}
	
	//���ڿ� �Ųٷ� ����
	public static String Str_reverse(String str){
		String sample ="";
		for(int i=str.length()-1; i>=0; i--){
			sample = sample +str.charAt(i);
		}
		return sample;
	}
}
