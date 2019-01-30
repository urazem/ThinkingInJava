package ReusingClasses_7.Exercise21;

class Basic{
    //Спецификатор final означает, что метод является неизменным и не может быть переопредлен
    public final void test() {
        System.out.println("Base.test()");
    }
}
class Derived extends Basic{
    /*невозможно переопределить, поскольку метод является final
    public void test(){
        System.out.println("Derived.test()");
    }*/
}
public class Exercise21 {
    public static void main(String[] args) {
        System.out.println("Неудается переопределить метод, поскольку он является final");
    }
}
