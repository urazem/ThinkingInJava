package ReusingClasses_7.Exercise17;

class Amphibian {
    public void nutrition() {
        System.out.println("Method nutrition()");
    }
    public void breeding() {
        System.out.println("Method breeding()");
    }
    public void hibernation() {
        System.out.println("Method hibernation()");
    }
}

class Frog extends Amphibian {
    public void breeding() {
        System.out.println("Method class Frog breeding()");
    }
    public void appearance() {
        System.out.println("Method appearance()");
    }
}

public class Exercise17 {
    public static void main(String[] args) {
        //Upcasting - Восходящее преобразование
        Amphibian amphibian = new Frog();
        amphibian.nutrition();
        amphibian.breeding();//вызывается метод класса Frog
        amphibian.hibernation();
        ((Frog) amphibian).appearance();
    }
}