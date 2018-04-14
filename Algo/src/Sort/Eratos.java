package Sort;

public class Eratos {
	 public int n;
	 public final static int MAX_N=100;
	 public char[] sieve=new char[(MAX_N+7)/8];
	 
	 Eratos(int n){
	  this.n=n;
	 }
	 public boolean isPrime(int k){
	               //k>>3�� k�� 8�� ������ �� ����.(��Ʈ �̵� ������ ���)
	               //k&7�� k�� 8�� ���� �������� ����, 1�� 8�� ���� ������ ��                //ŭ �������� �̵��� ��ġ�� ã���� �ϴ� k�� ��ġ�̴�.
	  if((sieve[k>>3] & (1<<(k&7))) >0)
	   return true;
	  else
	   return false;
	 }
	// �Ҽ��� �ƴ� �ռ��� �� ��� ~����� &������ ���� 0���� �ٲ۴�.
	 void setComposition(int k){
	  sieve[k>>3] &= ~(1<<(k&7));
	 }
	 void eratos(){
	  for(int i=0;i<sieve.length;i++)
	   sieve[i]=255;
	  setComposition(0);
	  setComposition(1);
	  int numSize=n;
	  //���⼭ i<n�� ������ ��ŭ�� �ݺ��ص� �ȴ�.
	         //�ռ��� p*q���� p�� q�� �ϳ��� n�� �����ٺ��� ���� �� �ۿ� ����.
	         //2���� �����Ͽ� �迭�� �����ִ� ���� ����� ���� �����.
	         //�̷� ������ �����ϸ� 2�� ���ٸ� ���� ���� �Ҽ��� �����Ѵ�.
	  for(int i=2;i<=numSize;i++)
	   if(isPrime(i))
	    for(int j=i*i; j<=n; j+=i)
	     setComposition(j);
	  
	 }
	 
	 public static void main(String[] args){
	  Eratos sample=new Eratos(100);
	  sample.eratos();
	  for(int i=0; i<100; i++){
	   System.out.print(i+"="+sample.isPrime(i)+" ");
	   if(i%10==0)
	    System.out.println();
	   
	  }
	 }
}