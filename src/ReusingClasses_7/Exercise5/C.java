package ReusingClasses_7.Exercise5;

class A{
    A(){
        System.out.println("Constructor class A");
    }
}
class B{
    B(){
        System.out.println("Constructor class B");
    }
}
public class C extends A{
    B b = new B();
    public static void main(String[] args) {
        C c = new C();
    }
}
