package SecondExample;

/**
 * Created by Giulio on 15/07/2016.
 */
public class ClassB extends ClassA {

    public void print(ClassB p){
        System.out.println(this.getClass().getName() + " | " + p.getClass() + " | ClassB p | " + new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println(this.value() + p.value() + 1);
    }

    public void print(ClassA p){
        System.out.println(this.getClass().getName() + " | " + p.getClass() + " | ClassA p | " + new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println(this.value() + p.value() + 2);
    }
}
