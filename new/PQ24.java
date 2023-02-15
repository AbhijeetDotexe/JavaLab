class PQ24 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - " + i);
		}
	}
	public static void main(String[] args)
	{
		PQ24 t= new PQ24();
		t.start();
		for(int i=1;i<=5;i++)
		{
			Thread.yield();      //depends upon thread scheduler to accept the hint
			System.out.println("Main Thread : " +i);
		}
			
	}
}
