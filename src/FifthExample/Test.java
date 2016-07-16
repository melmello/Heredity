package FifthExample;

/**
 * Created by Giulio on 16/07/2016.
 */
public class Test {

    public static void main(String[] args){

        Frutto f1 = new Frutto();
        Frutto f2 = new Arancia();
        Mela m = new Mela();
        Arancia a = new Arancia();

        f1.macedonia(f1);
        f1.macedonia(f2);
        f2=m;
        f1=m;
        f1.macedonia(f2);
        a.macedonia(m);
        f1.macedonia(a);

    }

}
