package threadsdemo;

//Example that shows multiple threads 
//can execute the same method but in 
//synchronized way. 
class LineNew
{ 

	// if multiple threads(trains) trying to access 
	// this synchronized method on the same Object 
	// but only one thread will be able 
	// to execute it at a time. 
	synchronized public void getLine() 
	{ 
		for (int i = 0; i < 3; i++) 
		{ 
			System.out.println(i); 
			try
			{ 
				Thread.sleep(400); 
			} 
			catch (Exception e) 
			{ 
				System.out.println(e); 
			} 
		} 
	} 
} 

class TrainNew extends Thread 
{ 
	// Reference variable of type Line. 
	LineNew lineNew; 

	TrainNew(LineNew lineNew) 
	{ 
		this.lineNew = lineNew; 
	} 

	@Override
	public void run() 
	{ 
		lineNew.getLine(); 
	} 
} 

public class ExecutionWithSynchonizedMethod 
{ 
	public static void main(String[] args) 
	{ 
		LineNew obj = new LineNew(); 

		// we are creating two threads which share 
		// same Object. 
		TrainNew train1 = new TrainNew(obj); 
		TrainNew train2 = new TrainNew(obj); 

		// both threads start executing . 
		train1.start(); 
		train2.start(); 
	} 
} 
