package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// ī�������ϱ�
public class ex_1715 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Long> q = new PriorityQueue<>();
		long sum = 0;
		for(int i=0; i<N; i++){
			q.add(Long.parseLong(br.readLine()));
		}
		//1�϶��� 1������ �ƴ϶� �񱳰� �����Ƿ� 0���� ����ؾ���.
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
