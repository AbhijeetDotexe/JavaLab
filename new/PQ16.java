public class PQ16
{
	public static void main(String[] args)
	{
		try {   String[] str= {"Abhijeet","Mudit"};
				int i=str.length;
				String myString[]=new String[] {"Abhijeet "};  //#1 exception
				if(myString[0].equals("java"))
				 System.out.println("First word is java....");
				System.out.println("Number of words= "+ i);
				int x=12/i;                      //#2 eception
				int y[]= {555,999};
				y[i]=x;                          //#3 exception
			}
		catch(ArithmeticException e)
		    {
				System.out.println("Div by 0 : "+e);  //#2
		    }
		catch(NullPointerException e)
		{
			System.out.println("A null pointer exception : "+e);   //#1
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of bounds : "+e);  //#3
		}
	}
}
