import java.util.*;
import java.io.*;
class AA2
{
	public static void main(String args[])
	{   double num;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number to be worked upon = ");
		num=s.nextDouble();
		double numRound, numCeil , numFloor;
		int numInteger;
		numRound = Math.round(num);
		numCeil= Math.ceil(num);
		numFloor= Math.floor(num);
		numInteger= (int)num;
		System.out.println("Number after rounding it off = " + numRound);
		System.out.println("Number after performing ceil operation = " + numCeil);
		System.out.println("Number after performing floor operation = " + numFloor);
		System.out.println("Number after type casting it into int = " + numInteger);
		
		
	}
}
