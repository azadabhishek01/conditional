public class ConditionalOperators {
    public static void main(String[] args) {
        String brand = "Dell";
        int ram = 8;
        //TRUE||TRUE=TRUE
        if (brand == "Dell1" || ram == 18) {
            System.out.println("good configuration laptop");
        }
        else{
            System.out.println("not good laptop");
            //true||false=true
            ram = 2;
            if (brand == "Dell1" || ram == 18) {
                System.out.println("good configuration laptop");
            }
            else{
            }
                System.out.println("not good laptop");




            }

    }
}
