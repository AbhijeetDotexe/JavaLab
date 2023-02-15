import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class PQ31
{
	public static void main(String[] args)
	{
		Map<String,Double> map=new HashMap<>();
		map.put("espresso", 1.1);
		map.put("latte", 2.2);
	    map.put("cappuccino", 3.3);
	    System.out.println(map);
	 // Using .entrySet() which returns a Set<Map.Entry> to iterate through the map
	    System.out.println("Traversing using  .entrySet()...");
        for(Map.Entry<String,Double> e : map.entrySet())
        {
        	e.setValue(e.getValue() + 10.0);   //modify value
        	System.out.println(e.getKey() + ":" + e.getValue());
        }
        
     // Using for-each loop on .keySet() which returns a Set to iterate
        //through the map .keySet() returns a Set of keys
        System.out.println("Keys= "+map.keySet());
        System.out.println("Traversing using  keySet() and for each loop...");
        
        for(String key:map.keySet())
        {
        	 System.out.println(key + "=" + map.get(key));   
        }
        // Using Iterator on .keySet() to iterate through the map
        System.out.println("Traversing using  keySet() and iterator()...");
       Iterator<String> itr=map.keySet().iterator();
       while (itr.hasNext())
       {
           String key = itr.next();
           System.out.println(key + ":" + map.get(key));     
        }
    // .values() returns a Collection of values
       System.out.println("Values= "+map.values());
        
	}

}
