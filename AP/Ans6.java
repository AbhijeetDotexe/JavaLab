import java.io.*;
import java.io.*;
class Ans6 {

	public static void main(String[] args) {
		Box obj1=new Box();
		Box obj2=new Box();
		
		System.out.println("volume of box 1="+obj1.Volume(2,3,5));
		System.out.println("volume of box 2="+obj2.Volume(3,4,5));

	}

}

class Box{
	double len,br,wd;
	double Volume(int l,int b,int w) {
		len=l;
		br=b;
		wd=w;
		return len*br*wd;
		
	}
} 
