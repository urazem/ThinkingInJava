package ReusingClasses_7.Exercise9;

class Root {
    Root() { System.out.println("Root()"); }
    Component1 component1Root = new Component1();
    Component2 component2Root = new Component2();
    Component3 component3Root = new Component3();
}
class Stem extends Root {
    Stem() {
        System.out.println("Stem()");
    }
    Component1 component1Stem;
    Component2 component2Stem;
    Component3 component3Stem;

}
class Component1 {
    Component1() { System.out.println("Component1()"); }
}
class Component2 {
    Component2() { System.out.println("Component2()"); }
}
class Component3 {
    Component3() { System.out.println("Component3()"); }
}
public class Exercise9 {

    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}