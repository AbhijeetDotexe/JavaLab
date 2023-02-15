import java.util.*;
import java.io.*;


public class start {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("welcome to student management app");
        while(true){
            System.out.println("PRESS 1 to add student");
            System.out.println("PRESS 2 to delete student");
            System.out.println("PRESS 3 to display student");
            System.out.println("PRESS 4 to exit app");
            c= sc.nextInt();

            if(c==1){
                System.out.print("enter student name");
                String name=sc.nextLine();
                // String a = sc.nextLine();
                System.out.println("enter student phone");
                String phone=sc.nextLine();
                System.out.println("enter student city");
                String city=sc.nextLine();
                Student obj=new Student(name,phone,city);
                System.out.println(obj);
            }
            else if(c==2){
                break;
            }
            else if(c==3){
                break;
            }
            else if(c==4){
                break;
            }
            else{
                System.out.println("enter correct input");
            }
        }
        System.out.println("thanks yous visit again");
    }
}