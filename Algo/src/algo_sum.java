//���� ���ڰ� �������� �ݺ��� ���, �� Ƚ���� ����� ���ڿ��� �����ϴ� �޼��带 �����϶�.
// aabcccaaa �� a2b1c3a3�� ��ȯ
public class algo_sum {
	public static void main(String[] args) {
		String a= "aabcccddde";
		System.out.println(sum(a));
	}
	
	public static String sum(String a){
		String result= "";
		int count =1;
		for(int i=0; i<a.length()-1; i++){
			if(a.charAt(i) == a.charAt(i+1)){
				count++;
			}else{
				result +=a.charAt(i) +Integer.toString(count);
				count =1;
			}
			//�������� ���� ����
			if(i==a.length()-2) result +=a.charAt(i+1) +Integer.toString(count);
		}
		return result;
	}
}
