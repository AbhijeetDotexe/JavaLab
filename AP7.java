import java.util.*;
import java.io.*;
class AP7{
	public static void main(String[] args){
		System.out.print("Original Sentence: ");
		String s = "This is a reverse Sentence in Java";
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