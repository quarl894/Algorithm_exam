package bitmask;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_11723 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int S = 0;
        StringBuilder st = new StringBuilder();

        while(M-->0){
            String[] str = br.readLine().split(" ");
            switch (str[0]){
                case "add" :
                    S |=(1<<(Integer.parseInt(str[1])-1));
                    break;
                case "remove":
                    S &=~(1<<(Integer.parseInt(str[1])-1));
                    break;
                case "toggle":
                    S ^=(1<<(Integer.parseInt(str[1])-1));
                    break;
                case "check":
                    int chk =  (S &(1<<(Integer.parseInt(str[1])-1)));
                    if(chk!=0) st.append(1+"\n");
                    else st.append(0+"\n");
                    break;
                case "all":
                    S = (1<<21)-1;
                    break;
                case "empty":
                    S = 0;
                    break;
                    default:
                        break;
            }
        }
        System.out.println(st);
        br.close();

    }
}
