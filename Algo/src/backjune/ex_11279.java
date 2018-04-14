package backjune;

//�ִ� ��

import java.util.Scanner;

public class ex_11279 {
  static int[] heap;
  static int size=0;
   
  static void add(int x){
      int idx=size;
      heap[size++]=x;
      while(true){    //�θ𺸴� ���� ũ�� �θ�� �ٲٱ� �ݺ�
          int p=(idx-1)/2;    //�θ��� �ε���
          if(heap[p]<heap[idx]){   //�θ𺸴� ���� ũ�� ���� �ٲٰ� ���� �ε����� �θ�� �ٲپ���
              int tmp=heap[p];
              heap[p]=heap[idx];
              heap[idx]=tmp;
              idx=p;
          }
          else
              break;
      }
  }
   
  static void remove(){
      if(size==0){
          System.out.println("0");
      }
      else{
          System.out.println(heap[0]);
          heap[0]=heap[size-1];   //���� ���� ���� �θ��� ���� ��
          size--;
      }
      int idx=0;
      while(true){
          int MAX=idx;    //�ڽŰ�, �������ڽ�, ���� �ڽ� �� �ִ밪 ã�� ���� �ε��� ��
           
          //���� �����ڽ��� �����ϰ�, ���� �ڽ��� ���� ���� MAX ������ ũ�� MAX�� ���� �ڽ����� ����
          if((idx+(idx+1)<size) &&( heap[idx+(idx+1)]>heap[MAX]))
              MAX=idx+(idx+1);
           
          //���� �������ڽ��� �����ϰ�, ������ �ڽ��� ���� ���� MAX ������ ũ�� MAX�� ������ �ڽ����� ����
          if((idx+(idx+2))<size &&( heap[idx+(idx+2)]>heap[MAX]))
              MAX=idx+(idx+2);

          //�ڽĵ麸�� �ڽ��� ���� ũ�� �ùٸ� ����̹Ƿ� break
          if(MAX==idx)
              break;
           
          //�ڽ��� �� ũ�� �ش� �ڽİ� �ڽ��� �ٲٰ�, �� �Ʒ��� �ڽĵ�� ��
          else{
              int tmp=heap[MAX];
              heap[MAX]=heap[idx];
              heap[idx]=tmp;
              idx=MAX;
          }
               
      }
  }
   
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int N=sc.nextInt();
      heap=new int[N];
      for(int i=0;i<N;i++){
          int x=sc.nextInt();
          if(x==0)
              remove();
          else
              add(x);
      }
       
  }
}

