package ReusingClasses_7.Exercise13;

class Base {
    public void test() {
        System.out.println("Base.test()");

    }
    public void test(int i) {
        System.out.println("Base.test(int i)");

    }
    public void test(String s) {
        System.out.println("Base.test(String s)");

    }
}

class Derived extends Base {
    public void test(float f) {
        System.out.println("Derived.test(float f)");
    }
}

public class Exercise13 {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.test();
        obj.test(2);
        obj.test("Sample string");
        obj.test(2.0f);
    }
}