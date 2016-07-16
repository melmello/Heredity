package FifthExample;

/**
 * Created by Giulio on 16/07/2016.
 */
public class Mela extends Frutto {

    @Override
    public String toString() {
        return "Mela";
    }

    @Override
    public void macedonia(Frutto f){
        System.out.println("Frutto (Mela) " + f);
    }

    public void macedonia(Mela f){
        System.out.println("Mela " + f);
    }

}
