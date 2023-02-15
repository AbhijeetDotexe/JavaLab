class PQ11
{
	public static void main(String[]  args)
	{   long startTime= System.currentTimeMillis();
		String str= "Was it a car or a cat I saw";
		int len= str.length();
		char[] charArray= new char[len];
		
		
		for(int i=0; i< len ; i++)
			charArray[i]= str.charAt(len-1-i);
	     String reverse= new String(charArray);
		System.out.println("Reversed palindrome string  using String class:- "+ reverse);
		System.out.println("Time taken to reverse the string using String class is = "+ (System.currentTimeMillis()-startTime) + " ms");
		
		startTime= System.currentTimeMillis();
		StringBuilder str1= new StringBuilder(str);
		str1.reverse();
		
		System.out.println("Reversed palindrome string using StringBuilder class :- " + str1);
		System.out.println("Time taken to reverse the string using StringBuilder class is = "+ (System.currentTimeMillis()-startTime) + " ms");	
	}
}
	
