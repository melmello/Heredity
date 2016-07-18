package AnotherLastExample;

/**
 * Created by Giulio on 18/07/2016.
 */
public class SubSubClass extends SubClass {

    @Override
    public String toString() {
        return "SUBSUBCLASS";
    }

    @Override
    public void printing(SuperClass s) {
        System.out.println("SUBSUBCLASS - SUPER - " + s + " - " + this);
    }


    @Override
    public void printing(SubClass s) {
        System.out.println("SUBSUBCLASS - SUB - " + s + " - " + this);
    }



    public void printing(SubSubClass s){
        System.out.println("SUBSUBCLASS - SUBSUB - " + s + " - " + this);
    }

}
