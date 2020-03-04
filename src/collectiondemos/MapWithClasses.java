package collectiondemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import testbeans.Cat;

public class MapWithClasses {

	public static void main(String[] args) {
		// Test with HashMap
		Map<Cat, Integer> hashMap = new HashMap<Cat, Integer>();
		Cat c1 = new Cat(10, "red");
		Cat c2 = new Cat(5, "black");
		Cat c3 = new Cat(8, "white");
		Cat c4 = new Cat(15, "white");
		hashMap.put(c1, 10);
		hashMap.put(c2, 15);
		hashMap.put(c3, 5);
		hashMap.put(c4, 20);
		//print size
		System.out.println(hashMap.size());
		//loop HashMap
		for (Entry<Cat, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - Age " + entry.getValue());
		}
		
		// Test with LinkedHashMap
		Map<Cat, Integer> linkedHashMap = new LinkedHashMap<Cat, Integer>();
		Cat c5 = new Cat(10, "red");
		Cat c6 = new Cat(5, "black");
		Cat c7 = new Cat(8, "white");
		Cat c8 = new Cat(15, "white");
		
		linkedHashMap.put(c8, 20);
		linkedHashMap.put(c5, 10);
		linkedHashMap.put(c6, 15);
		linkedHashMap.put(c7, 5);
		//print size
		System.out.println(linkedHashMap.size());
		//loop HashMap
		for (Entry<Cat, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - Age " + entry.getValue());
		}
		
		// Test with TreeMap
		Map<Cat, Integer> treeMap = new TreeMap<Cat, Integer>();
		Cat c11 = new Cat(10, "red");
		Cat c22 = new Cat(5, "black");
		Cat c33 = new Cat(8, "white");
		Cat c44 = new Cat(8, "white");// Cat c44 = new Cat(12, "white"); Because now Different sizes make different dogs!
		treeMap.put(c11, 10);
		treeMap.put(c22, 15);
		treeMap.put(c33, 5);
		treeMap.put(c44, 20);
		//print size
		System.out.println(treeMap.size());
		//loop HashMap
		for (Entry<Cat, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - Age " + entry.getValue());
		}
	}
}
