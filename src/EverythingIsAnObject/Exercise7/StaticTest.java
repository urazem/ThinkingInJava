package EverythingIsAnObject.Exercise7;
/*An example of using a static field*/
public class StaticTest {
    static int i =47;

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.printf("Before increment:\nst1: %d\nst2: %d", st1.i, st2.i);
        Incrementable.increment();
        System.out.printf("\nAfter increment:\nst1: %d\nst2: %d", st1.i, st2.i);
    }
}
