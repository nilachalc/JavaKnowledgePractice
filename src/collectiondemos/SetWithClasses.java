package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import testbeans.Dog;

public class SetWithClasses {

	public static void main(String[] args) {
		// Test with HashSet<Dog>
		Set<Dog> dset = new HashSet<Dog>();
		
		dset.add(new Dog(2));
		dset.add(new Dog(1));
		dset.add(new Dog(3));
		dset.add(new Dog(5));
		dset.add(new Dog(4));
		
		Iterator<Dog> iterator = dset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println();
		// Test with LinkedHashSet<Dog>
		Set<Dog> dset1 = new LinkedHashSet<Dog>();
		
		dset1.add(new Dog(2));
		dset1.add(new Dog(1));
		dset1.add(new Dog(3));
		dset1.add(new Dog(5));
		dset1.add(new Dog(4));
		
		Iterator<Dog> iterator1 = dset1.iterator();
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + " ");
		}
		
		System.out.println();
		// Test with TreeSet		
		Set<Dog> dset2 = new TreeSet<Dog>();
		
		dset2.add(new Dog(2));
		dset2.add(new Dog(1));
		dset2.add(new Dog(3));
		dset2.add(new Dog(5));
		dset2.add(new Dog(4));
		
		Iterator<Dog> iterator2 = dset2.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
		
		System.out.println();
		
		// Performance Testing
		Random r = new Random();
		HashSet<Dog> hashSet = new HashSet<Dog>();
		TreeSet<Dog> treeSet = new TreeSet<Dog>();
		LinkedHashSet<Dog> linkedSet = new LinkedHashSet<Dog>();
		// start time
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			hashSet.add(new Dog(x));
		}
		// end time
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("HashSet: " + duration);
		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			treeSet.add(new Dog(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet: " + duration);
		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			linkedSet.add(new Dog(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedHashSet: " + duration);
		
	}
}
