package methods_or_functions;


public class Calculator{
    public void makeSquare() {
        int number = 9;
        int square = number * number;
        System.out.println("square of number is :" +square);
    }
    public void eligibilityVotes() {
        int age = 17;
        if (age > 18) {
            System.out.println("eligibile for voting...");

        }
        else{
            System.out.println("not eligible for voting....");
        }
    }
    public void addition(){
        int number= 1;
        int num2 =2;
        int addition= number+num2;
        System.out.println("addition of numbers "+addition);
    }
    public void subtract(){
        int number=20;
        int number2=14;
        int subtract = number-number2;
        System.out.println("subtraction of numbers "+subtract);
    }

    public void multiplication(){
        int number=7;
        int numb= 8;
        int multiplication = number *numb;
        System.out.println("multiplication of number is "+multiplication);
    }
    public void division(){
        int numb1 =25;
        int numb2 =5;
        int division =numb1/numb2;
        System.out.println("division of number "+division);

    }


    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.makeSquare();
        obj.eligibilityVotes();
        obj.addition();
        obj.subtract();
        obj.multiplication();
        obj.division();
    }

}

