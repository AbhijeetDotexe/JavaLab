import java.util.*;
import java.io.*;
public class bp3
{
    public static char[] filterVowel(char[] na){
        String ans = "";
        for(char x : na){
            if(!isVowel(x)){
                ans+=x;
            }
        }
        return ans.toCharArray();
    }
    public static boolean isVowel(char x){
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        char[] ch = {'s','o','u','r','a','v'};
        char[] fans = filterVowel(ch);
        for(char x : fans){
            System.out.println(x);
        }
        
    }
}
