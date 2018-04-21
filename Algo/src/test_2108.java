import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test_2108 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		int[] dp = new int[N];
		float avg = 0;
		int mid = 0;
		int frq = 0;
		int rng = 0;
		
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			dp[i] = num;
		}
		br.close();
		Arrays.sort(dp);
		
		for(int a : dp){
			avg +=a;
		}
		avg = Math.round(avg/N);
		mid = dp[N/2];
		rng = dp[N-1] -dp[0];
		Map<Integer, Integer> map = new HashMap<>();
		for (int temp : dp) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		
		System.out.println(sortByValue(map));
	}

	@SuppressWarnings("unchecked")
	public static List sortByValue(Map<Integer, Integer> map){
        List<Integer> list = new ArrayList<>();
        list.addAll(map.keySet());
        Collections.sort(list,new Comparator() {
        	@Override
            public int compare(Object o1,Object o2) {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                return ((Comparable) v2).compareTo(v1);
            }
        });
        return list;
    }
}