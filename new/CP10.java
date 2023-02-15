 interface GeoAnalyzer
 {
	 final static float pi=3.142f;
	 float area();
	 float perimeter();
	 void display(float a,float p);
 }

class circle implements GeoAnalyzer
{
	float radius;
	circle(float r)
	{
		radius=r;
	}
	public float area()
	{
		return (pi*radius*radius);
	}
	public float perimeter()
	{
		return (2*pi*radius);
	}
	public void display(float a,float p)
	{
		System.out.println("Area of circle is= "+ a);
		System.out.println("Perimeter of circle is= "+ p);
	}
}

class ellipse implements GeoAnalyzer
{
	float major;
	float minor;
	ellipse(float m,float n)
	{
		major=m;
		minor=n;
	}
	public  float area()
	{
		return (pi*major*minor);
	}
	public float perimeter()
	{
		return (pi*(major+minor));
	}
	public void display(float a,float p)
	{
		System.out.println("Area of ellipse is= "+ a);
		System.out.println("Perimeter of elipse is= "+ p);
	}
}
class rectangle implements GeoAnalyzer
{
	float length;
	float width;
	rectangle(float l,float w)
	{
		length=l;
	    width=w;
	}
	public  float area()
	{
		return (length*width);
	}
	public float perimeter()
	{
		return (2*(length+width));
	}
	public void display(float a,float p)
	{
		System.out.println("Area of rectangle is= "+ a);
		System.out.println("Perimeter of rectangle is= "+ p);
	}
}

class CP10
{
	public static void main(String[] args)
	{
		circle c=new circle(5.2f);
		ellipse e=new ellipse(4.5f,3.6f);
		rectangle r=  new rectangle(3.5f,4.4f);
		GeoAnalyzer geoItem;
		geoItem=c;
		geoItem.display(geoItem.area(),geoItem.perimeter());
		geoItem=e;
		geoItem.display(geoItem.area(),geoItem.perimeter());
		geoItem=r;
		geoItem.display(geoItem.area(),geoItem.perimeter());
	}
}
