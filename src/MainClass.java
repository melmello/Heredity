import java.util.ArrayList;

/**
 * Created by Giulio on 15/07/2016.
 */
public class MainClass {

    public static void main(String[] args){
        System.out.println("----------------------------------------");
        soutDinamically();
        System.out.println("----------------------------------------");
        soutStatically();
        System.out.println("----------------------------------------");
        sortingDinamically();
        System.out.println("----------------------------------------");
        sortingStatically();
        System.out.println("----------------------------------------");
        creatingArray();
        System.out.println("----------------------------------------");
        creatingArrayList();
        System.out.println("----------------------------------------");
    }

    private static void creatingArrayList() {
        ArrayList<General> generals = new ArrayList<>();
        ArrayList<SubClass1> subClass1s = new ArrayList<>();
        ArrayList<SubSubClass1> subSubClass1s = new ArrayList<>();
        //COULD NOT DO AS IN ARRAY's METHOD
    }

    private static void creatingArray() {
        General[] generals = {new General()};
        SubClass1[] subClass1s = {new SubClass1()};
        generals = subClass1s;
        //IT WORKS
    }

    private static void sortingStatically() {
        General g1 = new General();
        SubClass1 gs1 = new SubClass1();
        SubSubClass1 gs2 = new SubSubClass1();
        g1 = gs1;
        System.out.println("----------------------------------------");
        g1.souting(g1);
        g1.souting(gs1);
        g1.souting(gs2);
        System.out.println("----------------------------------------");
    }

    private static void sortingDinamically() {
        General g1 = new General();
        General gs1 = new SubClass1();
        General gs2 = new SubSubClass1();
        g1 = gs1;
        System.out.println("----------------------------------------");
        g1.souting(g1);
        g1.souting(gs1);
        g1.souting(gs2);
        System.out.println("----------------------------------------");
    }

    private static void soutStatically() {
        General g1 = new General();
        SubClass1 gs1 = new SubClass1();
        SubSubClass1 gs2 = new SubSubClass1();
        System.out.println("----------------------------------------");
        g1.souting(g1);
        g1.souting(gs1);
        g1.souting(gs2);
        System.out.println("----------------------------------------");
        gs1.souting(g1);
        gs1.souting(gs1);
        gs1.souting(gs2);
        System.out.println("----------------------------------------");
        gs2.souting(g1);
        gs2.souting(gs1);
        gs2.souting(gs2);
        System.out.println("----------------------------------------");
    }

    private static void soutDinamically() {
        General g1 = new General();
        General gs1 = new SubClass1();
        General gs2 = new SubSubClass1();
        System.out.println("----------------------------------------");
        g1.souting(g1);
        g1.souting(gs1);
        g1.souting(gs2);
        System.out.println("----------------------------------------");
        gs1.souting(g1);
        gs1.souting(gs1);
        gs1.souting(gs2);
        System.out.println("----------------------------------------");
        gs2.souting(g1);
        gs2.souting(gs1);
        gs2.souting(gs2);
        System.out.println("----------------------------------------");
    }

}
