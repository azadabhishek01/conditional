package methods_or_functions;

import java.security.cert.CertPathValidatorException;

public class Area {

    public void areaOfRectangle() {
        int l = 4;
        int b = 5;
        int area = l * b;
        System.out.println("area of rectangle is " + area);
    }


    public static void main(String[] args) {
        Area obj = new Area();
        obj.areaOfRectangle();



    }
}

