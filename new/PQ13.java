import java.io.*;
import java.util.*;

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	public int compareTo(Movie m)   //used to sort movies by year
	{
		return this.year - m.year;
	}
	
	 Movie(String name, double rating, int year)  //ctr
	{
		this.name=name;
		this.year=year;
		this.rating=rating;
	}
	public double getRating()
	{
		return rating;
	}
	public int getYear()
    {
		return year;
	}
	public String getName()
	{
		return name;
	}
}

//Driver class
class PQ13
{
	public static void main(String[] args)
	{
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("Fight club",8.5,2005));
		list.add(new Movie("The Prestige",9,2003));
		list.add(new Movie("Titanic",8.7,1997));
		list.add(new Movie("Avengers",9,2021));
		Collections.sort(list);    //sort method call compareTo method of comparable interface
		System.out.println("Movies after sorting...");
		for(Movie movie:list)
		{
			System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
		}
	}
}
