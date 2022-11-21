import java.util.*;
import java.io.*;
class AP1{
	public static void main(String[] args){
		System.out.println("Sum: "+adder(args));
	}

	static int adder(String[] arr){
		return Integer.parseInt(arr[0])+Integer.parseInt(arr[1])+Integer.parseInt(arr[2])+Integer.parseInt(arr[3])+Integer.parseInt(arr[4]);
	}
}
