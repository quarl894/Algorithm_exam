package backjune;

import java.util.ArrayList;
import java.util.Scanner;

//¿ä±Ý
public class ex_1140 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextFloat()){
			float T = sc.nextFloat();
			float pk1 = sc.nextFloat();
			float p1 = sc.nextFloat();
			float pk2 = sc.nextFloat();
			float p2 = sc.nextFloat();
			float money = 0;
			float a1 = p1/pk1;
			float a2 = p2/pk2;
			float temp = T;
			if(10<=a1 && 10<=a2){
				money = 10*T;
			}else if(a1<10 && a1<a2){
				int num = (int)(T/pk1);
				T/=pk1;
				money = (num*p1)+10*T;
			}else{
				int num = (int)(T/pk2);
				T -= pk2*num;
				money = (num*p2);
				float num2 = (int)(T/pk1);
				float temp_money = money + (num2+1)*p1;
				T -=pk1*num2;
				money +=(num2*p1)+10*T;
				money = Math.min(temp_money, money);
			}
			float min1 = ((int)(temp/pk1)+1)*p1;
			float min2 = ((int)(temp/pk2)+1)*p2;
			System.out.println((int)Math.min(min1, Math.min(min2, money)));
		}
		sc.close();
	}
}

