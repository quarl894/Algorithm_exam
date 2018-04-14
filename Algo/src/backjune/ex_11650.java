package backjune;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

final class XY{
	int x;
	int y;
	public XY(int x, int y){
		this.x= x;
		this.y= y;
	}
}
public class ex_11650 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<XY> num = new ArrayList<XY>();
		for(int i=0; i<N; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			num.add(new XY(x,y));
		}
		
		Collections.sort(num, new Comparator<XY>(){
			@Override
			public int compare(XY o1, XY o2){
				if(o1.x>o2.x){
					return 1;
				}else if(o1.x<o2.x){
					return -1;
				}
				else{
					if ( o1.y > o2.y ){
						return 1;
	                }
	                else if (o1.y < o2.y ){
	                    return -1;
	                }
	                else {
	                    return 0;
	                }
				}
			}
		});
		
		for(int i=0; i<num.size(); i++){
			System.out.println(num.get(i).x +" " + num.get(i).y);
		}
	}
}
