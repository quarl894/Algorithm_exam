package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//ȸ�ǽ� ����
public class ex_1931 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Time> arr = new ArrayList<>();
		int max_S =0;
		for(int i=0; i<N; i++){
			String[] sp = br.readLine().split(" ");
			int s = Integer.parseInt(sp[0]);
			int e = Integer.parseInt(sp[1]);
			if(max_S<s) max_S = s; //���۽ð� �� ���� ��
			arr.add(new Time(s,e));
		}
		
		//���ð� ���� �� ���� �� ���۽ð� ���� �� ����
		Collections.sort(arr, new Comparator<Time>(){
			@Override
			public int compare(Time A, Time B){
				if(A.end>B.end) return 1;
				else if(A.end<B.end) return -1;
				else{
					if(A.start>B.start) return 1;
					else if(A.start<B.start) return -1;
					else return 0;
				}
			}
		});
		
		//for(Time a : arr) System.out.println(a.start + ", " +a.end);
		Time temp = arr.get(0);
		int count =1;
		//���۽ð��� �� ū�ͺ��� ���� ���ð��� �� ũ�� ����(�� �̻� ȸ�Ǹ� �� �� ���� ����)
			for(int i=1; i<N; i++){
				if(temp.end>max_S) break;
				if(temp.end<=arr.get(i).start){
					temp = arr.get(i);
					count++;
				}
			}
		System.out.println(count);
		br.close();
	}
}

final class Time{
	int start;
	int end;
	Time(int start, int end){
		this.start = start;
		this.end = end;
	}
}
