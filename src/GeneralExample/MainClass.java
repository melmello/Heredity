package GeneralExample;

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
        System.out.println("----------------------------------------");
        ArrayList<General> generals = new ArrayList<>();
        ArrayList<SubClass> subClasses = new ArrayList<>();
        ArrayList<SubSubClass> subSubClasses = new ArrayList<>();
        System.out.println("COULD NOT DO AS IN ARRAY's METHOD");
        System.out.println("----------------------------------------");
    }

    private static void creatingArray() {
        System.out.println("----------------------------------------");
        General[] generals = {new General()};
        SubClass[] subClasses = {new SubClass()};
        generals = subClasses;
        System.out.println("WORKING CASTING WITH ARRAY");
        System.out.println("----------------------------------------");
    }

    private static void sortingStatically() {
        General g1 = new General();
        SubClass s1 = new SubClass();
        SubSubClass ss1 = new SubSubClass();
        g1 = s1;
        System.out.println("----------------------------------------");
        g1.souting(g1);
        g1.souting(s1);
        g1.souting(ss1);
        System.out.println("----------------------------------------");
    }

    private static void sortingDinamically() {
        General g1 = new General();
        General s1 = new SubClass();
        General ss1 = new SubSubClass();
        g1 = s1;
        System.out.println("----------------------------------------");
        g1.souting(g1);
        g1.souting(s1);
        g1.souting(ss1);
        System.out.println("----------------------------------------");
    }

    private static void soutStatically() {
        General g1 = new General();
        SubClass s1 = new SubClass();
        SubSubClass ss1 = new SubSubClass();
        System.out.println("----------------------------------------");
        g1.souting(g1);
        g1.souting(s1);
        g1.souting(ss1);
        System.out.println("----------------------------------------");
        s1.souting(g1);
        s1.souting(s1);
        s1.souting(ss1);
        System.out.println("----------------------------------------");
        ss1.souting(g1);
        ss1.souting(s1);
        ss1.souting(ss1);
        System.out.println("----------------------------------------");
    }

    private static void soutDinamically() {
        General g1 = new General();
        General s1 = new SubClass();
        General ss1 = new SubSubClass();
        System.out.println("----------------------------------------");
        g1.souting(g1);
        g1.souting(s1);
        g1.souting(ss1);
        System.out.println("----------------------------------------");
        s1.souting(g1);
        s1.souting(s1);
        s1.souting(ss1);
        System.out.println("----------------------------------------");
        ss1.souting(g1);
        ss1.souting(s1);
        ss1.souting(ss1);
        System.out.println("----------------------------------------");
    }
}
