/**
 * Created by Giulio on 15/07/2016.
 */
public class SubClass extends General {

    @Override
    public String toString() {
        return "SubClass";
    }

    public void souting(SubClass s) {
        System.out.println(s + " " + this + " SubClass");
    }
}
