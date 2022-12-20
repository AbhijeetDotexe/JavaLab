import java.util.*;
import java.io.*;
class bp4{
    public static void main(String[] args){
        char[][] ch = {{'A','B','A','C','C','D','E','A','D'},{'D','B','A','C','C','D','E','A','D'}
        };
        //add  10 records like this from the given question
        char[] ans = {'D','B','D','C','C','D','E','A','D'};
        for(int i = 0 ;i< ch.length ;i++){
            int count =0;
            for(int j =0; j< ch[i].length ;j++){
                if(ch[i][j] == ans[j]){
                    count++;
                }   
            }
            System.out.println("student "+ " "+i + "got correct : " + count);
            
        }

    }
}
