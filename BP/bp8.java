import java.util.*;
import java.io.*;

public class bp8 {
    public static void main(String[] args) {
        String test1 = "abcdef";
        String test2 = "abc def";
        String test4 = "abc";
        String test3 = new String("abcdef");

        //length()
        System.out.println(test1.length());
        //contains()
        System.out.println(test1.contains(test4));
        //equals()
        System.out.println(test1.equals(test3));
        //==
        System.out.println(test1 == test3);
        //indexof()
        System.out.println(test1.indexOf('d'));
        //split()
        String[] ch = test2.split(" ");
        for (String x : ch) {
            System.out.println(x);
        };

        //uppercase()
        System.out.println(test4.toUpperCase());
    }
}
