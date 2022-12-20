import java.util.*;
import java.io.*;
public class BP1 {
    public static void main(String[] args) {
        String[] names = {"Elena","Thomas","Hamiltion","Suzie","Phil","Matt","Alex","Emma","John","James","Jane"};
        int[] times = {341,273,278,329,445,402,388,275,243,334,412};
        int[] timesCopy = Arrays.copyOf(times,11);
        Arrays.sort(timesCopy);
        for (int i=0;i<11;i++){
            if (times[i]==timesCopy[10]){
                System.out.println("Fastest Runner is: "+names[i]+" And the time is "+times[i]);
            }else if (times[i]==timesCopy[9]){
                System.out.println("Second Fastest Runner is: "+names[i]+" And the time is "+times[i]);
            }
        }
    }
}