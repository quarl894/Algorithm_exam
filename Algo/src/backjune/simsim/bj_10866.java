package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj_10866 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();
        while(n-->0){
            StringTokenizer stk = new StringTokenizer(br.readLine());

            while(stk.hasMoreTokens()){
                switch(stk.nextToken()){
                    case "push_back" :
                        q.offerLast(Integer.parseInt(stk.nextToken()));
                        break;
                    case "push_front" :
                        q.offerFirst(Integer.parseInt(stk.nextToken()));
                        break;
                    case "front" :
                        if(!q.isEmpty()){
                            System.out.println(q.peekFirst());
                        }else{
                            System.out.println(-1);
                        }
                        break;
                    case "back" :
                        if(!q.isEmpty()){
                            System.out.println(q.peekLast());
                        }else{
                            System.out.println(-1);
                        }
                        break;
                    case "size" :
                        System.out.println(q.size());
                        break;
                    case "empty" :
                        if(!q.isEmpty()) System.out.println(0);
                        else System.out.println(1);
                        break;
                    case "pop_front" :
                        if(!q.isEmpty()){
                            System.out.println(q.pollFirst());
                        }else{
                            System.out.println(-1);
                        }
                        break;
                    case "pop_back" :
                        if(!q.isEmpty()){
                            System.out.println(q.pollLast());
                        }else{
                            System.out.println(-1);
                        }
                        break;
                }
            }
        }
    }
}
