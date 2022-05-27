package methods_or_functions;

public class CallCentre {

    // method>> capability >> refresh, hold, wrap up, .....
    // syntax: access_specifier return_type method_name (parameter){}

    public void refresh(){
        System.out.println("this is refresh method.....");
    }
    public void hold(){
        System.out.println("this is hold method.....");
    }
    public void wrap_up(){
        System.out.println("this is wrap up method.....");
    }

    public static void main(String[] args) {
        //how to call methods
        //step 1:create object of class
        CallCentre obj = new CallCentre();
        //step 2: obj,method name();
        obj.refresh();obj.hold();obj.wrap_up();
    }

}
