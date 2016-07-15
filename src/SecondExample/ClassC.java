package SecondExample;

/**
 * Created by Giulio on 15/07/2016.
 */
public class ClassC extends ClassB {

    public void print(ClassC p){
        System.out.println(this.getClass().getName() + " | " + p.getClass() + " | ClassC p | " + new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println(this.value() + p.value() + 3);
    }

    public void print(ClassA p){
        System.out.println(this.getClass().getName() + " | " + p.getClass() + " | ClassA p | " + new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println(this.value() + p.value() + 4);
    }

}
