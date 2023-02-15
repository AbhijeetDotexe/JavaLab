import java.util.*;
import java.io.*;
class Student implements Comparable<Student>
{
	private int rollNo;
	private String name;
	private double marks;
	public int compareTo(Student stu)
	{
		return this.rollNo-stu.rollNo;
	}
	Student(int rollNo,String name,double marks)
	{
		this.rollNo = rollNo;
		this.name=name;
		this.marks=marks;
	}
	int getRollNo()
	{ return rollNo;}
	String getName()
	{ return name;}
	double getMarks()
	{ return marks;}
}
class nameCompare implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}	
class CP8
{
	public static void main(String[] args)
	{
		ArrayList<Student> list= new ArrayList<Student>();
		list.add(new Student(1,"Tom",450));
		list.add(new Student(3,"Mike",500));
		list.add(new Student (4,"Sam",451));
		list.add(new Student (2,"Jim",525));
		list.add(new Student (5,"Jenny",459));
		System.out.println("Sorted by Roll No...");
		Collections.sort(list);
		for(Student stu:list)
		{
			System.out.println(stu.getRollNo()+" "+stu.getName()+" "+stu.getMarks());
		}
		System.out.println("Sorted by name...");
		nameCompare nc=new nameCompare();
		Collections.sort(list,nc);
		for(Student stu:list)
		{
			System.out.println(stu.getRollNo()+" "+stu.getName()+" "+stu.getMarks());
		}
		
	}
}
