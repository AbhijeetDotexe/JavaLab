import java.util.*;

class Book
{
	private int id;
    private String title;
    public Book(int id, String title)
    {  // constructor
        this.id = id;
        this.title = title;
     }
    @Override
    public String toString()
    {  // describe itself
       return id + ": " + title;
    }
    // Two books are equal if they have the same id
    @Override
    public boolean equals(Object o)
    {
       return o != null && o instanceof Book &&  this.id == ((Book)o).id;
    }
    // To be consistent with equals(). Two objects which are equal have the same hash code.
    @Override
    public int hashCode()
    {
       return id;
    }  
  /*We need to provide an equals() method, so that the Set implementation can test for equality and duplication. In this example,
    we choose the id as the distinguishing feature. We override equals() to return true if two books have the same id.
    We also override the hashCode() to be consistent with equals().*/
      
}

public class PQ30
{
	public static void main(String[] args)
	{
		 Book book1 = new Book(1, "Java for Beginners");
	      Book book1Dup = new Book(1, "Java for the Beginners"); // same id
	      Book book2 = new Book(2, "Java for more Beginners");
	      Book book3 = new Book(3, "more Java for more Beginners");
	      Set<Book> set1 = new HashSet<Book>();
	      set1.add(book1);
	      set1.add(book1Dup); // duplicate id, not added
	      set1.add(book1);    // added twice, not added
	      set1.add(book3);
	      set1.add(null);     // Set can contain a null
	      set1.add(null);     //no duplicate
	      set1.add(book2);
	      System.out.println(set1);
	      set1.remove(book1);
	      set1.remove(book3);
	      System.out.println(set1);
	      Set<Book> set2 = new HashSet<Book>();
	      set2.add(book3);
	      System.out.println(set2); //[3: more Java for more beginners]
	      set2.addAll(set1);        // "union" with set1
	      System.out.println(set2);
	      set2.remove(null);
	      System.out.println(set2);
	      set2.retainAll(set1);     // "intersection" with set1
	      System.out.println(set2);
	      
	      System.out.println("Demonstration of LinkedHashSet...");
	      LinkedHashSet<Book> set=new LinkedHashSet<Book>();
	      set.add(book1);
	      set.add(book1Dup); // duplicate id, not added
	      set.add(book1);    // added twice, not added
	      set.add(book3);
	      set.add(null);     // Set can contain a null
	      set.add(null);     // but no duplicate
	      set.add(book2);
	      System.out.println(set);



	}
}
