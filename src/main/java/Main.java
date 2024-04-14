import com.driver.RWOnly;

public class Main {
    public static void main(String[] args) {

        RWOnly object = new RWOnly();
        object.name = "madhav";
        //System.out.println(object.name);
        object.setName("madhav");

       System.out.println("Name: " + object.getName());
//        java: cannot find symbol
//        symbol:   variable name
//        location: variable object of type com.driver.RWOnly

    }
}