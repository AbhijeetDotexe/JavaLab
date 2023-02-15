import java.util.Scanner;

class PQ9
{   String toString(double d)
	{
		String s= Double.toString(d);
		return s;
	}
	
	void count(String s)
	{
		int dot=s.indexOf('.');
		System.out.println("Number of Digits before decimal= "+ dot);
		System.out.println("Number of Digits after decimal= " + (s.length()-1-dot));
	}
	public static void main(String[] args)
	{   Scanner s= new Scanner(System.in);
	    PQ9 obj=new PQ9();
		double d;
		System.out.print("Enter a decimal number =  ");
		d=s.nextDouble();
		String str= obj.toString(d);
		obj.count(str);
	}
}
