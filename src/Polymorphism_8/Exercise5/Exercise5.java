package Polymorphism_8.Exercise5;

class Cycle{
    private int count;
    public void ride(){
        System.out.println("Method Cycle.ride()");
    }
    public int wheels(){
        return count;
    }
}
class Unicycle extends Cycle{
    @Override
    public void ride(){
        System.out.print("Unicycle. ");
    }
    public int wheels(){
        return 2;
    }
}
class Bicycle extends Cycle{
    @Override
    public void ride(){
        System.out.print("Bicycle. ");
    }
    public int wheels(){
        return 2;
    }
}
class Tricycle extends Cycle{
    @Override
    public void ride(){
        System.out.print("Tricycle. ");
    }
    public int wheels(){
        return 3;
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        Cycle cycle = new Unicycle();
        Cycle cycle1 = new Bicycle();
        Cycle cycle2 = new Tricycle();

        //((Unicycle) cycle).test();
        cycle.ride();
        System.out.println("Number of wheels "+ cycle.wheels());
        cycle1.ride();
        System.out.println("Number of wheels "+ cycle1.wheels());
        cycle2.ride();
        System.out.println("Number of wheels "+ cycle2.wheels());
    }
}
