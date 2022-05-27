package methods_or_functions;

public class ReturnType {
    public String hello(String name) {
        String message = "welcome to java "+name;
        return message;
    }
    public int makeCube(int number){
        int cube = number*number*number;
        return cube;
    }
    public int makeSquare(int number){
        int square= number *number;
        return square;
    }
    public String checkPrice(double price){

        if (price  >500){
            return "product is costly";
        }
        else
            return "product is not costly";
    }

    public static void main(String[] args) {
        ReturnType obj = new ReturnType();
        String result=obj.hello("Tarun");
        System.out.println("printing in the main method "+result);

        int output =obj.makeSquare(5);
        System.out.println("printing the square is "+output);

        String var=obj.checkPrice(500.55);
        System.out.println("output is "+var);
        int variable = obj.makeCube(5);
        System.out.println("cube of given number is " +variable);

    }

}

