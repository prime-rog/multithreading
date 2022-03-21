package multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		thread1 aman = new thread1();
		thread2 sparshi = new thread2();
		Thread sparshi1 = new Thread(sparshi);
		 aman.start();
		 
		 aman.wait();
		 sparshi1.start();
		 
		 
		 
	}

}
