package MaybeTheLastExample;

/**
 * Created by Giulio on 20/07/2016.
 */
public class CClass extends BClass {

    @Override
    public void sayHello(AClass aClass) {
        System.out.println("HELLO CCLASS - ACLASS");
    }

    @Override
    public void sayHello(BClass bClass) {
        System.out.println("HELLO CCLASS - BCLASS");
    }

    /*
    public void sayHello(CClass cClass) {
        System.out.println("HELLO CCLASS - CCLASS");
    }
    */

}
