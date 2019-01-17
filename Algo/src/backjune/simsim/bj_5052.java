package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_5052 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        while(total-->0){
            int num = Integer.parseInt(br.readLine());
            String[] arr = new String[num];
            for(int i=0; i<num; i++){
                arr[i] = br.readLine();
            }
            result(arr);
        }
        br.close();
    }

    // 오름차순 정렬 기준으로 다음 것이 길이가 작으면 겹치는 숫자가 다른 것이기 때문에 긴 것만 판단.
    private static void result(String[] arr){
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i].length() <arr[i+1].length()){
                int length = 0;
                for(int j=0; j<arr[i].length(); j++){
                    if(arr[i].charAt(j) == arr[i+1].charAt(j)){
                        length++;
                    }
                }
                if(length==arr[i].length()){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
        return;
    }
}
