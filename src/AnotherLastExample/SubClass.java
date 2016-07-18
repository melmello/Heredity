package AnotherLastExample;

/**
 * Created by Giulio on 18/07/2016.
 */
public class SubClass extends SuperClass {

    @Override
    public String toString() {
        return "SUBCLASS";
    }


    @Override
    public void printing(SuperClass s) {
        System.out.println("SUBCLASS - SUPER - " + s + " - " + this);
    }


    public void printing(SubClass s) {
        System.out.println("SUBCLASS - SUB - " + s + " - " + this);
    }

}
