class BP8
{
	public static void main(String[] args)
	{
		String str= new String("This is just for testing purpose, I hope this is working");
		String str1= new String("This is just for testing purpose, I hope this is working");
		System.out.println("Length of the string entered = "+str.length());
		System.out.println("Check wheather nice to meet is contained or not :- " + str.contains("nice to meet"));
		System.out.println("Check wheather string is equal to another string or not using equals() :- " + str.equals(str1));
		System.out.println("Check wheather string is equal to another string or not using == operator :- " + (str==str1)+" because string re created in non pool");
		System.out.println("Index of character o :- "+ str.indexOf('o'));
   
        String[] arr= str.split(" ");
		System.out.println("Array after splitting the string...");
		for (int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("String in uppercase :- "+ str.toUpperCase());
	}
}
