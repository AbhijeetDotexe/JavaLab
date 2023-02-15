import java.io.*;
 import java.util.*;
 
 class arrayList
 {
	 public static void main(String[] args)
	 {
		 int n=5;   //size of array list;
		 ArrayList<Integer> array= new ArrayList<Integer>(n);
		 //Appending new elements
		 for(int i=1;i<=n;i++)
		 {
			 array.add(i);
		 }
		 //Printing elements
		 System.out.println(array);
		 //remove element at index 3
		 array.remove(3);
		 //Displaying the array list after deletion
		 System.out.println(array);
		 //Printing the elements one by one
		 for(int i=0;i<array.size();i++)
		 {
			 System.out.println(array.get(i)+" ");
		 }
	 }
 }

