package FourthExample;

/**
 * Created by Giulio on 16/07/2016.
 */
public class MainFourth {

    public static void main(String[] args){
        ClassA a1, a2;
        ClassB b1;
        ClassC c1;

        a1 = new ClassB();
        b1 = new ClassB();
        c1 = new ClassC();
        a2 = new ClassC();

        b1.stampa(b1);
        a1.stampa(b1);
        b1.stampa(c1);
        c1.stampa(c1);
        c1.stampa(a1);
        a2.stampa(c1);

    }

}
