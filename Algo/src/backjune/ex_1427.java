package backjune;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * 배열을 정렬하는 것은 쉽다. 숫자가 주어지면, 그 숫자의 각 자리수를 내림차순으로 정렬해보자.
 */
public class ex_1427 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		N = scan.nextInt();
		
		flip(N);
	}
	public static void flip(int num){
        int i=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(num!=0){
        	int result = num % 10;
        	list.add(result);
            num /= 10;
            i++;
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        ListIterator iter = list.listIterator();
        while(iter.hasNext()){
        	System.out.print(iter.next());
        }
    }
}
