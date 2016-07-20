package MaybeTheLastExample;

/**
 * Created by Giulio on 20/07/2016.
 */
public class BClass extends AClass {

    @Override
    public void sayHello(AClass aClass) {
        System.out.println("HELLO BCLASS - ACLASS");
    }

    public void sayHello(BClass bClass){
        System.out.println("HELLO BCLASS - BCLASS");
    }

}
