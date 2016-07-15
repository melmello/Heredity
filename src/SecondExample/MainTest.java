package SecondExample;

/**
 * Created by Giulio on 15/07/2016.
 */
public class MainTest {

    public static void main(String[] args){
        ClassA v1 = new ClassA();
        ClassA v2 = new ClassB();
        ClassA v3 = new ClassC();
        ClassB v4 = new ClassB();
        ClassC v5 = new ClassC();

        v1.print(v1);
        v1.print(v2);
        v3.print(v2);
        v4.print(v3);
        v5.print(v1);
        v5.print(v4);
        v4.print(v5);
    }

}
