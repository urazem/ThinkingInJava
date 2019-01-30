package InitialinlizationCleanup_5.Exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        byte b = 0;
        char c = 'x';
        short s = 0;
        dog1.bark();
        dog1.bark((byte)b);
        dog1.bark((char)c);
        dog1.bark(1.0);
        dog1.bark(100.0f);
        dog1.bark(100);
        dog1.bark(100L);
        dog1.bark((short)s);
    }
}
