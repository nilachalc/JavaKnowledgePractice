package functionalprogramming;

import java.util.stream.IntStream;

public class FunctionalProgrammingThread {// implements Runnable{
	
	/*@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Thread id: " + Thread.currentThread().getId() + " i = " + i);
		}
	}*/

	public static void main(String[] args) {
		/*Runnable functionalProgrammingThread = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println("Thread id: " + Thread.currentThread().getId() + " i = " + i);
				}
			}
		};*/
		Runnable functionalProgrammingThread = () -> {
			IntStream.rangeClosed(0, 10000).forEach(i -> System.out.println("Thread id: " + Thread.currentThread().getId() + " i = " + i));
		};
		
		Thread th1 = new Thread(functionalProgrammingThread);
		Thread th2 = new Thread(functionalProgrammingThread);
		
		th1.start();
		th2.start();
	}
}
