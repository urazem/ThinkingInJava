package Polymorphism_8.Exercise9;

class Rodent{
    public void eat(){
        System.out.println("Rodent eat");
    }
    public void sleep(){
        System.out.println("Rodent sleep");
    }
    public void move(){
        System.out.println("Rodent move");
    }
}

class Mouse extends Rodent{
    public void eat(){
        System.out.println("Mouse eat");
    }
    public void sleep(){
        System.out.println("Mouse sleep");
    }
    public void move(){
        System.out.println("Mouse move");
    }
}
class Rat extends Rodent{
    public void eat(){
        System.out.println("Rat eat");
    }
    public void sleep(){
        System.out.println("Rat sleep");
    }
    public void move(){
        System.out.println("Rat move");
    }
}
class Hamster extends Rodent{
    public void eat(){
        System.out.println("Hamster eat");
    }
    public void sleep(){
        System.out.println("Hamster sleep");
    }
    public void move(){
        System.out.println("Hamster move");
    }
}

public class Exercise9 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[9];
        for(int i=0;i<rodents.length;i++){
            rodents[i] = gen.next();
        }
        for(Rodent rodent : rodents){
            //rodent.eat();
            //rodent.sleep();
            rodent.move();
        }
    }
}
