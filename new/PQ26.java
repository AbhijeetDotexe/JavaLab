 class test extends Thread
{
	public void run()
	{
		System.out.println("Child Thread's priority is (inherited from parent thread which is main)= " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("priority of child thread after changing it = " + Thread.currentThread().getPriority());
	}
}
public class PQ26
{
	public static void main(String [] args)
	{
		test t1= new test();
		System.out.println("Default priority of main thread is = " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("priority of main thread after changing it = " + Thread.currentThread().getPriority());
		t1.start();
	}
  
}
