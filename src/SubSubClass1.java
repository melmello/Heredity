/**
 * Created by Giulio on 15/07/2016.
 */
public class SubSubClass1 extends SubClass1 {

    @Override
    public String toString() {
        return "SubSubClass1";
    }

    public void souting(SubSubClass1 s) {
        System.out.println(s + " " + this + " SubSubClass1");
    }

}
