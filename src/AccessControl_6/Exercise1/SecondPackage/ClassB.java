package AccessControl_6.Exercise1.SecondPackage;

import AccessControl_6.Exercise1.FirstPackage.ClassA;

public class ClassB {
    public static void main(String[] args) {
        System.out.println("In second package:");
        ClassA obj = new ClassA();
    }
}
