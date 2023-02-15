import java.io.*;
import java.net.InetAddress;
public class FP1 
{
	public static void main(String[] args) throws Exception
	{
		// a variable of type InetAddress to store the address of the local host
		InetAddress address = InetAddress.getLocalHost();
		//return the IP address string in textual presentation
		System.out.println("Local Host Address: "+address.getHostAddress());
		//get the host name for IP address
		System.out.println("Local host name: "+ address.getHostName());
	}
}
