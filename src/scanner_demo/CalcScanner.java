package scanner_demo;

import java.util.Scanner;

public class CalcScanner {
     public int addition(int a, int b){
        int sum = a+b;
        return sum;
     }
     //subtraction
    //multi
    //divide
    public int subtraction(int a, int b){
         int subtract = a-b;
         return subtract;

    }
     public int multiply(int a, int b){
         int multi = a*b;
         return multi;

     }
     public int divide(int j, int k){
         int divide= j/k;
         return divide;
     }


     public static void main(String[] args) {

        CalcScanner obj = new CalcScanner();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("pls enter the value of b1: ");
        int b = scanner.nextInt();
        int result = obj.addition(a,b);
        System.out.println("addition of given number is "+result);


         System.out.println("Enter the value of a1: ");
         int a1 = scanner.nextInt();
         System.out.println("pls enter the value of b: ");
         int b1= scanner.nextInt();
         int outcome= obj.subtraction(a1,b1);
         System.out.println("subtraction of a1 and b1 is "+outcome);

         System.out.println("put the value of a2:");
         int a2 = scanner.nextInt();
         System.out.println("put the value of b2: ");
         int b2 = scanner.nextInt();

         int production =obj.multiply(a2,b2);
         System.out.println("print the value of given number: "+production);


         System.out.println("put the value of j: ");
         int j = scanner.nextInt();
         System.out.println("put the value of k: ");
         int k = scanner.nextInt();
         int result2 = obj.divide(j,k);
         System.out.println("print the value of given number: "+result2);




















    }
}
