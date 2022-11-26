import java.util.*;
import java.io.*;
class AP7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		String s = sc.nextLine();
		System.out.print("Original Sentence: ");
		System.out.println(s);
		String rev = reverseSentence(s);
		System.out.print("Reverse Sentence: ");
		System.out.println(rev);
	}
	public static String reverseSentence(String str){  
   	 	String[] words=str.split("\\s");  
    	 	String reverseWord="";  
    	 	for(String w:words){  
        	    StringBuilder sb=new StringBuilder(w);  
        	    sb.reverse();  
        	    reverseWord+=sb.toString()+" ";  
    		}  
    		return reverseWord.trim();  
	}  
}