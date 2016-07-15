package SecondExample;

/**
 * Created by Giulio on 15/07/2016.
 */
public class ClassA {

    private int a;

    public int value(){
        return a;
    }

    public void print(ClassA p){
        System.out.println(this.getClass().getName() + " | " + p.getClass() + " | ClassA p | " + new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println(this.value() + p.value());
    }
}
