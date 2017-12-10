
public class algo_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcde";
		String b = "adceb";
		
		System.out.println(permutation(a,b));
	}
	
	//정렬 후 비교
	public static boolean permutation(String a, String b){
		if(a.length() !=b.length()) return false;
		
		//문자열의 문자들을 배열로 만들어줌
		char[] a_result = a.toCharArray();
		char[] b_result = b.toCharArray();
		
		//정렬
		java.util.Arrays.sort(a_result);
		java.util.Arrays.sort(b_result);
		
		//다시 String으로 변환 
		String str1 = new String(a_result);
		String str2 = new String(b_result);
		
		//비교
		if(str1.equals(str2)){
			return true;
		}else{
			return false;
		}
	}
	
	//코드 재사용으로 비교 메소드 와 정렬 메소드를 각각 분리하면 더 좋음
}
