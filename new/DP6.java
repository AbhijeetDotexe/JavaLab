import java.util.*;
class InvalidProductException extends Exception
{
	InvalidProductException(String s)
	{
		super(s);
	}
}
class DP6
{
	void productCheck(int weight) throws InvalidProductException
	{
		if(weight>100)
			throw new InvalidProductException("Product Invalid...");
		else
			System.out.println("Valid product");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of product: ");
		int weight = sc.nextInt();
		DP6 pro = new DP6();
		try
		{
			pro.productCheck(weight);
		}
		catch(InvalidProductException e)
		{
			System.out.println("Exception Occurred: "+e);
		}
	}
}
