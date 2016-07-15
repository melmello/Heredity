/**
 * Created by Giulio on 15/07/2016.
 */
public class SubSubClass extends SubClass {

    @Override
    public String toString() {
        return "SubSubClass";
    }

    public void souting(SubSubClass s) {
        System.out.println(s + " " + this + " SubSubClass");
    }

}
