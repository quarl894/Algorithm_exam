// 한 단어가 다른 단어에 포함된 문자열인지 판별하는 isSubString이라는 메서드가 있다고 하자.
// s1과 s2의 두 문자열이 주어졌을 때, s2가 s1을 회전시킨 결과인지 판별하는 코드를 isSubString을 한번만 호출하도록
// 하여 작성하라(가령 'waterbottle'은 'erbottlewat'을 회전시켜 얻을 수 있는 문자열이다)

public class algo_isSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		System.out.println("확인: "+isRotation(s1,s2));
		System.out.println("확인: "+replace(s1,s2));
	}
	

	//포함하는지 확인
	// false되는 조건을 설정해서 최대한 줄임.
	public static boolean isRotation(String s1, String s2){
		int len = s1.length();
		if(len == s2.length() && len>0){
			String s1s1 = s1+s1;
			return isSubString(s1s1,s2);
		}
		return false;
	}
	
	//s1을 두개 합쳐서 s2만 지움
	// 합친 문자열과 s2만 지운 문자열이 같으면 회전된 문자열
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
		
		//사실 이거 한줄만 써도 됨.
		return s1.contains(s2);
	}
}
