
public class example {

	public static void main(String[] args) {
		int num = 123;
		int a = num%10;
		num /=10;
		int b = num%10;
		num /=10;
		int c = num%10;
		System.out.println(a+""+ b+""+c);
	}

}
