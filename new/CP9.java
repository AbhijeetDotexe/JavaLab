
import Relate.Relatable;

class Cp9 implements Relatable
{
	public int length=0;
	public int breadth=0;

	public Cp9(int l,int b)
	{
	    length= l;
		breadth=b;
	}
	
	
	public int getArea()
	{
		return length*breadth;
	}
	public int isLargerThan(Relatable other)
	{
		Cp9 otherRect= (Cp9)other;
		if(this.getArea() < otherRect.getArea())
			return -1;
		else if(this.getArea() > otherRect.getArea())
			return 1;
		else return 0;
	}

	public static void main(String[] args)
	{
		Cp9 r1=new Cp9(8,10);
		Cp9 r2=new Cp9(3,9);
		Cp9 r3=new Cp9(6,9);
		r1.getArea();
		r2.getArea();
		r3.getArea();
		if(r1.isLargerThan(r2)==1)
		{
			System.out.println("Rectangle 1 is greater than rectangle 2");
		}
		else
			System.out.println("Rectangle 1 is not greater than rectangle 2");
		if(r2.isLargerThan(r3)==1)
		{
			System.out.println("Rectangle 2 is greater than rectangle 3");
		}
		else
			System.out.println("Rectangle 2  is not greater than rectangle 3");
	}
}
