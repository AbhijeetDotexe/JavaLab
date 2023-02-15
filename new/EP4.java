import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
public class EP4
{
	public static void main(String[] args) throws Exception
	{
		System.out.println(args[0]);
		Scanner in=new Scanner(new File(args[0]));
		
		Map<String,Integer> map=new HashMap<>();
		while(in.hasNext())
		{
			String word = in.next();
			int freq = (map.get(word) == null) ? 1: map.get(word)+1;  //type safe
			map.put(word, freq);
		}
		System.out.println(map);
	}

}
