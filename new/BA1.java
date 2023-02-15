
import java.util.*;
import java.io.*;
class BA1
{
	public static void main(String[] args)
	{   int ch,push=0,pop=0,temp;
	   Stack<Integer> stack = new Stack<Integer>();
	   System.out.print("How many plates you want to push initially= ");
	   Scanner s= new Scanner(System.in);
	   int pushInit= s.nextInt();
	   System.out.println();
	   temp=pushInit;
	   for (int i=1 ; i <= pushInit ; i++)
	   {
		  stack.push(i);
          		  
	   }
	   
	   System.out.println("Do you want to use  plates? ");
	   System.out.println("Press 1 for yes and any othear number to proceed...");
	   ch=s.nextInt();
	  
	   if(ch==1)
	   {  do
		   {   
		      stack.pop();
			  pop++;
			  System.out.println("Do you want to use more plates? ");
			  System.out.println("Press 1 for yes and any other number for no...");
			  ch=s.nextInt();
		   }while(ch==1) ;
	   }
	   
 
	     System.out.println("Do you want to enter more plates on the stack?");
		   System.out.println("Press 1 for yes and any other number for no...");
		   ch=s.nextInt();
		   if(ch==1)
		   {
	         do
		     {   
		      stack.push(pushInit+1);
			  pushInit+=1;
			  push++;
			  System.out.println("Do you want to add more plates on stack? ");
			  System.out.println("Press 1 for yes and any other number for no...");
			  ch=s.nextInt();
		     }while(ch==1) ;
			
		   }
		   
	   
	   System.out.println("Total number of plates initially inserted= " + temp);
	   System.out.println("Total number of plates used= "+ pop);
	   System.out.println("Total number of plates added overall = "+ (temp+push));
	   System.out.println("Total number of plates left in the stack= " + ((temp+push)- pop));
		
		
	}
}
