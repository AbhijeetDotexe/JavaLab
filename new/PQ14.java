import java.util.*;
import java.io.*;

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
        public int compareTo(Movie m)
	{
		return this.year - m.year;
	}
	public Movie(String nm, double rt, int yr)
	{   
	    this.name = nm;
		this.rating = rt;
		this.year = yr;
	}
          public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
}
//comparing movies by their rating
class ratingCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		if(m1.getRating() < m2.getRating())
		{
			return -1;
		}
		if(m1.getRating() > m2.getRating())
			return 1;
		else return 0;
		
	}
}
//comparing the movies by their names
class nameCompare implements Comparator<Movie>
{
	public int compare(Movie m1,Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}
class PQ14
{
	public static void main(String[] args)
	{
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("Fight club",8.5,2005));
		list.add(new Movie("Shutter Island",9,2003));
		list.add(new Movie("scream",8.7,1997));
		list.add(new Movie("Joker",9,2021));
		System.out.println("Sorted by rating...");
		ratingCompare rc=new ratingCompare();
		Collections.sort(list,rc);
		for(Movie movie:list)
			System.out.println(movie.getRating() + " " + movie.getName() + " " +movie.getYear());
        System.out.println("\nSorted by name");
        nameCompare nameCompare = new nameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie: list)
           System.out.println(movie.getName() + " " + movie.getRating() + " " +movie.getYear());
         //sorted by year using comparable
		 System.out.println("\nSorted by year");
         Collections.sort(list);
         for (Movie movie: list)
            System.out.println(movie.getYear() + " " +movie.getRating() + " " +movie.getName()+" ");	
	}

}
