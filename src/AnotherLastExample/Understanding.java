package AnotherLastExample;

/**
 * Created by Giulio on 18/07/2016.
 */
public class Understanding {

    public static void main(String[] args){

        SuperClass superClass = new SuperClass();
        SubClass subClass = new SubClass();
        SubSubClass subSubClass = new SubSubClass();

        SuperClass superSub = new SubClass();
        SuperClass superSubSub = new SubSubClass();
        SubClass subSubSub = new SubSubClass();

        superSubSub.printing(subSubClass);
        subSubSub.printing(subSubClass);

    }

}
