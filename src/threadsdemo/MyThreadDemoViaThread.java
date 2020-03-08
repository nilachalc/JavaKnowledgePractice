package threadsdemo;

public class MyThreadDemoViaThread extends Thread{

	public void run() {
		System.out.println("From other Thread.");
	}
	
	public static void main(String[] args) {
		System.out.println("From Main Thread.");
		Thread threadDemo1 = new MyThreadDemoViaThread();
		Thread threadDemo2 = new MyThreadDemoViaThread();
		Thread threadDemo3 = new MyThreadDemoViaThread();
		Thread threadDemo4 = new MyThreadDemoViaThread();
		Thread threadDemo5 = new MyThreadDemoViaThread();
		
		threadDemo1.start();
		threadDemo2.start();
		threadDemo3.start();
		threadDemo4.start();
		threadDemo5.start();
	}
}
