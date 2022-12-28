import java.util.*;
import java.io.*;
class AP5{
	public static void main(String[] args){
		System.out.print("Enter a Three digit Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = (int) (Math.log10(n)+ 1); //calculating the lengthe of the number entered by the user
		if (len==3) {
			System.out.println("All possible combination for the given Number are: ");
			numberGenerator(n);
		}else{
			System.out.println("You did not enter a three digit number !");
		}
	}
	public static void numberGenerator(int n){
		char[] c = String.valueOf(n).toCharArray();
		for (int i=0;i<3 ;i++ ) {
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					if (i!=j && j!=k && k!=i) {
						System.out.println(c[i]+""+c[j]+""+c[k]);
					}
				}
			}
		}
	}
}
