import java.util.Scanner;
public class bp9 {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        sc.close();
 
    
        int arr[][] = new int[2*r][];
 
        for (int i = 0; i < r; i++)
            arr[i] = new int[i + 1];
        
        for(int i = r ;i < 2*r ;i++){
            arr[i] = new int[i-r+1];
        }
        
        int count = 1;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = count++;
            }
            count = 1;
        }
        count = 1;
        int max =1;
        for(int i= r ;i<2*r ;i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count--;
            
            }
            max++;
            count = max;
        }
 
        System.out.println("Contents of 2D Jagged Array");
       
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + "");
            System.out.println();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + "");
            System.out.println();
        }
    }
}
