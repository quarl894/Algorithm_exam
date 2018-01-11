package backjune;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Info{
	int age;
	String name;
	int num;
	Info(int age, String name, int num){
		this.age=age;
		this.name = name;
		this.num = num;
	}
}
public class ex_10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Info> arr= new ArrayList<Info>();
		for(int i=0; i<N; i++){
			int age = sc.nextInt();
			String name = sc.next();
			arr.add(new Info(age, name, i));
		}

		Collections.sort(arr,new Comparator<Info>(){
			@Override
			public int compare(Info a1, Info a2){
				if(a1.age>a2.age) return -1;
				else if(a1.age<a2.age) return 1;
				else{
					if(a1.num>a2.num) return -1;
					else if(a1.num<a2.num) return 1;
					else return 0;
				}
			}
		});
		for(Info a : arr){
			System.out.println(a.age +" " +a.name);
		}
	}

}
