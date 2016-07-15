/**
 * Created by Giulio on 15/07/2016.
 */
public class SubClass1 extends General {

    @Override
    public String toString() {
        return "SubClass1";
    }

    public void souting(SubClass1 s) {
        System.out.println(s + " " + this + " SubClass1");
    }
}
