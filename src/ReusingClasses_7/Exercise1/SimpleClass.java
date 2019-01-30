package ReusingClasses_7.Exercise1;

class One {
    public String toString() {
        return "One class constructed";
    }
}
class Two {
    One oneObject;
    public String toString() {
        if(oneObject == null) //отложенная инициализация
            oneObject = new One();
        return ""+ oneObject;
    }
}
public class SimpleClass {
    public static void main(String[] args) {
         Two two = new Two();
        System.out.println(two);
    }
}

