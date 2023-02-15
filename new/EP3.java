import java.util.TreeSet;
class AddressBookEntry implements Comparable<AddressBookEntry>
{
	private String name,address,phone;
	public AddressBookEntry(String name)    //ignore address and phone
	{
		this.name=name;
	}
   //override
	public String toString()
	{
		return name;
	}
	public int compareTo(AddressBookEntry other)
	{
		return this.name.compareToIgnoreCase(other.name);
	}
	public boolean equals(Object o)
	{
		return o!=null && o instanceof AddressBookEntry && this.name.equalsIgnoreCase(((AddressBookEntry)o).name);
	}
	//two objects which are equal shall have same hashcode
	//override
	public int hashCode()
	{
		return name.toLowerCase().hashCode();
	}
	
}
public class EP3 {

	public static void main(String[] args)
	{
		AddressBookEntry addr1= new AddressBookEntry("Peter");
		AddressBookEntry addr2= new AddressBookEntry("PAUL");
		AddressBookEntry addr3= new AddressBookEntry("Patrick");
		TreeSet<AddressBookEntry> set=new TreeSet<>();
		set.add(addr1);
		set.add(addr2);
		set.add(addr3);
		System.out.println(set);
		System.out.println(set.floor(addr2));   //Paul     //equal or closest least element
		System.out.println(set.lower(addr2));   //Patrick   //closest least element
		System.out.println(set.headSet(addr2));   //[Patrick]    //It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.
		System.out.println(set.tailSet(addr2));   //[Paul,Peter]   //It returns a set of elements that are greater than or equal to the specified element.
	}

}

