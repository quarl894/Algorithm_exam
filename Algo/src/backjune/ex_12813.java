package backjune;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ex_12813{
	private static String a,b;
	private static int t_a, t_b;
	public static void main(String[] args) throws IOException{
		run();
	}
	public static void run() throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		a = sc.nextLine();
		b = sc.nextLine();
		for(int i=0; i<5; i++){
			for(int j=0; j<100000; j++){
				t_a = a.charAt(j)-'0';
				t_b = b.charAt(j)-'0';
				switch(i){
				case 0:
					bw.write((t_a&t_b)+'0');
					break;
				case 1:
					bw.write((t_a|t_b)+'0');
					break;
				case 2:
					bw.write((t_a^t_b)+'0');
					break;
				case 3:
					if(t_a==0)	bw.write("1");
					else	bw.write("0");
					break;
				case 4:
					if(t_b==0)	bw.write("1");
					else	bw.write("0");
					break;
				}
				bw.flush();
			}
			System.out.println();
		}
	}
}
