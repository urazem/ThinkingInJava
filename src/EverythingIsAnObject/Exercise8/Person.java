package EverythingIsAnObject.Exercise8;
/*There is only one instance of a particular static field in that class
* This program demonstrates this fact*/
public class Person {
    static int age = 19;
    public static void main(String[] args) {
        Person me = new Person();
        Person you = new Person();
        Person he = new Person();
        System.out.printf("Me age: %d\nYour age: %d\nHis age: %d", me.age, you.age, he.age);
    }
}
