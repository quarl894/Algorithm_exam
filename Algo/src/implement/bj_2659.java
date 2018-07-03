package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
처음에 틀린 이유 : 문제를 잘못 생각함. 시계수에 대한 개념을 잘못 잡음.
해결 방법 : 4자리수를 찾아가면서 각각의 시계수들도 찾아야되기 때문에 시계수 함수를 따로 구현.
0이 포함된 숫자는 해당 숫자 %1000 *10 을 해줘서 0이 포함되어있으면 없애게 함.
 */

public class bj_2659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");

        int temp = Integer.parseInt(sp[0])*1000 + Integer.parseInt(sp[1])*100 + Integer.parseInt(sp[2])*10 + Integer.parseInt(sp[3]);
        int result = sol(temp);
        int cnt = 0;
        for(int i=1111; i<=result; i++){
            if(i == sol(i)) cnt++;
        }
        System.out.println(cnt);
        br.close();

    }
    private static int sol(int x){
        int temp = x;
        for(int i=0; i<3; i++){
            x= x %1000 *10 + x/1000;
            if(x<temp) temp = x;
        }
        return temp;
    }
}


