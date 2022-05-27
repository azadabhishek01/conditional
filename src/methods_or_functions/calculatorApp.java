package methods_or_functions;

public class calculatorApp {
  // add
  //syntax: access_specifier data_type method name(input parameter)

    public int addition(int a,int b){
        int sum = a+b;
        return sum;
    }
      public int subtraction(int a,int b){
        int subtract= a-b;
        return subtract;
    }
      public int multiplication(int a,int b){
        int multiplication= a*b;
         return multiplication;
    }
      public int divide(int a,int b){
        int division = a/b;
        return division =a/b;
    }
     public int square(int a){
        int square= a*a;
        return square;
     }
      public static void main(String[] args) {
        calculatorApp obj= new calculatorApp();

        int result= obj.addition(6,8);
        System.out.println("print the sum of a and b "+result);

       int subtraction= obj.subtraction(18,8);
        System.out.println("subtraction of given number is "+subtraction);

        int output=obj.multiplication(8,9);
        System.out.println("output of given number is "+output);

        int division= obj.divide(9,3);
        System.out.println("Division of given number is "+division);

        int square = obj.square(7);
          System.out.println("print the square of given number "+square);



    }
}
