package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 카드정렬하기
public class ex_1715 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Long> q = new PriorityQueue<>();
		long sum = 0;
		for(int i=0; i<N; i++){
			q.add(Long.parseLong(br.readLine()));
		}
		//1일때는 1개값이 아니라 비교가 없으므로 0으로 출력해야함.
		if(q.size()==1) System.out.println(0);
		else{
			while(q.size()!=1 && !q.isEmpty()){
				long temp = q.poll() + q.poll();
				q.add(temp);
				sum +=temp;
			}
			System.out.println(sum);
		}
		br.close();
	}

}
