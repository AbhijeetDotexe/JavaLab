import java.util.*;
import java.io.*;
class bp5{
    public static void main(String[] args){
        int[] x = {1,2,3,4};
        int[] y = {3,5,2,1};
        double min = 1000;
     
        for(int i = 0 ; i < x.length; i++ ){
            for(int j = i+1; j< y.length; j++){
            
                // System.out.println("the point is : " + x[i] + " " +y[i]);
                // System.out.println("the point is : " + x[j] + " " +y[j]);
                double dist = Math.sqrt(Math.pow(x[i]-x[j],2)+Math.pow(y[i]-y[j],2));
                // System.out.println(dist);
                min = Math.min(min,dist);
            }
        }
        System.out.println(min);

    }
}