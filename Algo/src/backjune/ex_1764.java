package backjune;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex_1764 {
    public static void main(String args[]){
    	long stime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        Set<String> set1=new HashSet<String>(); //�赵 ���� ���� �����ϴ� set
        Set<String> result=new HashSet<String>();   //�躸���� �����ϴ� set
         
        int N=sc.nextInt();
        int M=sc.nextInt();
        String[] set2=new String[M];    //���� ���� ���� �����ϴ� �迭
         
        for(int i=0;i<N;i++){
            String tmp=sc.next();
            set1.add(tmp);  //�赵 ���� ���� ���� set�� �־���
        }
        for(int i=0;i<M;i++){
            String tmp=sc.next();
            set2[i]=tmp;    //���� ���� ���� �迭�� �־���
        }
        for(int i=0;i<M;i++){    //���� ���� �⿡ �ִ� ����� �赵 ���� �⿡ ���ԵǸ� result�� �־���
            if(set1.contains(set2[i])==true)   
                result.add(set2[i]);
        }
         
        //set�� �迭�� �ٲپ���(�������� ������ �ϱ� ����)
        String[] tmp=result.toArray(new String[result.size()]);
        Arrays.sort(tmp);   //�������� ����
        System.out.println(tmp.length); //���� ���
        for(int i=0; i<tmp.length;i++)
            System.out.println(tmp[i]); //�躸�� ���
    	long etime = System.currentTimeMillis();
    	System.out.println(etime-stime);
    }
}

