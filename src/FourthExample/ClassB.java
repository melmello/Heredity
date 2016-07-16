package FourthExample;

/**
 * Created by Giulio on 16/07/2016.
 */
public class ClassB extends ClassA {

    @Override
    public void stampa(ClassA classA){
        System.out.println("AAA/BBB");
    }

    public void stampa(ClassB classB){
        System.out.println("BBB");
    }

}
