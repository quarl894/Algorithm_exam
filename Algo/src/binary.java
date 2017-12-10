import java.util.ArrayList;
import java.util.HashSet;

public class binary {
	static ArrayList dataList;
	static ArrayList resultList;
	static long avtime;
	public static void main(String[] args) {
		dataList = new ArrayList<String>();

		  dataList.add("1111");
	        dataList.add("2222");
	        dataList.add("3333");
	        dataList.add("3333");
	        dataList.add("aaaa");
	        dataList.add("bbbb");
	        dataList.add("eeee");
	        dataList.add("bbbb");
	        dataList.add("¾È³ç");
	        dataList.add("¾È³ç?");
	        dataList.add("¾È³ç");
	        dataList.add("ÀÌ°Ç ÄÚµå°¡ ¾Æ´Ï´Ù");
	        
	        int x =0;
	        while(x<1000){
	        	long startTime = System.nanoTime();
//	        	resultList = new ArrayList<String>();
//	        	for(int i=0; i<dataList.size(); i++){
//	        		if(!resultList.contains(dataList.get(i))){
//	        			resultList.add(i);
//	        		}
//	        	}
	        	HashSet<String> result = new HashSet<String>(dataList);
	        	dataList = new ArrayList<String>(result);
	        	long endTime = System.nanoTime();
	        	long tt = endTime - startTime;
	        	System.out.println(tt);
	        	avtime += tt;
	        	x++;
	        }
	        System.out.printf("Æò±Õ½Ã°£ : %d",(avtime/1000));
	        System.out.println(dataList);
	}
}
