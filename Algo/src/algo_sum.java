//같은 문자가 연속으로 반복될 경우, 그 횟수를 사용해 문자열을 압축하는 메서드를 구현하라.
// aabcccaaa 면 a2b1c3a3로 변환
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
			//마지막만 따로 구현
			if(i==a.length()-2) result +=a.charAt(i+1) +Integer.toString(count);
		}
		return result;
	}
}
