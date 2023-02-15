import java.util.Scanner;
class MyException extends Exception
{
	public String toString()
	{
		return ("Candidate is not eligible for the registration...");
	}
}
public class DP3
{
    int age;
    float marks;
	public static void main(String[] args)
	{   
		DP3 stu=new DP3();
		Scanner s=new Scanner(System.in);
		try
		{
          System.out.println("Enter the age of the student= ");
          stu.age=s.nextInt();
          System.out.println("Enter the marks of the student = ");
          stu.marks=s.nextFloat();
          if(stu.age<12 || stu.marks < 200)
        	  throw new MyException();
          else
        	  System.out.println("Candidate is eligible for the registration...");
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}

}
