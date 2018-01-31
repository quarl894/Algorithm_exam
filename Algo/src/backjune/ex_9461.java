package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//�ĵ��� ����
public class ex_9461 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			System.out.println(Result(num));
		}
		br.close();
	}
	//int ���� �ʰ��ϹǷ� Long���� ����
	private static Long Result(int num){
		List<Long> arr = new ArrayList<Long>();
		arr.add((long) 1);
		arr.add((long)1);
		arr.add((long)1);
		arr.add((long)2);
		arr.add((long)2);
		// �տ������� �ֱⰡ ��� ���� �־���
		int count = num-5;
		int last = 4;
		if(count>0){
			// 6��° ����  ã�� �� = �ٷ� �ռ� + (ã����-5��°)��
			for(int i=0; i<count; i++){
				arr.add(arr.get(i) +arr.get(last));
				last++;
			}
		}
		return arr.get(num-1);
	}
}


