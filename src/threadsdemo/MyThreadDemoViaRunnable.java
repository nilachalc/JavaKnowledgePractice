package threadsdemo;

public class MyThreadDemoViaRunnable implements Runnable{
	
	private Integer number;
	
	public MyThreadDemoViaRunnable(Integer num) {
		number = num;
	}
	
	public void run() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "From Thread :" + " " + number;
	}
	
	public static void main(String[] args) {
		System.out.println("From Main Thread.");
		MyThreadDemoViaRunnable threadObj1 = new MyThreadDemoViaRunnable(1);
		MyThreadDemoViaRunnable threadObj2 = new MyThreadDemoViaRunnable(2);
		MyThreadDemoViaRunnable threadObj3 = new MyThreadDemoViaRunnable(3);
		MyThreadDemoViaRunnable threadObj4 = new MyThreadDemoViaRunnable(4);
		MyThreadDemoViaRunnable threadObj5 = new MyThreadDemoViaRunnable(5);
		MyThreadDemoViaRunnable threadObj6 = new MyThreadDemoViaRunnable(6);
		MyThreadDemoViaRunnable threadObj7 = new MyThreadDemoViaRunnable(7);
		MyThreadDemoViaRunnable threadObj8 = new MyThreadDemoViaRunnable(8);
		MyThreadDemoViaRunnable threadObj9 = new MyThreadDemoViaRunnable(9);
		MyThreadDemoViaRunnable threadObj10 = new MyThreadDemoViaRunnable(10);
		Thread thread1 = new Thread(threadObj1);
		Thread thread2 = new Thread(threadObj2);
		Thread thread3 = new Thread(threadObj3);
		Thread thread4 = new Thread(threadObj4);
		Thread thread5 = new Thread(threadObj5);
		Thread thread6 = new Thread(threadObj6);
		Thread thread7 = new Thread(threadObj7);
		Thread thread8 = new Thread(threadObj8);
		Thread thread9 = new Thread(threadObj9);
		Thread thread10 = new Thread(threadObj10);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
	}
}
