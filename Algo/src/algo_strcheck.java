import java.util.ArrayList;

// 문자열에 포함된 문자들이 전부 유일한지를 검사하는 알고리즘을 구현하라. 
// 다른 자료구조를 사용할 수 없는 상황이라면 어떻게 하겠는가?
public class algo_strcheck {
	public static void main(String[] args) {
		String a= "abc";
		String b = "Hab";
		String c ="가나다라마";
		System.out.println(isUniqueChar2(a));
		System.out.println(isUniqueChar(c));
	}
	
	//한글은 적용이 안됨 
	public static boolean isUniqueChar2(String str){
		//문자는 총 256가지이므로 초과하면 중복이 있다는 뜻.
		if(str.length() > 256) return false;
		boolean[] char_set = new boolean[256];
		for(int i=0; i<str.length(); i++){
			int val = str.charAt(i);
			//중복이되어 true로 바뀐 값이면 여기로
			if(char_set[val]){
				return false;
			}
			//하나면 여기로이동
			char_set[val] = true;
		}
		return true;
	}
	
	//비트백터 이용
	public static boolean isUniqueChar(String str){
		//알파벳 갯수가 26개이기 때문에
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


