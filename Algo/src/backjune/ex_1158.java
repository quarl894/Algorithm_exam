package backjune;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * �����۽� ������ ������ ����.
1������ N������ N���� ����� ���� �̷�鼭 �ɾ��ְ�, ���� ���� M(�� N)�� �־�����. 
���� ������� M��° ����� �����Ѵ�. �� ����� ���ŵǸ� ���� ������ �̷���� ���� ���� �� ������ ����� ������. 
�� ������ N���� ����� ��� ���ŵ� ������ ��ӵȴ�. ������ ������� ���ŵǴ� ������ (N, M)-�����۽� �����̶�� �Ѵ�. 
���� ��� (7, 3)-�����۽� ������ <3, 6, 2, 7, 5, 1, 4>�̴�.
N�� M�� �־����� (N,M)-�����۽� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class ex_1158 {
    
    static int N;
    static int M;
    static StringBuilder sb;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        sb.append("<");
        N = sc.nextInt();
        M = sc.nextInt();
        
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<=N; ++i){
            list.add(i);
        }
        f(list);
        
        System.out.println(sb.toString().substring(0,sb.length()-2)+">");
    }
    
    public static void f(LinkedList<Integer> list){
        
        int kill = 0; 
        while(N>0){
            for(int i=0; i<M-1; i++){
                kill++;
                if(kill > N-1) { kill=0;}
            }
            sb.append(list.get(kill)+", ");
            list.remove(kill);
            if(kill==list.size()) kill=0;
            
            N--;
        }
    }
}
