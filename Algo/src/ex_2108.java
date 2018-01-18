import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ex_2108 {
/*
 첫째 줄에는 산술평균을 출력한다. 
 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
둘째 줄에는 중앙값을 출력한다.
셋째 줄에는 최빈값을 출력한다. 
여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
넷째 줄에는 범위를 출력한다.
최빈값..................
 */
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		ArrayList<Integer> result2 = new ArrayList<>();
		int[] dp = new int[N];
		float avg = 0;
		int mid = 0;
		int frq = 0;
		int rng = 0;
		//최소, 최대값 지정해줘야함. 0으로 했을시 틀릴 수 있음.
		int max =-4000;
		int min =4000;
		//범위가 절대값 4000이므로 안전하게 크기 8003으로 잡음.
		int[] arr = new int[8003];
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			avg +=num;
			if(max<num) max= num;
			if(min>num) min= num;
			//음수는 중복값 셀때 array index활용이 불가능하므로 다 양수로 변환.
			num +=4000;
			dp[i] = num;
		}
		br.close();
		Arrays.sort(dp);
		mid = dp[N/2]-4000;
		rng = max-min;
		//중복값 카운팅
		for(int i=0; i<dp.length; i++){
			arr[dp[i]]++;
		}
		int[] temp = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr);
		//최빈값 구하기
		for(int i=0; i<temp.length; i++){
			if(arr[arr.length-1]==temp[i]){
				result2.add(i-4000);
			}else{
				continue;
			}
		}
		Collections.sort(result2);
		//런타임 에러(최빈값이 1일수도 있으므로 설정)
		if(result2.size()>1) frq = result2.get(1);
		else frq = result2.get(0);
		avg = Math.round(avg/N);
		st.append(formatD(avg));
		st.append("\n");
		st.append(mid);
		st.append("\n");
		st.append(frq);
		st.append("\n");
		st.append(rng);
		System.out.println(st);
	}
	
	//소수점에서 뒤에 0없애기
	 public static String formatD(double number){
		 DecimalFormat df=new DecimalFormat("#.##");
	      return df.format(number);
	 }
}
