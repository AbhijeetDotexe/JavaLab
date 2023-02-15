public class PQ17 {

	public static void main(String[] args) {
		try
		{
			System.out.println("First statement of try block");
			int num=45/0;
			System.out.println(num);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of bound Exception");  
		}
		finally
		{   System.out.println();
			System.out.println("Finally block");
		}
        System.out.println("Out of try catch finally block");   

      //this will not be executed because exception is not caught
      //If Arithmetic exception is caught then only rest of the code is executed.

	}

}
