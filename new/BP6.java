import java.util.Arrays;
class sort
{
	void sort(String[] cities)
	{
		for (int i=0;i< cities.length; i++)
		{
			for (int j=i+1;j<cities.length ; j++)
			{
				if(cities[i].compareTo(cities[j])>0)
				{
					String temp=cities[i];
					cities[i]=cities[j];
					cities[j]=temp;
				}
			}
		}
		
System.out.println("Sorted array of citites is...");
		System.out.println(Arrays.toString(cities));
	}
}

class BP6
{
	public static void main(String args[])
	{
		String[] cities=new String[6];
		for(int i=0;i<6;i++)
			cities[i]=args[i];
		sort s=new sort();
		s.sort(cities);	
	}
}
