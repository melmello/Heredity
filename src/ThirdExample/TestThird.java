package ThirdExample;

/**
 * Created by Giulio on 16/07/2016.
 */
public class TestThird {

    public static void main(String[] args){
        Figura f1 = new Quadrato();
        Figura f2 = new Rettangolo();
        Quadrato q1 = new Quadrato();
        Quadrato q2 = new Rettangolo();
        Rettangolo r1 = new Rettangolo();


        f1.stampa(f2);
        q2.stampa(f2);
        f1.stampa(q2);
        q2.stampa(f1);
        q2.stampa(q2);

    }

}
