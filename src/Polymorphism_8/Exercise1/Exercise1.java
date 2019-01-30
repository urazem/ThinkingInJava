package Polymorphism_8.Exercise1;

class Cycle{
    public void ride(){
        System.out.println("Method Cycle.ride()");
    }
}
class Unicycle extends Cycle{
    public void test(){
        System.out.println("Unicycle.test()");
    }
}
class Bicycle extends Cycle{
    public void test(){
        System.out.println("Bicycle.test()");
    }
}
class Tricycle extends Cycle{
    public void test(){
        System.out.println("Tricycle.test()");
    }
}
public class Exercise1 {
    public static void main(String[] args) {
        Cycle cycle = new Unicycle();
        Cycle cycle1 = new Bicycle();
        Cycle cycle2 = new Tricycle();
        cycle.ride();
        cycle1.ride();
        cycle2.ride();
        //((Unicycle) cycle).test();
    }
}
