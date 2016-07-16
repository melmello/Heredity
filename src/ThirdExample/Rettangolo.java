package ThirdExample;

/**
 * Created by Giulio on 16/07/2016.
 */
public class Rettangolo extends Quadrato {


    public void stampa(Rettangolo rettangolo){
        System.out.println("Rettangolo - Rettangolo");
    }


    public void stampa(Quadrato quadrato){
        System.out.println("Quadrato - Rettangolo");
    }

    public void stampa(Figura figura){
        System.out.println("Figura - Rettangolo");
    }




}
