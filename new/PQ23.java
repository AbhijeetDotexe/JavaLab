class ThreadId extends Thread
{
	public void run()
	{   
		 System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
}
public class PQ23
{
   public static void main(String[] args)
   {
	   int n=8; //number of threads
	   for(int i=0;i<8;i++)
	   {
		   ThreadId object = new ThreadId();
		   object.start();
	   }
   }
}
