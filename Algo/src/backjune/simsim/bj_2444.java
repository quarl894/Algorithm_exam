package backjune.simsim;

import java.util.ArrayList;
import java.util.Scanner;

public class bj_2444 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder st2 = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();

        int mid = n;
        int l = 1;
        int r = 2*n-1;
        for(int i=1; i<=n; i++){
            StringBuilder st = new StringBuilder();
            int num = 2*(i-1) +1;
            boolean flag = false;
            for(int j=1; j<=2*n-1; j++){
                if(mid>j){
                    st.append(" ");
                }else if(mid<=j && num>0 && !flag){
                    num--;
                    st.append("*");
                    if(num==0) flag= true;
                }
            }
            mid--;
            arr.add(st.toString());
        }
        for(int i=0; i<arr.size(); i++){
            st2.append(arr.get(i)+"\n");
        }

        for(int i=arr.size()-2; i>=0; i--){
            if(i==0) st2.append(arr.get(i));
            else st2.append(arr.get(i)+"\n");
        }
        System.out.println(st2);
        sc.close();
    }
}
