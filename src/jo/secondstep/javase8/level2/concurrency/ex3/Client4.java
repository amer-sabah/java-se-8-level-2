package jo.secondstep.javase8.level2.concurrency.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client4 {
	
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Obtaining Synchronized Collections
		//
		//	synchronizedCollection(Collection<T> c)
		//	synchronizedList(List<T> list)
		//	synchronizedMap(Map<K,V> m)
		//	synchronizedNavigableMap(NavigableMap<K,V> m)
		//	synchronizedNavigableSet(NavigableSet<T> s)
		//	synchronizedSet(Set<T> s)
		//	synchronizedSortedMap(SortedMap<K,V> m)
		//	synchronizedSortedSet(SortedSet<T> s)
		
		List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));
		synchronized (list) {
			for (int data : list)
				System.out.print(data + " ");
		}
		
		System.out.println("--------------------------------");
		
		Map<String, Object> foodData = new HashMap<String, Object>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
		for (String key : synchronizedFoodData.keySet()) {
			synchronizedFoodData.remove(key);
		}
		
	}
}