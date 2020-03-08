package collectiondemos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<String>();
		String[] arrays = {"Nil", "Dip", "Mik", "Rana", "Dim"};
		String string1 = new String("string1");

		// Add elements.
		set1.add(string1);
		set1.addAll(Arrays.asList(arrays));

		// Find the first element of a set.
		System.out.println(set1.iterator().next());
		System.out.println(set1.parallelStream().findFirst().get());
		
		System.out.println();
		System.out.println();
		
		// Traversing a Set.
		// First way.
		for(String s:set1) {    
			System.out.print(s + "  ");    
		}  
		
		System.out.println();  
		
		// Second way.
		Iterator<String> hasSet1Iterator = set1.iterator();
		while (hasSet1Iterator.hasNext()) {
			System.out.print(hasSet1Iterator.next() + "  ");
		}
		
		// Remove elements.
		set1.remove(string1);
		
		System.out.println();
		System.out.println();
		for(String s:set1) {    
			System.out.print(s + "  ");    
		}
		
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("Dim");
		set2.add("Dip");
		set2.add("pachu");
		
		System.out.println();
		for(String s:set2) {    
			System.out.print(s + "  ");    
		}
		
		set1.removeAll(set2);
		
		System.out.println();
		for(String s:set1) {    
			System.out.print(s + "  ");    
		}
		
		Set<String> set3 = new LinkedHashSet<String>();
		set3.add("Mik");
		set3.add("Rana");
		set1.retainAll(set3);
		
		System.out.println();
		System.out.println();
		
		for(String s:set1) {    
			System.out.print(s + "  ");    
		}
	}
}
