import java.lang.*;
import java.util.*;
class electronics
{
	static class television
	{
		static television objref;
		int priceTv;
		television(int price)
		{
			priceTv= price;
		}
		television(television obj)
		{
			objref = obj;
        }
		public void cost()
		{
			System.out.println("Cost of Tv = " + priceTv);
		}
		public static void cost2()
		{
			System.out.println("Cost of TV using static method= " + objref.priceTv);
		}
	}
}
class CP4
{
	public static void main(String[] args)
	{
		electronics.television etobj= new electronics.television(2209);
		etobj.cost();
		electronics.television etobj2= new electronics.television(etobj);
		etobj2.cost();
		electronics.television.cost2();
		
	}
}
