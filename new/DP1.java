import java.util.*;
public class DP1
{  
    
	public static void main(String[] args) throws Exception
	{
		double acc=-9.81,iniVel=0.0,iniPos=0.0,time=0.0,finPos;
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.print("Enter initial velocity= ");
			iniVel=s.nextDouble();
			System.out.println();
			System.out.print("Enter initial position= ");
			iniPos=s.nextDouble();
			System.out.println();
			System.out.print("Enter time = ");
			time=s.nextDouble();
			System.out.println();
			finPos=0.5*acc*(Math.pow(time,2)) + iniVel*time + iniPos;
			System.out.println("The object's position after "+time+" seconds= "+finPos+" m");
			System.out.println("Enter two numbers= ");
			int a=s.nextInt();
			int b=s.nextInt();
			if(b==0)
			throw new NumberFormatException();
			System.out.println(a+"/"+b+" = "+ (a/b));
		}
		catch(InputMismatchException|NumberFormatException e)
		{
			System.out.println("Exception occured : "+e);
			
		}

	}

}
