import java.io.*;
import java.util.*;

public class javaLoops2 {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			for (int i=0;i<n ;i++ ) {
				System.out.print(a+Math.pow(b,i)+" ");
			}

		}
	}
}
