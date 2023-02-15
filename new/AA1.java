import java.util.Scanner;
class AA1
{
	public static void main(String args[])
	{
		double g = 9.8 ;
		double t;
		double  x , xi , vi;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the initial velocity(m/s)= ");
		vi= s.nextDouble();
		System.out.println();
		System.out.print("Enter the initial position(m)= ");
		xi= s.nextDouble();
		System.out.println();
		System.out.print("Enter the time taken = ");;
		t= s.nextDouble();
		System.out.println();
		x=vi*t + 0.5*g*t*t + xi;
		
		System.out.println("The Final Position of the object after "+ t +"secs is = "+x);
		
		
	}
}
