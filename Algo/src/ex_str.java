import java.util.ArrayList;

public class ex_str {
	public static void main(String[] args) {
		String a[] = {"����", "���", "����", "����", "����"};
		String result = joinWords(a);
		System.out.println(result);
	}
	
	public static String joinWords(String[] words){
		StringBuffer sentence = new StringBuffer();
		for(String w : words){
			sentence.append(w +", ");
		}
		return sentence.toString();
	}
}
