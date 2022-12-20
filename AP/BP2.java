import java.io.*;
import java.util.*;
public class BP2 {
    public static void main(String[] args) {
        DuplicateFinder d = new DuplicateFinder(15);
//        System.out.println(d.arr.length);
        int[] arr = new int[d.n];
        int[] count = new int[d.n];
        d.insertElements(arr);
        d.displayElements( arr);
        System.out.println();
        d.Duplicate(arr,count);
        System.out.println();
        d.showCount(count);
        System.out.println();
        d.showDuplicates(count,arr);

    }

}
class DuplicateFinder{
    int n ;
    DuplicateFinder(int s){
        this.n = s;
    }

    Scanner sc = new Scanner(System.in);
    public void insertElements(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println("Insert the elements of the array");
            arr[i] = sc.nextInt();
        }
    }
    public void displayElements(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public void Duplicate(int[] arr,int[] count){
        Arrays.sort(arr);
        int c=0;
        for (int i=0;i<arr.length;i++){
            c=0;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    c++;
                }
            }
            count[i] = c;
        }
        Arrays.toString(count);
    }

    public void showCount(int[] count){
        System.out.println("Frequencey count of each element is : ");
        System.out.println(Arrays.toString(count));
    }


    public void showDuplicates(int[] count,int[] arr){
        for (int i=0;i<n;i++){
            if (count[i]>1){
                System.out.println(arr[i]);
            }
        }
    }
}
