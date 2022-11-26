import java.util.*;
import java.io.*;


class AP4{
	public static void main(String[] args) {
		String text = "To be or not to be, that is the question;"
				+"Whether this nobler in the mind to suffer"
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"		
				+" and by opposing end them?";

		text=text.toLowerCase();
		int spaces=0, vowels=0, letters=0, digit=0, splchar=0;
		
		for(int i=0;i<text.length();i++) {
		       if(text.charAt(i)=='a'||text.charAt(i)=='i'||text.charAt(i)=='e'||text.charAt(i)=='o'||text.charAt(i)=='u'){
			    	vowels++;
		        }
		       else if((text.charAt(i)>='a'&& text.charAt(i)<='z')){
			   		letters++;
				}
		        else if(text.charAt(i)==' ') {
			   		spaces++;
		        }
		       else if(text.charAt(i)>='0'&&text.charAt(i)<='9') {
		    	   digit++;
		       }
		       else{
		    	   splchar++;
		       }
		}
		System.out.println("The text contains : ");
		System.out.println("vowels="+vowels);
		System.out.println("blank space="+spaces);
		System.out.println("latter="+letters);
		System.out.println("digit="+digit);
		System.out.println("special characters="+splchar);

	}

}