//Make another class and a function in it to perform the above task.

public class AP1b {
    public static void main(String[] args) {
        test x = new test();
        x.sum(args);

    }
}

class test{
    public static void sum(String[] args){
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]); 
        }
        System.out.println(sum);
    }
}
