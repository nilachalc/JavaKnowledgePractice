package collectiondemos;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> hashMap1 = new TreeMap<Integer, String>();
		Map<Integer, String> hashMap2 = new TreeMap<Integer, String>();

		hashMap1.put(102,"Rana");
		hashMap1.put(101,"Mik");
		hashMap1.put(100,"Nil");
		
		// Traversing a Map.
		// First way.
		for(Entry<Integer, String> e:hashMap1.entrySet()) {    
			System.out.println(e.getKey()+" "+e.getValue());    
		}  
		
		System.out.println();  
		System.out.println();
		
		// Second way.
		for(Integer key: hashMap1.keySet()) {
			System.out.println(key + " " +hashMap1.get(key));
		}
		
		System.out.println();  
		System.out.println();
		
		// Third Way
		Iterator<Entry<Integer, String>> hasMap1Iterator = hashMap1.entrySet().iterator();
		while (hasMap1Iterator.hasNext()) {
			System.out.println(hasMap1Iterator.next());
		}
		
		System.out.println();  
		System.out.println();
		
		// Fourth Way
		Iterator<Integer> hasMapIterator = hashMap1.keySet().iterator();
		while (hasMapIterator.hasNext()) {
			Integer key = hasMapIterator.next();
			System.out.println(key + " " + hashMap1.get(key));
		}
		
		hashMap2.put(103,"Dip");  
		hashMap2.putAll(hashMap1);  
		System.out.println("After invoking putAll() method ");  
		for(Entry<Integer, String> m:hashMap2.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
	}
}
