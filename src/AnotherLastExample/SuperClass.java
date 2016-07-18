package AnotherLastExample;

/**
 * Created by Giulio on 18/07/2016.
 */
public class SuperClass {

    @Override
    public String toString() {
        return "SUPERCLASS";
    }

    public void printing(SuperClass s){
        System.out.println("SUPERCLASS - SUPER - " + s + " - " + this);
    }

}
