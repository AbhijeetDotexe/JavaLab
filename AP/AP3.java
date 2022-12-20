import java.util.*;
import java.io.*;
class AP3{
	public static void main(String[] args){
		int a=2;
		double b=3.14;
		float f=5.5f;
		byte x=(byte)a;
		int y=(int)b;
		byte z=(byte)b;
		char c=(char)a;
		short s=(short)f;
		System.out.println("Conversion of int to byte: "+x);
		System.out.println("Conversion of double to int: "+y);
		System.out.println("Conversion of double to byte: "+z);
		System.out.println("Conversion of int to char: "+c);
		System.out.println("conversion of float to short: "+s);
	}
}

