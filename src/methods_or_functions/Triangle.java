package methods_or_functions;


public class Triangle {

    public void areOfTriangle(){
        int a = 20;
        int b = 3;
        int area = a*b;
        System.out.println("area of triangle "+ area);

    }

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.areOfTriangle();

    }
}
