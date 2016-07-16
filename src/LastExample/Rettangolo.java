package LastExample;

/**
 * Created by Giulio on 17/07/2016.
 */
public class Rettangolo extends Quadrato {

    @Override
    public void componi(Figura f) {
        System.out.println(this + " /+/ " + f);
    }

    @Override
    public String toString() {
        return "Rettangolo";
    }
}
