package Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaMaxHeapExample {
	private int[] Heap;
	private int size;
	private int maxsize;

	private static final int FRONT = 1;

	public JavaMaxHeapExample(int maxsize) {
		this.maxsize = maxsize;
		this.size = 0;
		Heap = new int[this.maxsize + 1];
		Heap[0] = Integer.MAX_VALUE;
	}

	private int parent(int pos) {
		return pos / 2;
	}

	private int leftChild(int pos) {
		return (2 * pos);
	}

	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}
	
	private void swap(int fpos, int spos) {
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	//��ͷ� ����
	private void maxHeapify(int pos) {
			// �ڽ� ��尡 �θ��庸�� Ŭ ���
			if (Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]) {
				// �ڽ� 2�� �� �� ���� �ڽ��� �� ũ��
				if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
					//���� �ڽİ� swap
					swap(pos, leftChild(pos));
					maxHeapify(leftChild(pos));
					//�ݴ�� ������ �ڽİ� swap
				} else {
					swap(pos, rightChild(pos));
					maxHeapify(rightChild(pos));
				}
			}
		}

	public void insert(int element) {
		Heap[++size] = element;
		int current = size;

		while (Heap[current] > Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	public void print() {
		for (int i = 1; i <= size / 2; i++) {
			System.out.print(
					" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i] + " RIGHT CHILD :" + Heap[2 * i + 1]);
			System.out.println();
		}
	}

	public int remove() {
		int popped = Heap[FRONT];
		Heap[FRONT] = Heap[size--];
		maxHeapify(FRONT);
		return popped;
	}

	public static void main(String[] args) throws Exception {
		JavaMaxHeapExample maxHeap = new JavaMaxHeapExample(100002);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			if(num==0){
				if(maxHeap.size==0) System.out.println(0);
				else System.out.println(maxHeap.remove());
			}else{
				maxHeap.insert(num);
			}
		}
		br.close();
	}
}