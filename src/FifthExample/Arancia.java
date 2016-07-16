package FifthExample;

/**
 * Created by Giulio on 16/07/2016.
 */
public class Arancia extends Frutto {

    @Override
    public String toString() {
        return "Arancia";
    }

    @Override
    public void macedonia(Frutto f) {
        System.out.println("Frutto (Arancia) " + f);
    }

    public void macedonia(Arancia f){
        System.out.println("Arancia " + f);
    }

}
