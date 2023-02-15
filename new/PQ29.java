import java.util.*;
public class PQ29
{
   public static void main(String[] args)
	{
		String[] array= {"Hello","hello","Hi","HI","Hello"};   //duplicate elements
		System.out.println("Original array: "+Arrays.toString(array));
		Arrays.sort(array);  //mutable
        System.out.println("Array afer sorting: "+Arrays.toString(array));
        //Arrays must be sorted for binary search
        System.out.println("Finding Hello using Binary search: "+Arrays.binarySearch(array, "Hello"));
        System.out.println("Finding HELLO using Binary search: "+Arrays.binarySearch(array, "HELLO"));
     // Sort/search a List<Integer> using Collections.sort() and Collections.binarySearch()

        List<Integer> list=new ArrayList<>();
        list.add(22);
        list.add(11);
        list.add(44);
        list.add(11);  // duplicate element
        System.out.println("Original list: "+list);
        Collections.sort(list);
        System.out.println("List after using sort() method : "+list);  //[11, 11, 22, 44]
        System.out.println("Finding 22 using Binary search: "+Collections.binarySearch(list, 22));    //2
        System.out.println("Finding 35 using Binary search: "+Collections.binarySearch(list, 35));   //-4

	}

}
