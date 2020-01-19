package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		String[] arrays = {"Nil", "Dip", "Mik", "Rana", "Dim"};
		String string1 = new String("string1");

		// Add elements.
		list1.add(string1);
		list1.addAll(Arrays.asList(arrays));
		list1.addAll(2, Arrays.asList(arrays));
		
		/*System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));*/
		
		// Remove elements.
		list1.remove(1);
		list1.remove(string1);
		List<String> list2 = new ArrayList<String>();
		list2.add("Dim");
		list2.add("pachu");
		list2.add("Dip");
		list1.removeAll(list2);
		List<String> list3 = new ArrayList<String>();
		list3.add("Mik");
		list3.add("Rana");
		list1.retainAll(list3);
		
		// Traversing a list.
		// First way.
		for (String string : list1) {
			System.out.println(string);
		}
		// Second way.
		Iterator<String> iterator = list1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// third way.
		ListIterator<String> listIterator = list1.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println();
		System.out.println();
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println();
		System.out.println();
		
		ListIterator<String> listIterator1 = list1.listIterator(2);
		while (listIterator1.hasNext()) {
			System.out.println(listIterator1.next());
		}
	}
}
