import java.util.Scanner;
 class duplicateFinder
 {   int arr[]= new int[15];
	 void input()
	 {   Scanner s=new Scanner(System.in);
	     System.out.println("Enter 15 elements...");
		for(int i=0;i<15; i++)
		{
			arr[i]=s.nextInt();
		}
	 }
	 	
	 void duplicate()
	 {  int num,count;
	    int [] fr = new int [arr.length];   //fr will store frequencies of elements
        int visited = -1;  
		for(int i=0;i<arr.length; i++)
		{   count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fr[j]= visited;   // to avoid counting  same element again
				}
			}
			if(fr[i]!= visited)
				fr[i]=count;
		}
		
		System.out.println("Element     Frequency");
		
		for(int i=0 ;i<fr.length;i++)
		{
			if(fr[i]!=visited)
				System.out.println("  "+ arr[i] + "          " + fr[i]);    
		}
	 }
	
	
	
 }
 
 
 class BP2
 {
	 public static void main(String args[])
	 {
		 duplicateFinder dp=new duplicateFinder();
		 dp.input();
		 dp.duplicate();
	 }
 }
