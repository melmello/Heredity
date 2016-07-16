package LastExample;

/**
 * Created by Giulio on 17/07/2016.
 */
public class LastTest {

    public static void main(String[] args){
        Figura f = new Rettangolo();
        Quadrato q1 = new Quadrato();
        Quadrato q2 = new Rettangolo();
        Rettangolo r = new Rettangolo();
        Cerchio c = new Ellisse();


        q1.componi(r);
        q1.componi(q2);
        q1.componi(c);
        q1.componi(f);
        r.componi(q2);
    }

}
