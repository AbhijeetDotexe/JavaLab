import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class PQ28
{
	public static void main(String[] args)
	{
		List<String> coffeeList = new ArrayList<>();
	    coffeeList.add("espresso");
	    coffeeList.add("latte");
        coffeeList.add("cappuccino");
        System.out.println("Printing the list...");
        System.out.println(coffeeList);
        
        System.out.println("Traversing using Iterator...");
        Iterator<String> itr= coffeeList.iterator();
        while(itr.hasNext())
        {
        	String str=itr.next();
        	System.out.println(str);
        }
        System.out.println("Traversing using for-each...");
        for(String str:coffeeList)
        {
        	System.out.println(str.toUpperCase());
        }
        System.out.println("Traversing using for loop...");
        for(int i=0;i<coffeeList.size();i++)
        {
        	System.out.println(coffeeList.get(i).substring(0,3));
        }
        

	}

}
