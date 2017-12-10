
// 주어진 문자열 내의 모든 공백을 "%20"으로 변환하는 메서드를 작성하라.
// 문자열 끝에 필요한 문자들을 더할 수 잇는 충분한 공간이 있다고 가정.
// 문자열 길이에 공백도 포함.
public class algo_vaccum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a b ";
		String result = str.replaceAll(" ", "%20");
		System.out.printf("변환:%s, 문자열길이:%d\n",result, result.length());
	}
}
