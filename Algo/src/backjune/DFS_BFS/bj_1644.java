package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class bj_1644 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 0;
        int r = 0;
        int ans = 0;
        ArrayList<Integer> arr= new ArrayList<>();
        boolean[] c = new boolean[n+1];

        //소수 구하기
        for(int i=2;i<=n; i++) {
           if(!c[i]){
               arr.add(i);
               for(int j=2*i; j<=n; j+=i){
                   c[j] = true;
               }
           }
        }

        //N ==1 일때 생각해야함. 런타임 에러남. 왜냐 소수가 없기 때문에 인덱스 초과.
        int sum = arr.size() == 0 ? 0 : arr.get(0);

        while(l<=r && r<arr.size()){
            if(sum == n){
                ans++;
                r++;
                if(r==arr.size()) break;
                sum +=arr.get(r);
            }else if(sum>n){
                sum -=arr.get(l);
                l++;
                if(l>r && l<arr.size()){
                    sum = arr.get(l);
                    r = l;
                }
            }else{
                r++;
                if(r==arr.size()) break;
                sum +=arr.get(r);
            }
        }
        System.out.println(ans);
        sc.close();

    }
}
