import java.io.*;
import java.util.*;

public class fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = factorialNumber(n);
		System.out.println(ans);
				
	
	}

	static int factorialNumber(int n){
		if (n==0) {
			return 1;
		}
		return n*factorialNumber(n-1);
	}
}