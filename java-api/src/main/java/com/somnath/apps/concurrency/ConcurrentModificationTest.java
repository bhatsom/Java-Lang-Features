package com.somnath.apps.concurrency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationTest {

	public static void main(String[] args) {

		/*List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);

		for (Integer item : arrayList) {
			System.out.println("processing item: " + item);
			if (item == 2) {
				//arrayList.remove(item); // doesn't throw ConcurrentModificationException
				arrayList.add(item * 2);
			}
		}
		System.out.println("After arrayList iteration: " + arrayList);*/

		//Map<String, Integer> hashMap = new HashMap<>(Map.of("key1", 1, "key2", 2));
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("key1", 1);
		hashMap.put("key2", 2);
		for (String key : hashMap.keySet()) {
			System.out.println("processing key: " + key);
			if (key.equalsIgnoreCase("key2")) {
				//hashMap.remove(key); // doesn't throw ConcurrentModificationException
				hashMap.put(key+"-test", 100);
			}
		}

		/*Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>(Map.of("key1", 1, "key2", 2 ));
		for(String key : concurrentHashMap.keySet()) {
			System.out.println("processing key: " + key);
			if(key.equalsIgnoreCase("key2")) {
				concurrentHashMap.remove(key);
			}
		}*/
	}

}
