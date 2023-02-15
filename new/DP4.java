import java.util.Scanner;
class InputMismatchException
{
	int except() throws Exception
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10 = ");
		int num=s.nextInt();
		return num;
	}
}
public class DP4
{
	public static void main(String[] args)
	{
		try
		{
			InputMismatchException ex=new InputMismatchException();
			System.out.println("Number : "+ex.except());
		}
		catch(Exception e)
		{
			e.printStackTrace();    //gives the description of the error
			System.out.println("Exception occured : "+e);
		}
	}
}
