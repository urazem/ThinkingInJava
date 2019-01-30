package InitialinlizationCleanup_5.Exercise9;

class MyClass{
    String first = "String0";
    int number;
    MyClass(String second) {
        first = second;
        System.out.println("Constructor with only String argument is working, String: " + first + ", int number = " + number);
    }
    MyClass(String third,int i) {
        this(third);
        number = i;
        System.out.println("Constructor with String and int arguments is working, String: " + third + ", int number = " + i);
    }
}

