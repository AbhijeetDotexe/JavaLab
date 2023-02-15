import java.util.Scanner;
class MyException extends Exception
{
	public String toString()
	{
		return ("Invalid number");
	}
}
public class DP2
{

	public static void main(String[] args)
	{   
		int ch,flag=0;
		String a,b,str="";
		Scanner s=new Scanner(System.in);
		      System.out.println("Enter 2 numbers to be operated= ");
		      try
		      {
		        a=s.nextLine();  
		        b=s.nextLine();
		        str=str+a+b;
		        for(int i=0;i<str.length();i++)
		         {
		    	      if(Character.isDigit(str.charAt(i)) == false)
		    			  flag=1;
		         }
		       if(flag==1)
		    	  throw new MyException();
		       else
		       {
		    	  
		        int a1=Integer.parseInt(a);
		        int b1=Integer.parseInt(b);
		        System.out.println("1.Add.");
		  		System.out.println("2.subtract");
		  		System.out.println("3. Multiply.");
		  		System.out.println("4. Divide.");
		  		System.out.println("Enter your choice(1-4)= ");
		  		ch=s.nextInt();
		  		switch(ch)
		  		{
		  		   case 1: System.out.println("Answer = " + (a1+b1));
		  		           break;
		  		   case 2: System.out.println("Answer = " + (a1-b1));
		  		           break;
		  		   case 3: System.out.println("Answer = " + (a1*b1));
  		                   break;    
		  		   case 4: System.out.println("Answer = " + ((double)a1/(double)b1));
  		                   break;    
  		           default : System.out.println("Wrong choice");
		  		}         
		      }
		  }
		 catch(MyException e)
		 {
			 System.out.println(e);
		 }
		 catch(ArithmeticException e)
		 {
			System.out.println("Can't divide by 0...");
			System.out.println(e);
		 }
		 finally
		 {
			 System.out.println("Program terminated...");
		 }     
  }		

}

