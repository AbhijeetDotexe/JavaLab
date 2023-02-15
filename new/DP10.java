import java.util.*;
class Numbers
{
	public int result[] =new int[10];
	void displayListOfNos()
	{
		System.out.print("Numbers stored in the array : ");
		for(int idx=0;idx<10;idx++)
		{
		    System.out.print(result[idx]+" ");
		}
		System.out.println();
	}
	void fillTheArray(int aUpperLimit,int aArraySize)
	{
		if(aUpperLimit<=0)
		{
			throw new IllegalArgumentException("upper limit must be positive: "+aUpperLimit);
		}
		if(aArraySize<=0)
		{
			throw new IllegalArgumentException("Array size must be greater than zero. ");
		}
		Random generator = new Random();
		for(int idx=0;idx<aArraySize;idx++)
		{
			result[idx]=generator.nextInt(aUpperLimit);
		}
		displayListOfNos();
	}
	synchronized void sortAscending()
	{
		 System.out.println("After sorting in ascening order...");
		int temp;
		for (int i = 0; i < result.length; i++)
		{     
	        for (int j = i+1; j < result.length; j++)
	        {     
	           if(result[i] > result[j])
	           {    
	               temp = result[i];    
	               result[i] = result[j];    
	               result[j] = temp; 	
	          }
	        }
		}
		displayListOfNos();
	}		
	synchronized void sortDescending()
	{
		System.out.println("After sorting in descening order...");
		int temp;
		for (int i = 0; i < result.length; i++)
		{     
	        for (int j = i+1; j < result.length; j++)
	        {     
	           if(result[i] < result[j])
	           {    
	               temp = result[i];    
	               result[i] = result[j];    
	               result[j] = temp; 	
	          }
	        }
		}
		displayListOfNos();
	}
 	
	
}

class ArrangementAscending implements Runnable
{
	Numbers n1;
	ArrangementAscending(Numbers n)
	{
		n1=n;
		new Thread(this).start();
	}
	public void run()
	{
		n1.sortAscending();
	}
	
}
class ArrangementDescending implements Runnable
{
	Numbers n2;
	ArrangementDescending(Numbers n)
	{
		n2=n;
		new Thread(this).start();
	}
	public void run()
	{
		n2.sortDescending();
	}
	
}
public class DP10 {

	public static void main(String[] args)
	{
		Numbers n=new Numbers();
		n.fillTheArray(20,10);
		ArrangementAscending a1=new ArrangementAscending(n);
		Thread t1=new Thread(a1);
		ArrangementDescending a2=new ArrangementDescending(n);
		Thread t2=new Thread(a2);
	}

}
