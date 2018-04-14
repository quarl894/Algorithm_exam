import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class abc {
	public static void main(String[] args) {
	    List<String> list = new ArrayList<>();
	    list.add("b");
	    list.add("b");
	    list.add("c");
	    list.add("d");
	    list.add("b");
	    list.add("c");
	    list.add("a");
	    list.add("a");
	    list.add("a");

	    Map<String, Integer> map = new HashMap<>();
	    for (String temp : list) {
	        Integer count = map.get(temp);
	        map.put(temp, (count == null) ? 1 : count + 1);
	    }
	    System.out.println(map);
	}
}