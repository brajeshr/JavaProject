package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {

	public static void main(String[] args) {

        Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        //Map<String, Integer> map = new HashMap<String, Integer>(); //line 2
		map.put("Ram", 100);
		map.put("Syam", 101);
		map.put("Ramesh", 102);
		System.out.println("Map value:" + map);
		Set<String> s = map.keySet();
		Iterator<String> ite = s.iterator();
		while (ite.hasNext()) {
			String key = ite.next();
			map.put("hi", 12);//if you uncomment line 2 you will get error java.util.ConcurrentModificationException
			map.remove("Ram");//if you uncomment line 2 you will get error java.util.ConcurrentModificationException
			System.out.println("Key:" + key + "  " +"Value:" + map.get(key));
		}
		System.out.println("Map value:" + map);
	}

}
