package FourthExample;

/**
 * Created by Giulio on 16/07/2016.
 */
public class ClassC extends ClassB {

    @Override
    public void stampa(ClassA classA) {
        System.out.println("AAA/CCC");
    }

    public void stampa(ClassC classC){
        System.out.println("CCC");
    }
}
