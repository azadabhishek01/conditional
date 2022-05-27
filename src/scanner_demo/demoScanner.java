package scanner_demo;

import java.util.Scanner;

public class demoScanner {
    public static void main(String[] args){
        //Create object of scanner class
        //class name obj= new class name();

          Scanner obj = new Scanner(System.in);    //created object of scanner class

        //1:  Reading String value.
        System.out.println("please enter your name :");
        String name = obj.nextLine();  // Reads string input value
        System.out.println("you have entered  "+name);


        //        //2: Read input of int values
        System.out.println("please enter your age :");
        int age = obj.nextInt();
        System.out.println("you have entered "+age);

        System.out.println("please enter your resident :");
        String address = obj.next();
        System.out.println("you have entered "+ address);

        System.out.println("please enter your academic qualification :");
        String academic  = obj.next();
        System.out.println("you have entered  "+ academic );

        System.out.println("please enter your stream");
        String output = obj.next();
        System.out.println("you have entered stream as  "+output);



    }
}
