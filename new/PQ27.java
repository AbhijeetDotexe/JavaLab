class test extends Thread
{
	public void run()
	{
		try
		{  
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child Thread : "+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
public class PQ27
{
	public static void main(String[] args) throws InterruptedException
	{  
		test t=new test();
		t.start();
		 t.join();
		try
		{  
			for(int i=1;i<=5;i++)
			{
				System.out.println("main Thread : "+ i);
				Thread.sleep(1000);
			    			}
		}
		catch(InterruptedException e)
		{
			
		}
	}

}
