package methods_or_functions;

public class calCInputParameter {
    public void addition(int a,int b){
        int sum = a+b;
        System.out.println("addition of "+ a+" and "+ b+" is "+sum);
    }
    public void rectangle(int l,int b){
        int rectangle = l*b;
        System.out.println("rectangle of "+l+" and "+ b+" is "+rectangle);
    }
    public void square(int a){
        int square= a*a;
        System.out.println("square of "+a+" is "+square);

    }
    public void subtraction(int a,int b){
        int subtract = a-b;
        System.out.println("subtraction of " +a+" and "+b+" is "+ subtract);
    }
    public void multiplication(int a, int b){
        int multiplication = a*b;
        System.out.println("multiplication of " +a+" and "+b+" is "+ multiplication);
    }
    public void division(int a, int b) {
        int division = a / b;
        System.out.println("division of " + a + " and " + b + " is " + division);
    }
    public static void main(String[] args) {
        calCInputParameter obj = new calCInputParameter();
        obj.addition(3,4);
        obj.subtraction(22,18);
        obj.multiplication(8,7);
        obj.division(22,11);
        obj.rectangle(11,3);
        obj.square(5);




    }

}


