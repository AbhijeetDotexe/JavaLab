import java.util.Scanner;
class BP4
{
	public static void main(String[] args)
	{
		char[][] answers= {
			{'A' , 'B' , 'C' , 'C', 'C' , 'D', 'A' , 'E'   , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'E', 'C' , 'A', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'D' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'E', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'C' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'A' , 'D' , 'C', 'C' , 'E', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'A' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'B' , 'D' , 'D', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
			{'D' , 'A' , 'A' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'},
		    {'A' , 'B' , 'D' , 'C', 'C' , 'A', 'A' , 'E' , 'A' , 'D'} };
		Scanner s= new Scanner(System.in);
		char[] key={'D' , 'B' , 'D' , 'C', 'C' , 'D', 'A' , 'E' , 'A' , 'D'};
		
		for(int i=0 ; i<answers.length; i++)
	    {		
			int correctCount=0;
			for (int j=0;j<answers[i].length; j++)
			{
				if(answers[i][j]==key[j])
				 correctCount++;
			}
			System.out.println("Student " +( i+1) + " Got "+ correctCount + " marks");
		}		
	}
}
