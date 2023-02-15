import java.util.*;
//importing UL class
import java.net.URL;
public class FP2 
{
	public static void main(String[] args) throws Exception
	{
		URL url = new URL("https://amazon.com/");
		System.out.println("URL is : "+ url.toString());
		System.out.println("protocol is: "+ url.getProtocol());
		System.out.println("file name is: "+ url.getFile());
		System.out.println("host is: " + url.getHost());
		System.out.println("path is: " + url.getPath());
		System.out.println("port is: " + url.getPort());
		System.out.println("default port is: "+ url.getDefaultPort());
	}

}
