package methods_or_functions;
public class mobile {
    public int makeCube(int number){
        int cube = number*number*number;
        return cube;
    }
    public String checkDivision(int marks) {
        if(marks>=60){
            return "passed with first division";
        }
        else if (marks<60 && marks>=45){
          return "passes with second division";
        }
        else if (marks<45 && marks>33) {
            return "passed with third division";
        }
        return "Failed";
    }

    public String checkPrice(double price){
        if (price>10000){
            return "good mobile";
        }
         else
             return "not a good one";

         }

    public static void main(String[] args) {
        mobile obj = new mobile();
        int n =obj.makeCube(5);
        System.out.println("cube is "+n);

        String b = obj.checkDivision(65);
        System.out.println(b);

        String a = obj.checkPrice(12000);
        System.out.println(a);
    }

}





