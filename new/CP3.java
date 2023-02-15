import java.util.Scanner;
class CP3
{   public static void max_min(int[] grades)
	{
		int max=grades[0],min=grades[0];
		int i;
		for(i=1;i< grades.length ; i++)
		{
			if(max<grades[i])
				max=grades[i];
			if(min>grades[i])
				min=grades[i];
		}
		
		System.out.println("Maximum grade is = " + max);
		System.out.println("Minimum grade is = " + min);
		
	}
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int numStudents,temp;
		double avg=0;
		System.out.println("Enter the number of students in the class= ");
		numStudents= s.nextInt();
		int[] grades=new int[numStudents];
		if(numStudents < 0)
			System.out.println("Invalid number...");
		else
		{
            System.out.println("Enter the grades of each student(0 t0 100)...");
            for(int i=0;i< numStudents; i++)
			{   temp=s.nextInt();
		        if(temp<0 || temp >100)
				{   i--;
					
					System.out.println("Invalid grade, enter again...");
				}
				else
				{
					grades[i]=temp;
					avg+=grades[i];
				}
				
			}				
		}
		System.out.println("Average grade = " + String.format("%.2f",(avg/numStudents)));
		max_min(grades);
	}
}
