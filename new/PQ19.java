public class PQ19
{
   public static void main(String[] args)
   {
	   try
	   {
		   NumberFormatException ex=new NumberFormatException("Exception");
		   //setting a cause of the exception
		   ex.initCause(new NullPointerException("This is actual cause of the exception"));
		   throw ex;
	   }
	   catch(NumberFormatException|ArithmeticException ex)
	   {
		   System.out.println(ex);
		   System.out.println(ex.getCause());
	   }
   }
}
