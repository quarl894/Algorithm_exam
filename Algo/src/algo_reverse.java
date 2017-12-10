// 널 문자로 끝나는 문자열을 뒤집는 reverse을 구현하라.
public class algo_reverse {

	public static void main(String[] args) {
		String result = "안녕하세요 반갑습니다";
		System.out.println(Str_reverse(result));
	}
	
	//문자열 거꾸로 쓰기
	public static String Str_reverse(String str){
		String sample ="";
		for(int i=str.length()-1; i>=0; i--){
			sample = sample +str.charAt(i);
		}
		return sample;
	}
}
