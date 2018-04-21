package Sort;

public class Heap_exam {
	private int heapSize;
	private int itemHeap[];
	
	Heap_exam(){
		heapSize = 0;
		itemHeap = new int[50];
	}
	
	public int getHeapSize(){
		return this.heapSize;
	}
	public static void main(String[] args) {
		int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
		HeapSort(arr);
	}
	
	//HeapSort
	public static void HeapSort(int[] arr) {
		Heap_exam heap = new Heap_exam();
		for (int i = 0; i < arr.length; i++) {
			heap.insertHeap(arr[i]);
		}
			 
		for (int i = arr.length-1; i>= 0; --i) {
			arr[i] = heap.deleteHeap();
		}
		System.out.println("Èü Á¤·Ä");
		//Ãâ·Â
		for (int i = 0; i < arr.length; i++) {
		System.out.printf(arr[i]+" ");
		}
	}

	//Heap »ğÀÔ
	public void insertHeap(int item){
		int i = ++heapSize;
		while ((i != 1) && (item > itemHeap[i / 2])){ 
			itemHeap[i] = itemHeap[i / 2];
			i /= 2;
		}
		itemHeap[i] = item; 
	}
	
	//Heap »èÁ¦
	public int deleteHeap(){
		int parent, child;
		int item, tmp;
		item = itemHeap[1];
		tmp = itemHeap[heapSize--];
		parent = 1;			child = 2;
		while (child <= heapSize) {
			if ((child < heapSize) && (itemHeap[child] < itemHeap[child + 1])) child++;
			if (tmp >= itemHeap[child]) break;
		
			itemHeap[parent] = itemHeap[child];
			parent = child;
			child *= 2;
		}
		itemHeap[parent] = tmp;
		return item;
	}
}