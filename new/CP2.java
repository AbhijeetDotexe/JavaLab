import java.util.Scanner;
class CP2
{
	public static void main(String[] args)
	{
		String str;
		int j=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be checked= ");
		str=s.nextLine();
		
		char []temp= new char[str.length()];
		for(int i=str.length()-1; i>=0;i--)
		{  
		       temp[j]= str.charAt(i);
			   j++;
			
			
		}
		String str2= new String(temp);
		System.out.println("Reverse string= " + str2);
		if(str2.equalsIgnoreCase(str))
		{
			System.out.println(str + " is palindrome");
		}
		else
			System.out.println(str + " is not palindrome");
		
	}
}
