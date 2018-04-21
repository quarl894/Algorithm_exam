package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//�Ǻ���ġ ����
public class ex_2373 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 
		ArrayList<Integer> arr= new ArrayList<>();
		int i = 1;
		
		//fio �鸸���� ����. N�� �鸸�����̹Ƿ�
		while(i<=31){
			arr.add(fibo(i));
			i++;
		}
		int count = -1;
		int result = N;

		if(arr.contains(N)) System.out.println(-1);
		else{
			while(true){
				count++;
				if(arr.get(count)>result){
					result -= arr.get(count-1);
					if(result==0){
						System.out.println(arr.get(count-1));
						break;
					}else if(result<0){
						System.out.println(-1);
						break;
					}
					count=0;
				}
			}
		}
		br.close();
	}
	
	static private int fibo(int n){
		if(n<=1) return n;
		else return fibo(n-2)+fibo(n-1);
	}
}
