package backjune.simsim;

public class BubbleSort {
    // bubble 시간복잡도 : n^2, 공간복잡도 n^2
    // select 시간복잡도 : n^2, 공간복잡도 n^2
    public static void main(String[] args) throws Exception{
        int[] arr = { 4, 54, 2, 8, 63, 7, 55, 56 };

        print(bubble3(arr));
        print(select3(arr));
        print(insert(arr));

        mergeSort(arr,arr.length);
        quickSort(arr,0, arr.length-1);

    }


    private static int[] select3(int[] arr){
        System.out.println("select3");
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] bubble3(int[] arr){
        System.out.println("bubble3");

        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] bubble2(int[] arr){
        System.out.println("bubble2");
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubble(int[] arr){
        System.out.println("bubble");
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    private static int[] select2(int[] arr){
        System.out.println("select2");
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private static int[] select(int[] arr){
        System.out.println("select");
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] insert(int[] arr){
        System.out.println("insert");
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i;
            while((j>0) && (arr[j-1]>temp)){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }

    private static void mergeSort(int[] arr, int length){
        int center = length/2;
        int[] leftNum = new int[center];
        int[] rightNum = new int[length-center];

        if(length==1) return;

        for(int i=0; i<center; i++){
            leftNum[i] = arr[i];
        }

        for(int i=0; i<length-center; i++){
            rightNum[i] = arr[center+i];
        }

        mergeSort(leftNum, leftNum.length);
        mergeSort(rightNum, rightNum.length);

        merge(leftNum,rightNum,arr);
    }

    private static void merge(int[] leftNum, int[] rightNum, int[] arr){
        int left = 0;
        int right= 0;
        int merge = 0;

        while(leftNum.length!=left && rightNum.length !=right){
            if(leftNum[left]<rightNum[right]){
                arr[merge] = leftNum[left];
                left++;
                merge++;
            }else{
                arr[merge] = rightNum[right];
                right++;
                merge++;
            }
        }

        while(leftNum.length !=left){
            arr[merge] = leftNum[left];
            left++;
            merge++;
        }

        while(rightNum.length !=right){
            arr[merge] = rightNum[right];
            right++;
            merge++;
        }
        print(arr);
//        return arr;
    }

    private static void quickSort(int[] num, int s, int e){
        if(s>=e) return;

        int left = s;
        int right = e;
        int pivot = num[(left+right)/2];

        do{
            while(num[left] < pivot) left++;
            while(num[right] > pivot) right--;

            if(left<=right){
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }
        }while(left<=right);

        if(s<right) quickSort(num,s,right);
        if(e>left) quickSort(num,left,e);

        print(num);

    }


    private static void print(int[] arr){

        for(int a : arr){
            System.out.printf(a+" ");
        }
        System.out.println();
    }

}
