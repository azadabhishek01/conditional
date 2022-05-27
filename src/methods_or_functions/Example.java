package methods_or_functions;


public class Example {
    public void makeSquare(){
        int number=8;
        int square = number * number;
        System.out.println("square of number "+square);

    }
    public void divide(){
        int numb= 64;
        int numb2= 8;
        int divide= numb/numb2;
        System.out.println("division of number is "+ divide);


    }


    public static void main(String[] args) {
        Example obj = new Example();
        obj.makeSquare();
        obj.divide();

    }

}






