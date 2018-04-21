package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//회의실 배정
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
			if(max_S<s) max_S = s; //시작시간 젤 늦은 것
			arr.add(new Time(s,e));
		}
		
		//끝시간 빠른 순 정렬 후 시작시간 빠른 순 정렬
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
		//시작시간이 젤 큰것보다 현재 끝시간이 더 크면 종료(더 이상 회의를 할 수 없기 때문)
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
