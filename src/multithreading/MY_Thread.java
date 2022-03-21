package multithreading;

public class MY_Thread {
	
	public static void main (String arg []) {
	
	myThread sparshi = new myThread();
	// will give 1 as only main thread is active
	System.out.println(Thread.activeCount());
	// we have to make thread start to work
	sparshi.start();
	// wil give ans 2 as main and built thread is running
	//
	System.out.println(Thread.activeCount());
	// to get the name of running thread
	System.out.println(sparshi.getName());//obj..getName(
	// wil give main as ans 
	System.out.println(Thread.currentThread().getName());
	// to over write the name of thread
	sparshi.setName("Aman");
	System.out.println(sparshi.getName());
	
	
	// to get priority 
	
	System.out.println(sparshi.getPriority());
	
	// the thread will inherit the priority from the thread it was created in 
	// this case it is main thread having priority of 5.
	
	// there are two type of thread 
	// 1 is daemon thread low level work like garbage collectoe
	// 2 is user thread
	
	System.out.println(sparshi.isDaemon());
	sparshi.setDaemon(true);
	System.out.println(sparshi.isDaemon());
	for ( int i =0 ; i < 110; i++)
	System.out.println("anan");
	
	
	}

}
