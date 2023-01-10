import java.util.*;
import java.io.*;

class Interest{
	public static void simpleInterest(double p, double r, double t){
		double s = (p*r*t)/100;
		System.out.println("Simple Interest is : "+s);
	}
	public static void compoundInterest(double p, double r, double t){
		double c =  p * (Math.pow((1 + r/ 100), t)) - p;
		System.out.println("Compound Intererst is : "+c);
	}

	public static void finalValue(double p, double r, double t){
		double v = p*(Math.pow((1+r),t));
		System.out.println("final value of the investment is : "+v);
	}
}
class AP9{
	public static void main(String[] args) {
		Interest i = new Interest();
		double p = Integer.parseInt(args[0]);
		double r = Integer.parseInt(args[1]);
		double t = Integer.parseInt(args[2]);
		i.simpleInterest(p,r,t);
		i.compoundInterest(p,r,t);
		i.finalValue(p,r,t);			
	}
}

