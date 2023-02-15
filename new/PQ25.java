class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println (" First thread starts running" );
			sleep(10000);
			System.out.println (" First thread finishes running" );
		}
		catch(Exception e){	}

	}
}
class Thread2 extends Thread
{
	public void run( )
	{
		try
		{
		   System.out.println ( "Second thread starts running");
	       System.out.println ( "Second thread is suspended itself ");
		   suspend( );
		   System.out.println (" Second  thread runs again" );	
		}
		catch(Exception e){	}
	}
}

public class PQ25
{
    public static void main(String[] args)
    {
    	try
    	{
    		Thread1 first = new Thread1();
    		Thread2 second = new Thread2();
    		first.start();
    		second.start();
    		System.out.println("Revive the second thread...");
    		second.resume();
    		System.out.println("Second thread went for 5 secs...");
    		second.sleep(5000);
    		System.out.println("Wake up 2nd thread and finishes running...");
    		System.out.println("Demonstration is finished");
    	}
    	catch(Exception e)
    	{}
    }
}
