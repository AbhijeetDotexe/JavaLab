public class PQ20
{
    static void divide()
    {
    	int x,y,z;
    	try
    	{
    		x=6;
    		y=0;
    		z=x/y;
    		System.out.println(x+"/"+y+" = " +z);
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Exception caught in divide() method");
    		System.out.println("Can not divide by zero in integer division");
    		throw e;    //re-throws an exception
    	   
    	}
    }
	public static void main(String[] args)
	{
		System.out.println("Start of main()");
		try
		{
			divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Rethrown exception caught in main()");
			System.out.println(e);
		}
	}

}
