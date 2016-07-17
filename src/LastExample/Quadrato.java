package LastExample;

/**
 * Created by Giulio on 17/07/2016.
 */
public class Quadrato extends Figura{

    @Override
    public void componi(Figura f) {
        System.out.println(this + " + " + f);
    }

    @Override
    public String toString() {
        return "Quadrato";
    }

}
