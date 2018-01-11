package backjune;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 2���� ��� ���� �� N���� �־�����.
 *  ��ǥ�� y��ǥ�� �����ϴ� ������, y��ǥ�� ������ x��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
class coor{
	int x;
	int y;
	coor(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class ex_11651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<coor> arr = new ArrayList<coor>();
		for(int i=0; i<N; i++){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr.add(new coor(num1, num2));
		}
		
		Collections.sort(arr, new Comparator<coor>(){
			@Override
			public int compare(coor a1, coor a2){
				if(a1.y>a2.y) return 1;
				else if(a1.y <a2.y) return -1;
				else{
					if(a1.x>a2.x) return 1;
					else if(a1.x<a2.x) return -1;
					else return 0;
				}
			}
		});
		for(coor a : arr){
			System.out.println(a.x + " " +a.y);
		}
	}

}

