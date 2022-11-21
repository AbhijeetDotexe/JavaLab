import java.util.*;
import java.io.*;
class AP2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		reciprocalSum(n);
	}

	static void reciprocalSum(int n){
		float sum=0;
		for(int i=1;i<=n;i++){
			sum+=(1/(float)i);
			if(i!=n){
				System.out.print("1/"+i+" + ");
			}else if(i==n){
				System.out.print("1/"+i+" = ");
			}
		}
		System.out.println(sum);
	}
}


