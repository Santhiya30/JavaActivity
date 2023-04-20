class Test extends Thread{
	int noOfThreads = 5;  
	public void run()  
	{  
		for(int i = 0; i < noOfThreads; ++i)  
			System.out.println("i = " + noOfThreads);
		System.out.println("Thread Completed");
	} 
     
}
public class Volatile{
	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		System.out.println("Thread Started");
	}
}