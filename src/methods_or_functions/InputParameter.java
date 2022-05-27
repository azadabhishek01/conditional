package methods_or_functions;

public class InputParameter {
    public void hello(String name) {
        System.out.println("welcome to java " + name);
    }
    public void information(String name, int age){
        System.out.println("print the "+name+age);
    }
    public void makeSquare(int numbers){
        System.out.println("square of given numbers is " +numbers*numbers);
    }
    public void checkAge(int age){
        if (age>18) {
            System.out.println("your age is greater than 18");
        }
        else{
            System.out.println("your age is less than 18");

        }
    }

    public static void main(String[] args) {
         InputParameter obj = new InputParameter();
         obj.hello(" Rajat");
         obj.information(" Chirro ",1 );
         obj.makeSquare(4);
         obj.checkAge(19);



    }
}
