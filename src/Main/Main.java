package Main;

import AccessControl_6.Exercise1.SecondPackage.ClassB;
import AccessControl_6.Exercise5.AccessModifiers;
import AccessControl_6.Exercise9.access.local.Foreign;
import ControllingExecution_4.Exercise1.PrintsValues;
import ControllingExecution_4.Exercise5.Exersice5;
import ControllingExecution_4.Exercise9.FibonacciSequence;
import EverythingIsAnObject.Exercise1.DefaultInitialization;
import EverythingIsAnObject.Exercise10.Exercise10;
import EverythingIsAnObject.Exercise11.AllTheColorsOfTheRainbow;
import EverythingIsAnObject.Exercise12.HelloDate;
import EverythingIsAnObject.Exercise15.HelloWorldWithDocumentation;
import EverythingIsAnObject.Exercise16.Overloading;
import EverythingIsAnObject.Exercise2.HelloWorld;
import EverythingIsAnObject.Exercise3.ATypeName;
import EverythingIsAnObject.Exercise4.DataOnly;
import EverythingIsAnObject.Exercise6.SimpleClass;
import EverythingIsAnObject.Exercise7.StaticTest;
import EverythingIsAnObject.Exercise8.Person;
import EverythingIsAnObject.Exercise9.Autoboxing;
import InitialinlizationCleanup_5.Exercise1.MyClass;
import InitialinlizationCleanup_5.Exercise13.ExplicitStatic;
import InitialinlizationCleanup_5.Exercise17.People;
import InitialinlizationCleanup_5.Exercise21.Money;
import InitialinlizationCleanup_5.Exercise9.Exercise9;
import Operators_3.Exercise1.Print;
import Operators_3.Exercise13.BinaryForm;
import Operators_3.Exercise5.Dog;
import Operators_3.Exercise9.MinMaxType;
import Polymorphism_8.Exercise1.Exercise1;
import Polymorphism_8.Exercise13.ReferenceCounting;
import Polymorphism_8.Exercise17.Transmogrify;
import Polymorphism_8.Exercise5.Exercise5;
import ReusingClasses_7.Exercise13.Exercise13;
import ReusingClasses_7.Exercise17.Exercise17;
import ReusingClasses_7.Exercise21.Exercise21;
import ReusingClasses_7.Exercise5.C;

import java.util.Scanner;

public class Main {
    public static void chapters(){
        System.out.println("\nВыберите главу из списка" +
                "\n2.Все является объектом" +
                "\n3.Операторы" +
                "\n4.Управляющие конструкции" +
                "\n5.Инициализация и завершение" +
                "\n6.Управление доступом" +
                "\n7.Повторное использование классов" +
                "\n8.Полиморфизм");
    }
    public static void main(String[] args) {
        System.out.println("******** Уразалиева Эмине ******** ");
        boolean flag=true, flag_ex = true, flag_ch2 =true
                ,flag_ch4 = true, flag_ch5 = true, flag_ch6 = true, flag_ch7 = true, flag_ch8= true;
        while (flag) {
            chapters();
            Scanner in = new Scanner(System.in);
            System.out.print("\nВведите номер главы из списка: ");
            int num = in.nextInt();
            switch (num) {
                case 2:
                    System.out.println("\n***Выберите упражнение из главы 2***" +
                            "\n1. Создайте класс с полями int и char, которые не инициализируются в программе.\n" +
                            "Выведите их значения, чтобы убедиться в том, что Java выполняет инициализацию\n" +
                            "по умолчанию" +
                            "\n2. На основании примера HelloDate.java в этой главе напишите программу «Привет,\n" +
                            "мир», которая просто выводит это сообщение. Программа будет содержать только\n" +
                            "один метод (тот, который исполняется при запуске программы — main()). Не забудьте\n" +
                            "объявить его статическим (static) и включите список аргументов, даже если вы не\n" +
                            "будете его использовать. Скомпилируйте программу с помощью javac и запустите\n" +
                            "на исполнение из java. Если вы используете не JDK, а другую среду разработки\n" +
                            "программ, выясните, как в ней компилируются и запускаются программы." +
                            "\n3.  Найдите фрагмент кода с классом ATypeName и сделайте из него программу, пригодную\n" +
                            "для компиляции и запуска." +
                            "\n4. Сделайте то же для кода с использованием класса DataOnly." +
                            "\n5.  Измените упражнение 4 так, чтобы данным класса DataOnly присваивались\n" +
                            "значения, а затем распечатайте их в методе main()." +
                            "\n6. Напишите программу, включающую метод storage( ), приведенный ранее в этой\n" +
                            "главе" +
                            "\n7. Превратите фрагменты кода с классом Incrementable в работающую программу." +
                            "\n8. Напишите программу, которая демонстрирует, что независимо от количества\n" +
                            "созданных объектов класс содержит только один экземпляр поля static." +
                            "\n9. Напишите программу, демонстрирующую автоматическую упаковку примитивных\n" +
                            "типов." +
                            "\n10. Напишите программу, которая выводит три параметра командной строки. Для\n" +
                            "получения аргументов вам потребуется обращение к элементам массива строк\n" +
                            "(String)." +
                            "\n11. Преобразуйте пример с классом AllTheColorsOfTheRainbow в работающую программу." +
                            "\n12. Найдите вторую версию программы HelloDate.java, представляющую пример простой\n" +
                            "документации в комментариях. Выполните команду javadoc для этого файла\n" +
                            "и просмотрите результаты в браузере." +
                            "\n13. Запустите программы Documentation!.java, Documentstion2.java и Documentatkxtf.java\n" +
                            "в javadoc. Просмотрите результаты в браузере." +
                            "\n14. Добавьте список HTML к документации, создаваемой в упражнении 13." +
                            "\n15. Возьмите программу из упражнения 2 и добавьте к ней документацию в комментариях.\n" +
                            "Извлеките эту документацию в HTML-файл с помощью javadoc и просмотрите\n" +
                            "полученную страницу в браузере." +
                            "\n16.Найдите в главе 5 пример Overloading .java и добавьте в него комментарии javadoc.\n" +
                            "Преобразуйте их в страницу HTML и просмотрите ее в браузере.");
                    while(flag_ch2){
                    Scanner i = new Scanner(System.in);
                    System.out.print("\n**Введите номер упражнение из списка: ");
                    int num_ex = i.nextInt();
                    switch (num_ex) {
                        case 1:
                            System.out.println("\n1. Создайте класс с полями int и char, которые не инициализируются в программе." +"\n" +
                                    "Выведите их значения, чтобы убедиться в том, что Java выполняет инициализацию" +
                                    "по умолчанию\n" +
                                    "\npackage EverythingIsAnObject.Exercise1;\n" +
                                    "import java.util.Scanner;\n" +
                                    "/*A class that demonstrates that Java performs initialization by default*/\n" +
                                    "public class DefaultInitialization {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        int myInt;\n" +
                                    "        String myString;\n" +
                                    "\n" +
                                    "        //Scanner the class that is used to get input from the user\n" +
                                    "        Scanner inputName = new Scanner(System.in);\n" +
                                    "        Scanner inputAge = new Scanner(System.in);\n" +
                                    "\n" +
                                    "        System.out.print(\"Please enter your name: \");\n" +
                                    "        myString = inputName.nextLine();\n" +
                                    "\n" +
                                    "        System.out.print(\"Please enter your age: \");\n" +
                                    "        myInt = inputAge.nextInt();\n" +
                                    "\n" +
                                    "        System.out.printf(\"Name: %s\\nAge: %d\", myString, myInt);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------Работа программы----------------------------------------------");
                            DefaultInitialization.main(new String[0]);
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("\n2. На основании примера HelloDate.java в этой главе напишите программу «Привет," +
                                    "мир», которая просто выводит это сообщение. Программа будет содержать только" +"\n" +
                                    "один метод (тот, который исполняется при запуске программы — main()). Не забудьте" +"\n" +
                                    "объявить его статическим (static) и включите список аргументов, даже если вы не" +"\n" +
                                    "будете его использовать. Скомпилируйте программу с помощью javac и запустите" +"\n" +
                                    "на исполнение из java. Если вы используете не JDK, а другую среду разработки" +"\n" +
                                    "программ, выясните, как в ней компилируются и запускаются программы."+
                                    "\npackage EverythingIsAnObject.Exercise2;\n" +
                                    "/*That class prints the message*/\n" +
                                    "\n" +
                                    "public class HelloWorld {\n" +
                                    "\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "\n" +
                                    "        String helloWorld = \"Hello World:)\";\n" +
                                    "        System.out.println(helloWorld);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            HelloWorld.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println( "\n3.  Найдите фрагмент кода с классом ATypeName и сделайте из него программу, пригодную\n" +
                                    "для компиляции и запуска."  +
                                    "\npackage EverythingIsAnObject.Exercise3;\n" +
                                    "/*OOP example\n" +
                                    "* The class defines methods for displaying the class name and the author, the method for changing the class name*/\n" +
                                    "public class ATypeName {\n" +
                                    "    private String typeName;\n" +
                                    "    private String author;\n" +
                                    "\n" +
                                    "    ATypeName(){\n" +
                                    "        typeName = \"ATypeName\";\n" +
                                    "        author = \"Emine\";\n" +
                                    "    }\n" +
                                    "    public String getTypeName() {\n" +
                                    "        return typeName;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    public String getAuthor() {\n" +
                                    "        return author;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    public void setTypeName(String typeName) {\n" +
                                    "        this.typeName = typeName;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        ATypeName myClass = new ATypeName();\n" +
                                    "        System.out.println(\"Class name - \"+ myClass.getTypeName());\n" +
                                    "        System.out.println(\"Author this class - \"+ myClass.getAuthor());\n" +
                                    "\n" +
                                    "        String myNameClass = \"MyClass\";\n" +
                                    "        myClass.setTypeName(myNameClass);\n" +
                                    "        System.out.println(\"\\nClass name changed - \"+ myClass.getTypeName());\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            ATypeName.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 4:
                            System.out.println("\n4. Сделайте то же для кода с использованием класса DataOnly."+
                                    "\npackage EverythingIsAnObject.Exercise4;\n" +
                                    "/*Output values*/\n" +
                                    "public class DataOnly {\n" +
                                    "    private int integerNumber;\n" +
                                    "    private double doubleNumber;\n" +
                                    "    private boolean booleaValue;\n" +
                                    "\n" +
                                    "    DataOnly(){\n" +
                                    "        integerNumber = 19;\n" +
                                    "        doubleNumber = 23.5;\n" +
                                    "        booleaValue = true;\n" +
                                    "    }\n" +
                                    "    public int getIntegerNumber() {\n" +
                                    "        return integerNumber;\n" +
                                    "    }\n" +
                                    "    public double getDoubleNumber() {\n" +
                                    "        return doubleNumber;\n" +
                                    "    }\n" +
                                    "    public boolean isBooleaValue() {\n" +
                                    "        return booleaValue;\n" +
                                    "    }\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        DataOnly dataOnly = new DataOnly();\n" +
                                    "        System.out.printf(\"integerNumber: %d\\ndoubleNumber: %.1f\\nbooleaValue: %b\",\n" +
                                    "                dataOnly.getIntegerNumber(), dataOnly.getDoubleNumber(), dataOnly.isBooleaValue());\n" +
                                    "\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            DataOnly.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 5:
                            System.out.println("\n5.  Измените упражнение 4 так, чтобы данным класса DataOnly присваивались\n" +
                                    "значения, а затем распечатайте их в методе main()." +
                                    "\npackage EverythingIsAnObject.Exercise5;\n" +
                                    "/*Set values*/\n" +
                                    "public class DataOnly {\n" +
                                    "    private int integerNumber;\n" +
                                    "    private double doubleNumber;\n" +
                                    "    private boolean booleaValue;\n" +
                                    "\n" +
                                    "    DataOnly(){\n" +
                                    "        integerNumber = 19;\n" +
                                    "        doubleNumber = 23.5;\n" +
                                    "        booleaValue = true;\n" +
                                    "    }\n" +
                                    "    public int getIntegerNumber() {\n" +
                                    "        return integerNumber;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    public double getDoubleNumber() {\n" +
                                    "        return doubleNumber;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    public boolean isBooleaValue() {\n" +
                                    "        return booleaValue;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    public void setIntegerNumber(int integerNumber) {\n" +
                                    "        this.integerNumber = integerNumber;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    public void setDoubleNumber(double doubleNumber) {\n" +
                                    "        this.doubleNumber = doubleNumber;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    public void setBooleaValue(boolean booleaValue) {\n" +
                                    "        this.booleaValue = booleaValue;\n" +
                                    "    }\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        DataOnly dataOnly = new DataOnly();\n" +
                                    "        dataOnly.setIntegerNumber(20);\n" +
                                    "        dataOnly.setDoubleNumber(12.89);\n" +
                                    "        dataOnly.setBooleaValue(false);\n" +
                                    "        System.out.printf(\"integerNumber: %d\\ndoubleNumber: %.1f\\nbooleaValue: %b\",\n" +
                                    "                dataOnly.getIntegerNumber(), dataOnly.getDoubleNumber(), dataOnly.isBooleaValue());\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            EverythingIsAnObject.Exercise5.DataOnly.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 6:
                            System.out.println( "\n6. Напишите программу, включающую метод storage( ), приведенный ранее в этой\n" +
                                    "главе" +"\npackage EverythingIsAnObject.Exercise6;\n" +
                                    "/*Simple class when used ,method storage*/\n" +
                                    "public class SimpleClass {\n" +
                                    "    //The method indicates how many bytes are required to store the data of a specific string\n" +
                                    "    static int storageString(String s){\n" +
                                    "        return s.length()*2;\n" +
                                    "    }\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        String greating = \"Salaam\";\n" +
                                    "        System.out.println(storageString(greating)+\" bytes\");\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            SimpleClass.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 7:
                            System.out.println("\n7. Превратите фрагменты кода с классом Incrementable в работающую программу." +
                                    "\npackage EverythingIsAnObject.Exercise7;\n" +
                                    "/*An example of using a static field*/\n" +
                                    "public class StaticTest {\n" +
                                    "    static int i =47;\n" +
                                    "\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        StaticTest st1 = new StaticTest();\n" +
                                    "        StaticTest st2 = new StaticTest();\n" +
                                    "        System.out.printf(\"Before increment:\\nst1: %d\\nst2: %d\", st1.i, st2.i);\n" +
                                    "        Incrementable.increment();\n" +
                                    "        System.out.printf(\"\\nAfter increment:\\nst1: %d\\nst2: %d\", st1.i, st2.i);\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "package EverythingIsAnObject.Exercise7;\n" +
                                    "/*Increases the value of a static field of class StaticTest*/\n" +
                                    "\n" +
                                    "public class Incrementable {\n" +
                                    "\n" +
                                    "    static void increment() {\n" +
                                    "        StaticTest.i++;\n" +
                                    "    }\n" +
                                    "}\n\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            StaticTest.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 8:
                            System.out.println("\n8. Напишите программу, которая демонстрирует, что независимо от количества\n" +
                                    "созданных объектов класс содержит только один экземпляр поля static." +"\npackage EverythingIsAnObject.Exercise8;\n" +
                                    "/*There is only one instance of a particular static field in that class\n" +
                                    "* This program demonstrates this fact*/\n" +
                                    "public class Person {\n" +
                                    "    static int age = 19;\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Person me = new Person();\n" +
                                    "        Person you = new Person();\n" +
                                    "        Person he = new Person();\n" +
                                    "        System.out.printf(\"Me age: %d\\nYour age: %d\\nHis age: %d\", me.age, you.age, he.age);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            Person.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 9:
                            System.out.println( "\n9. Напишите программу, демонстрирующую автоматическую упаковку примитивных типов." +
                                    "\npackage EverythingIsAnObject.Exercise9;\n" +
                                    "\n" +
                                    "public class Autoboxing {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        boolean bln = true;\n" +
                                    "        byte bt = 6;\n" +
                                    "        char chrctr = 'a';\n" +
                                    "        double dbl = 0.123;\n" +
                                    "        float flt = 0.52f;\n" +
                                    "        int i = 3;\n" +
                                    "        long lng = 6540;\n" +
                                    "        short shrt = 1;\n" +
                                    "        Boolean bln2 = bln;\n" +
                                    "        System.out.println(\"boolean bln = \" + bln + \", Boolean bln2 = \" + bln2);\n" +
                                    "        System.out.println();\n" +
                                    "        Byte bt2 = bt;\n" +
                                    "        System.out.println(\"byte bt = \" + bt + \", Byte bt2 = \" + bt2);\n" +
                                    "        System.out.println();\n" +
                                    "        Character chrctr2 = chrctr;\n" +
                                    "        System.out.println(\"char chrctr = \" + chrctr + \", Character chrctr2 = \" + chrctr2);\n" +
                                    "        System.out.println();\n" +
                                    "        Double dbl2 = dbl;\n" +
                                    "        System.out.println(\"double dbl = \" + dbl + \", Double dbl2 = \" + dbl2);\n" +
                                    "        System.out.println();\n" +
                                    "        Float flt2 = flt;\n" +
                                    "        System.out.println(\"float flt = \" + flt + \", Float flt2 = \" + flt2);\n" +
                                    "        System.out.println();\n" +
                                    "        Integer i2 = i;\n" +
                                    "        System.out.println(\"int i = \" + i + \", Integer i2 = \" + i2);\n" +
                                    "        System.out.println();\n" +
                                    "        Long lng2 = lng;\n" +
                                    "        System.out.println(\"long lng = \" + lng + \", Long lng2 = \" + lng2);\n" +
                                    "        System.out.println();\n" +
                                    "        Short shrt2 = shrt;\n" +
                                    "        System.out.println(\"short shrt = \" + shrt+ \", Short shrt2 = \" + shrt2);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            Autoboxing.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 10:
                            System.out.println("\n10. Напишите программу, которая выводит три параметра командной строки. Для\n" +
                                    "получения аргументов вам потребуется обращение к элементам массива строк(String)." +
                                    "\npackage EverythingIsAnObject.Exercise10;\n" +
                                    "/*Program that prints three arguments taken from the command line. To do this, you’ll need to index into the command-line array of Strings*/\n" +
                                    "public class Exercise10 {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "\n" +
                                    "        args = new String[3];\n" +
                                    "        for (int i = 0; i < args.length; i++) {\n" +
                                    "            args[i] = \"hello\"+i;\n" +
                                    "        }\n" +
                                    "        for (int i = 0; i < args.length; i++) {\n" +
                                    "            System.out.println(\"args[\" + i + \"] : \" + args[i]);\n" +
                                    "        }\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            Exercise10.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 11:
                            System.out.println("\n11. Преобразуйте пример с классом AllTheColorsOfTheRainbow в работающую программу." +
                                    "\npackage EverythingIsAnObject.Exercise11;\n" +
                                    "\n" +
                                    "public class AllTheColorsOfTheRainbow {\n" +
                                    "    int colorNumber = 0;\n" +
                                    "    int hue = 0;\n" +
                                    "\n" +
                                    "    int changeHue(int h) {\n" +
                                    "        return hue = h;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    int changeColor(int c) {\n" +
                                    "        return colorNumber = c;\n" +
                                    "    }\n" +
                                    "\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();\n" +
                                    "        System.out.printf(\"ColorNumber = %d\",rainbow.colorNumber);\n" +
                                    "        rainbow.changeColor(34);\n" +
                                    "        rainbow.changeHue(12);\n" +
                                    "        System.out.printf(\"\\nColor changed:\\nColorNumber = %d\\nHue = %d\",rainbow.colorNumber,rainbow.hue);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            AllTheColorsOfTheRainbow.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 12:
                            System.out.println("\n12. Найдите вторую версию программы HelloDate.java, представляющую пример простой\n" +
                                    "документации в комментариях. Выполните команду javadoc для этого файла\n" +
                                    "и просмотрите результаты в браузере." +
                                    "\npackage EverythingIsAnObject.Exercise12;\n" +
                                    "\n" +
                                    "import java.util.Date;\n" +
                                    "\n" +
                                    "/** The first Thinking in Java example program.\n" +
                                    " * Displays a string and today's date.\n" +
                                    " * @author Bruce Eckel\n" +
                                    " * @author www.MindView.net\n" +
                                    " * @version 4.0\n" +
                                    " */\n" +
                                    "public class HelloDate {\n" +
                                    "    /** Entry point to class & application.\n" +
                                    "     * @param args array of string arguments\n" +
                                    "     */\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        System.out.println(\"Hello, it's: \");\n" +
                                    "        System.out.println(new Date());\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            HelloDate.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 13:
                            System.out.println("\n13. Запустите программы Documentation!.java, Documentstion2.java и Documentatkxtf.java\n" +
                                    "в javadoc. Просмотрите результаты в браузере." +
                                    "\npackage EverythingIsAnObject.Exercise13;\n" +
                                    "/** A class comment */\n" +
                                    "public class Documentation1 {\n" +
                                    "\n" +
                                    "        /** A field comment */\n" +
                                    "        public int i;\n" +
                                    "        /** A method comment */\n" +
                                    "        public void f() {}\n" +
                                    "}\n" +
                                    "package EverythingIsAnObject.Exercise13;\n" +
                                    "/**\n" +
                                    " * <pre>\n" +
                                    " * System.out.println(new Date());\n" +
                                    " * </pre>\n" +
                                    " */\n" +
                                    "public class Documentation2 {}\n" +
                                    "package EverythingIsAnObject.Exercise13;\n" +
                                    "/**\n" +
                                    " * You can <em>even</em> insert a list:\n" +
                                    " * <ol>\n" +
                                    " * <li> Item one\n" +
                                    " * <li> Item two\n" +
                                    " * <li> Item three\n" +
                                    " * </ol>\n" +
                                    " */\n" +
                                    "public class Documentation3 {\n" +
                                    "}\n");
                            break;
                        case 14:
                            System.out.println("\n14. Добавьте список HTML к документации, создаваемой в упражнении 13." +
                                    "\npackage EverythingIsAnObject.Exercise14;\n" +
                                    "/**\n" +
                                    " * You can <em>even</em> insert a list:\n" +
                                    " * <ol>\n" +
                                    " * <li> Item one\n" +
                                    " * <li> Item two\n" +
                                    " * <li> Item three\n" +
                                    " * </ol>\n" +
                                    " */\n" +
                                    "\n" +
                                    "/** Second list:\n" +
                                    " * <ol>\n" +
                                    " * <li> Item one\n" +
                                    " * <li> Item two\n" +
                                    " * <li> Item three\n" +
                                    " * </ol>\n" +
                                    " */\n" +
                                    "\n" +
                                    "public class Documentation {\n" +
                                    "\n" +
                                    "    /** Third list (a public field list):\n" +
                                    "     * <ol>\n" +
                                    "     * <li> First\n" +
                                    "     * <li> Second\n" +
                                    "     * <li> Third\n" +
                                    "     * </ol>\n" +
                                    "     */\n" +
                                    "    public int i;\n" +
                                    "}\n");
                            break;
                        case 15:
                            System.out.println("\n15. Возьмите программу из упражнения 2 и добавьте к ней документацию в комментариях.\n" +
                                    "Извлеките эту документацию в HTML-файл с помощью javadoc и просмотрите\n" +
                                    "полученную страницу в браузере." +
                                    "\npackage EverythingIsAnObject.Exercise15;\n" +
                                    "/*That class prints the message*/\n" +
                                    "/**\n" +
                                    " * That class prints the message\n" +
                                    " * public class with main method\n" +
                                    " */\n" +
                                    "public class HelloWorldWithDocumentation {\n" +
                                    "    /**\n" +
                                    "     * main method here\n" +
                                    "     */\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "\n" +
                                    "        String helloWorld = \"Hello World:)\";\n" +
                                    "\n" +
                                    "        System.out.println(helloWorld);\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "/* Output:\n" +
                                    "Hello world!\n" +
                                    "*/\n");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            HelloWorldWithDocumentation.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 16:
                            System.out.println("\n16.Найдите в главе 5 пример Overloading .java и добавьте в него комментарии javadoc.\n" +
                                    "Преобразуйте их в страницу HTML и просмотрите ее в браузере."+
                                    "\npackage EverythingIsAnObject.Exercise16;\n" +
                                    "\n" +
                                    "import static jdk.nashorn.internal.objects.Global.print;\n" +
                                    "\n" +
                                    "/** that class creates type Tree\n" +
                                    " */\n" +
                                    "class Tree {\n" +
                                    "    /** field storing height of the tree\n" +
                                    "     */\n" +
                                    "    int height;\n" +
                                    "    /** constructor with no arguments\n" +
                                    "     */\n" +
                                    "    Tree() {\n" +
                                    "        print(\"Planting a seedling\");\n" +
                                    "        height = 0;\n" +
                                    "    }\n" +
                                    "    /** constructor taking an int argument\n" +
                                    "     * which is assigned to height\n" +
                                    "     */\n" +
                                    "    Tree(int initialHeight) {\n" +
                                    "        height = initialHeight;\n" +
                                    "        print(\"Creating new Tree that is \" +\n" +
                                    "                height + \" feet tall\");\n" +
                                    "    }\n" +
                                    "    /** method printing height of the tree\n" +
                                    "     */\n" +
                                    "    void info() {\n" +
                                    "        print(\"Tree is \" + height + \" feet tall\");\n" +
                                    "    }\n" +
                                    "    /** method printing string argument and height of the tree\n" +
                                    "     */\n" +
                                    "    void info(String s) {\n" +
                                    "        print(s + \": Tree is \" + height + \" feet tall\");\n" +
                                    "\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "package EverythingIsAnObject.Exercise16;\n" +
                                    "\n" +
                                    "/** Class creating and testing if tree objects are constructed properly\n" +
                                    " */\n" +
                                    "public class Overloading {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        for(int i = 0; i < 5; i++) {\n" +
                                    "            Tree t = new Tree(i);\n" +
                                    "            t.info();\n" +
                                    "            t.info(\"overloaded method\");\n" +
                                    "        }\n" +
                                    "        // Overloaded constructor:\n" +
                                    "        new Tree();\n" +
                                    "    }\n" +
                                    "} /* Output:\n" +
                                    "Creating new Tree that is 0 feet tall\n" +
                                    "Tree is 0 feet tall\n" +
                                    "overloaded method: Tree is 0 feet tall\n" +
                                    "Creating new Tree that is 1 feet tall\n" +
                                    "Tree is 1 feet tall\n" +
                                    "overloaded method: Tree is 1 feet tall\n" +
                                    "Creating new Tree that is 2 feet tall\n" +
                                    "Tree is 2 feet tall\n" +
                                    "overloaded method: Tree is 2 feet tall\n" +
                                    "Creating new Tree that is 3 feet tall\n" +
                                    "Tree is 3 feet tall\n" +
                                    "overloaded method: Tree is 3 feet tall\n" +
                                    "Creating new Tree that is 4 feet tall\n" +
                                    "Tree is 4 feet tall\n" +
                                    "overloaded method: Tree is 4 feet tall\n" +
                                    "Planting a seedling\n" +
                                    "*/\n" +
                                    "");
                            System.out.println("----------------------------Работа программы------------------------------------------");
                            Overloading.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("Ошибка! Упражнение не найдено");}
                        Scanner ch2_in = new Scanner(System.in);
                        System.out.print("\nХотите продолжить работать в главе 2?(y/n): ");
                        char ch2 = ch2_in.next().charAt(0);
                        if(ch2 == 'y' || ch2 == 'Y'){
                            flag_ch2=true;
                        }
                        else
                            flag_ch2=false;}
                    break;
                case 3:
                    System.out.println("\n***Выберите упражнение из главы 3***" +
                            "\n1.  Напишите программу, в которой используются как «короткие», так и «длинные»\n" +
                            "команды печати." +
                            "\n5. Создайте класс Dog, содержащий два поля типа String: name и says. В методе\n" +
                            "main() создайте два объекта Dog с разными именами (spot и scruffy) и сообщениями.\n" +
                            "Выведите значения обоих полей для каждого из объектов." +
                            "\n9. Выведите наибольшее и наименьшее число в экспоненциальной записи для\n" +
                            "типов float и double." +
                            "\n13. Напишите метод для вывода char в двоичном представлении. Продемонстрируйте\n" +
                            "его работу на нескольких разных символах.");
                    while(flag_ex){
                        Scanner chapter3 = new Scanner(System.in);
                        System.out.print("\n**Введите номер упражнение из списка: ");
                        int num_chapter3 = chapter3.nextInt();
                        switch (num_chapter3) {
                            case 1:
                                System.out.println("\n1.  Напишите программу, в которой используются как «короткие», так и «длинные»\n" +
                                        "команды печати." +
                                        "\npackage Operators_3.Exercise1;\n" +
                                        "public class Print {\n" +
                                        "    public static void main(String[] args) {\n" +
                                        "        System.out.print(\"short  form of print: Hello it's me)\");\n" +
                                        "        System.out.println(\"\n long  form of print: Hello it's me)\");\n" +
                                        "    }\n" +
                                        "}\n");
                                System.out.println("---------------------------------------Работа программы-------------------------------");
                                Print.main(new String[0]);
                                System.out.println("--------------------------------------------------------------------------------------");
                                break;
                            case 5:
                                System.out.println("\n5. Создайте класс Dog, содержащий два поля типа String: name и says. В методе\n" +
                                        "main() создайте два объекта Dog с разными именами (spot и scruffy) и сообщениями.\n" +
                                        "Выведите значения обоих полей для каждого из объектов." +
                                        "\npackage Operators_3.Exercise5;\n" +
                                        "public class Dog {\n" +
                                        "    String name;\n" +
                                        "    String says;\n" +
                                        "    void setName(String n){\n" +
                                        "        name=n;\n" +
                                        "    }\n" +
                                        "    void setSays(String s){\n" +
                                        "        says=s;\n" +
                                        "    }\n" +
                                        "    void showDogName(){\n" +
                                        "        System.out.println(name);\n" +
                                        "    }\n" +
                                        "    void speak(){\n" +
                                        "        System.out.println(says);\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    public static void main(String[] args) {\n" +
                                        "        Dog spot = new Dog();\n" +
                                        "        spot.setName(\"Spot\");\n" +
                                        "        spot.setSays(\"Ruff!\");\n" +
                                        "        Dog scruffy = new Dog();\n" +
                                        "        scruffy.setName(\"Scruffy\");\n" +
                                        "        scruffy.setSays(\"Wurf!\");\n" +
                                        "        spot.showDogName();\n" +
                                        "        spot.speak();\n" +
                                        "        scruffy.showDogName();\n" +
                                        "        scruffy.speak();\n" +
                                        "    }\n" +
                                        "}\n");
                                System.out.println("---------------------------------------Работа программы-------------------------------");
                                Dog.main(new String[0]);
                                System.out.println("--------------------------------------------------------------------------------------");
                                break;
                            case 9:
                                System.out.println("\n9. Выведите наибольшее и наименьшее число в экспоненциальной записи для\n" +
                                        "типов float и double." +
                                        "\npackage Operators_3.Exercise9;\n" +
                                        "\n" +
                                        "public class MinMaxType {\n" +
                                        "    public static void main(String[] args) {\n" +
                                        "        float largestFloat = java.lang.Float.MAX_VALUE;\n" +
                                        "        float smallestFloat = java.lang.Float.MIN_VALUE;\n" +
                                        "        double largestDouble = java.lang.Double.MAX_VALUE;\n" +
                                        "        double smallestDouble = java.lang.Double.MIN_VALUE;\n" +
                                        "        System.out.println(\"Largest float = \" + largestFloat+\"\\nSmallest float = \" + smallestFloat+\"\\nLargest double = \" + largestDouble+\"\\nSmallest double = \" + smallestDouble);\n" +
                                        "    }\n" +
                                        "}\n");
                                System.out.println("---------------------------------------Работа программы-------------------------------");
                                MinMaxType.main(new String[0]);
                                System.out.println("--------------------------------------------------------------------------------------");
                                break;
                            case 13:
                                System.out.println("\n13. Напишите метод для вывода char в двоичном представлении. Продемонстрируйте\n" +
                                        "его работу на нескольких разных символах."+
                                        "\npackage Operators_3.Exercise13;\n" +
                                        "/*char values in binary form*/\n" +
                                        "public class BinaryForm {\n" +
                                        "    public static void showBinaryForm(char character) {\n" +
                                        "        System.out.println(character + \" = \" + Integer.toBinaryString(character));\n" +
                                        "    }\n" +
                                        "    public static void main(String[] args) {\n" +
                                        "        showBinaryForm('A');\n" +
                                        "        showBinaryForm('a');\n" +
                                        "        showBinaryForm('p');\n" +
                                        "        showBinaryForm('U');\n" +
                                        "    }\n" +
                                        "}\n");
                                System.out.println("---------------------------------------Работа программы-------------------------------");
                                BinaryForm.main(new String[0]);
                                System.out.println("--------------------------------------------------------------------------------------");
                                break;
                            default:
                                System.out.println("Ошибка! Упражнение не найдено");
                        }
                        Scanner ch3_in = new Scanner(System.in);
                        System.out.print("\nХотите продолжить работать в главе 3?(y/n): ");
                        char ch3 = ch3_in.next().charAt(0);
                            if(ch3 == 'y' || ch3 == 'Y'){
                                flag_ex=true;
                            }
                            else
                                flag_ex=false;
                    }
                    break;
                case 4:
                    System.out.println("\n***Выберите упражнение из главы 4***" +
                            "\n1.   Напишите программу, которая выводит числа от 1 до 100." +
                            "\n5.  Повторите упражнение 1 из предыдущей главы, используя тернарный оператор\n" +
                            "и поразрядную проверку для вывода нулей и единиц (вместо вызова метода Integer.\n" +
                            "toBinaryString())." +
                            "\n9. Числами Фибоначчи называется числовая последовательность 1,1,2,3,5,8,13,\n" +
                            "21, 34 и т. д., в которой каждое число, начиная с третьего, является суммой двух\n" +
                            "предыдущих. Напишите метод, который получает целочисленный аргумент и выводит\n" +
                            "указанное количество чисел Фибоначчи. Например, при запуске командой ja v a\n" +
                            "F ib o n a c c i S (где F ib o n a c c i — имя класса) должна! выводиться последовательность\n" +
                            "1, 1, 2, 3, 5.\n");
                    while(flag_ch4){
                    Scanner chapter4 = new Scanner(System.in);
                    System.out.print("\n**Введите номер упражнение из списка: ");
                    int num_chapter4 = chapter4.nextInt();
                    switch (num_chapter4) {
                        case 1:
                            System.out.println( "\n1.   Напишите программу, которая выводит числа от 1 до 100." +
                                    "\npackage ControllingExecution_4.Exercise1;\n" +
                                    "/* program that prints values from 1 to 100\n" +
                                    "* в переводе это упражнение по счету идет 15-е*/\n" +
                                    "public class PrintsValues {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        for(int i=1;i<=100;i++){\n" +
                                    "            System.out.print(i+\" \");\n" +
                                    "        }\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            PrintsValues.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 5:
                            System.out.println("\n5.  Повторите упражнение 1 из предыдущей главы, используя тернарный оператор\n" +
                                    "и поразрядную проверку для вывода нулей и единиц (вместо вызова метода Integer.\n" +
                                    "toBinaryString())." +
                                    "\npackage ControllingExecution_4.Exercise5;\n" +
                                    "\n" +
                                    "public class Exersice5 {\n" +
                                    "    static void printb(int i){\n" +
                                    "        System.out.print(i);\n" +
                                    "    }\n" +
                                    "    static void integerToBinary (int a) {\n" +
                                    "        if(a == 0) printb(0);\n" +
                                    "        else {\n" +
                                    "            int b = Integer.numberOfLeadingZeros(a);\n" +
                                    "            a <<= b;\n" +
                                    "            for(int p = 0; p < 32 - b; p++) {\n" +
                                    "                int n = (Integer.numberOfLeadingZeros(a) == 0) ? 1 : 0;\n" +
                                    "                printb(n);\n" +
                                    "                a <<= 1;\n" +
                                    "            }\n" +
                                    "        }\n" +
                                    "        System.out.print(\"\");\n" +
                                    "    }\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        int i = 0xAAAA;\n" +
                                    "        int j = 0x5555;\n" +
                                    "        System.out.print(\"i = \");\n" +
                                    "        integerToBinary(i);\n" +
                                    "        System.out.print(\"\\nj = \");\n" +
                                    "        integerToBinary(j);\n" +
                                    "        System.out.print(\"\\ni & j = \");\n" +
                                    "        integerToBinary(i & j);\n" +
                                    "        System.out.print(\"\\ni | j = \");\n" +
                                    "        integerToBinary(i | j);\n" +
                                    "        System.out.print(\"\\ni ^ j = \");\n" +
                                    "        integerToBinary(i ^ j);\n" +
                                    "        System.out.print(\"\\n~i = \");\n" +
                                    "        integerToBinary(~i);\n" +
                                    "        System.out.print(\"\\n~j = \");\n" +
                                    "        integerToBinary(~j);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            Exersice5.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 9:
                            System.out.println("\n9. Числами Фибоначчи называется числовая последовательность 1,1,2,3,5,8,13,\n" +
                                    "21, 34 и т. д., в которой каждое число, начиная с третьего, является суммой двух\n" +
                                    "предыдущих. Напишите метод, который получает целочисленный аргумент и выводит\n" +
                                    "указанное количество чисел Фибоначчи. Например, при запуске командой ja v a\n" +
                                    "F ib o n a c c i S (где F ib o n a c c i — имя класса) должна! выводиться последовательность\n" +
                                    "1, 1, 2, 3, 5.\n"+
                                    "\npackage ControllingExecution_4.Exercise9;\n" +
                                    "public class FibonacciSequence {\n" +
                                    "\n" +
                                    "    int showFibonacciNumber(int n) {\n" +
                                    "        if (n < 2) return 1;\n" +
                                    "        return (showFibonacciNumber(n - 2) + showFibonacciNumber(n - 1));\n" +
                                    "    }\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        FibonacciSequence obj = new FibonacciSequence();\n" +
                                    "        int num;\n" +
                                    "        Scanner inputCount = new Scanner(System.in);\n" +
                                    "        System.out.print(\"Please enter count numbers: \");\n" +
                                    "        num = inputCount.nextInt();\n" +
                                    "        //Print result\n" +
                                    "        System.out.println(\"\\n\"+num + \" Fibonacci number(s) to show: \");\n" +
                                    "        for (int i = 0; i < num; i++)\n" +
                                    "            System.out.print(obj.showFibonacciNumber(i)+\" \");\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            FibonacciSequence.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("Ошибка! Упражнение не найдено");
                    }
                        Scanner ch4_in = new Scanner(System.in);
                        System.out.print("\nХотите продолжить работать в главе 4?(y/n): ");
                        char ch4 = ch4_in.next().charAt(0);
                        if(ch4 == 'y' || ch4 == 'Y'){
                            flag_ch4=true;
                        }
                        else
                            flag_ch4=false;
                    }
                    break;
                case 5:
                    System.out.println("\n***Выберите упражнение из главы 5***" +
                            "\n1.   Создайте класс с неинициализированной ссылкой на string. Покажите, что Java\n" +
                            "инициализирует ссылку значением null." +
                            "\n5.  Создайте класс Dog (собака) с перегруженным методом bark() (лай). Метод должен\n" +
                            "быть перегружен для разных примитивных типов данных с целью вывода сообщения\n" +
                            "о лае, завывании, поскуливании и т. п. в зависимости от версии перегруженного\n" +
                            "метода. Напишите метод main(), вызывающий все версии." +
                            "\n9. Подготовьте класс с двумя (перегруженными) конструкторами. Используя\n" +
                            "ключевое слово this, вызовите второй конструктор из первого." +
                            "\n13. Проверьте истинность утверждений из предыдущего абзаца. " +
                            "Статические инициализаторы класса Cups выполняются либо при обращении к статическому\n" +
                            "объекту cl в строке с пометкой (1), либо если строка (1) закомментирована —\n" +
                            "в строках (2) после снятия комментариев. Если же и строка (1), и строки (2) закомментированы,\n" +
                            "static -инициализация класса Cups никогда не выполнится. Также неважно,\n" +
                            "будет ли исполнена одна или обе строки (2) программы — sta tic -инициализация все\n" +
                            "равно выполняется только один раз." +
                            "\n17. Создайте класс с конструктором, получающим аргумент String. Выведите значение\n" +
                            "аргумента во время конструирования. Создайте массив ссылок на этот класс,\n" +
                            "но не создавайте объекты, которыми заполняется массив. Запустите программу\n" +
                            "и посмотрите, будут ли выводиться сообщения при вызове конструкторов." +
                            "\n21.  Создайте перечисление с названиями шести типов бумажных денег. Переберите\n" +
                            "результат values() с выводом каждого значения и его ordinal().");
                    while(flag_ch5){
                    Scanner chapter5 = new Scanner(System.in);
                    System.out.print("\n**Введите номер упражнение из списка: ");
                    int num_chapter5 = chapter5.nextInt();
                    switch (num_chapter5) {
                        case 1:
                            System.out.println("\n1.   Создайте класс с неинициализированной ссылкой на string. Покажите, что Java\n" +
                                    "инициализирует ссылку значением null." +
                                    "\npackage InitialinlizationCleanup_5.Exercise1;\n" +
                                    "\n" +
                                    "public class MyClass{\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        MyLittleClass myObject = new MyLittleClass();\n" +
                                    "        System.out.println(\"My object: \"+ myObject.s);\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "/*Create a class containing an uninitialized String reference.\n" +
                                    "Demonstrate that this reference is initialized bu Java to null*/\n" +
                                    "class MyLittleClass {\n" +
                                    "    String s;\n" +
                                    "}\n");
                            System.out.println("----------------------Работа программы------------------------------------------");
                            MyClass.main(new String[0]);
                            System.out.println("---------------------------------------------------------------------------------");
                            break;
                        case 5:
                            System.out.println("\n5.  Создайте класс Dog (собака) с перегруженным методом bark() (лай). Метод должен\n" +
                                    "быть перегружен для разных примитивных типов данных с целью вывода сообщения\n" +
                                    "о лае, завывании, поскуливании и т. п. в зависимости от версии перегруженного\n" +
                                    "метода. Напишите метод main(), вызывающий все версии." +
                                    "\npackage InitialinlizationCleanup_5.Exercise5;\n" +
                                    "class Dog{\n" +
                                    "\n" +
                                    "    void bark(){\n" +
                                    "        System.out.println(\"Dog is quiet...\");\n" +
                                    "    }\n" +
                                    "    void bark(byte b) {\n" +
                                    "        System.out.println(\"bbbbark !\");\n" +
                                    "    }\n" +
                                    "    void bark(char c){\n" +
                                    "        System.out.println(\"cccccc !\");\n" +
                                    "    }\n" +
                                    "    void bark(double d){\n" +
                                    "        System.out.println(\"dddddd !\");\n" +
                                    "    }\n" +
                                    "    void bark(float f){\n" +
                                    "        System.out.println(\"ffffff !\");\n" +
                                    "    }\n" +
                                    "    void bark(int i){\n" +
                                    "        System.out.println(\"iiiiiii !\");\n" +
                                    "    }\n" +
                                    "    void bark(long l){\n" +
                                    "        System.out.println(\"llllll !\");\n" +
                                    "    }\n" +
                                    "    void bark(short s){\n" +
                                    "        System.out.println(\"ssssss !\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "package InitialinlizationCleanup_5.Exercise5;\n" +
                                    "\n" +
                                    "public class Exercise5 {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Dog dog1 = new Dog();\n" +
                                    "        byte b = 0;\n" +
                                    "        char c = 'x';\n" +
                                    "        short s = 0;\n" +
                                    "        dog1.bark();\n" +
                                    "        dog1.bark((byte)b);\n" +
                                    "        dog1.bark((char)c);\n" +
                                    "        dog1.bark(1.0);\n" +
                                    "        dog1.bark(100.0f);\n" +
                                    "        dog1.bark(100);\n" +
                                    "        dog1.bark(100L);\n" +
                                    "        dog1.bark((short)s);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("-----------------------Работа программы------------------------------------------");
                            Exersice5.main(new String[0]);
                            System.out.println("---------------------------------------------------------------------------------");
                            break;
                        case 9:
                            System.out.println("\n9. Подготовьте класс с двумя (перегруженными) конструкторами. Используя\n" +
                                    "ключевое слово this, вызовите второй конструктор из первого." +
                                    "\npackage InitialinlizationCleanup_5.Exercise9;\n" +
                                    "\n" +
                                    "class MyClass{\n" +
                                    "    String first = \"String0\";\n" +
                                    "    int number;\n" +
                                    "    MyClass(String second) {\n" +
                                    "        first = second;\n" +
                                    "        System.out.println(\"Constructor with only String argument is working, String: \" + first + \", int number = \" + number);\n" +
                                    "    }\n" +
                                    "    MyClass(String third,int i) {\n" +
                                    "        this(third);\n" +
                                    "        number = i;\n" +
                                    "        System.out.println(\"Constructor with String and int arguments is working, String: \" + third + \", int number = \" + i);\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "\npackage InitialinlizationCleanup_5.Exercise9;\n" +
                                    "\n" +
                                    "public class Exercise9 {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        MyClass obj1 = new MyClass(\"String1\");\n" +
                                    "        System.out.println(\"************************************************************************************\");\n" +
                                    "        MyClass obj2 = new MyClass(\"String2\", 100);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            Exercise9.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 13:
                            System.out.println("\n13. Проверьте истинность утверждений из предыдущего абзаца. " +
                                    "Статические инициализаторы класса Cups выполняются либо при обращении к статическому\n" +
                                    "объекту cl в строке с пометкой (1), либо если строка (1) закомментирована —\n" +
                                    "в строках (2) после снятия комментариев. Если же и строка (1), и строки (2) закомментированы,\n" +
                                    "static -инициализация класса Cups никогда не выполнится. Также неважно,\n" +
                                    "будет ли исполнена одна или обе строки (2) программы — sta tic -инициализация все\n" +
                                    "равно выполняется только один раз." +
                                    "\npackage InitialinlizationCleanup_5.Exercise13;\n" +
                                    "\n" +
                                    "class Cup {\n" +
                                    "    Cup(int marker) {\n" +
                                    "        System.out.println(\"Cup(\" + marker + \")\");\n" +
                                    "    }\n" +
                                    "    void f(int marker) {\n" +
                                    "        System.out.println(\"f(\" + marker + \")\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Cups {\n" +
                                    "    static Cup cup1;\n" +
                                    "    static Cup cup2;\n" +
                                    "    static {\n" +
                                    "        cup1 = new Cup(1);\n" +
                                    "        cup2 = new Cup(2);\n" +
                                    "    }\n" +
                                    "    Cups() {\n" +
                                    "        System.out.println(\"Cups()\");\n" +
                                    "    }\n" +
                                    "}" +
                                    "\n" +
                                    "package InitialinlizationCleanup_5.Exercise13;\n" +
                                    "\n" +
                                    "public class ExplicitStatic {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        System.out.println(\"Inside main()\");\n" +
                                    "        Cups.cup1.f(99);  // (1)\n" +
                                    "    }\n" +
                                    "    //static Cups cups1 = new Cups();  // (2)\n" +
                                    "    //static Cups cups2 = new Cups();  // (2)\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            ExplicitStatic.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 17:
                            System.out.println("\n17. Создайте класс с конструктором, получающим аргумент String. Выведите значение\n" +
                                    "аргумента во время конструирования. Создайте массив ссылок на этот класс,\n" +
                                    "но не создавайте объекты, которыми заполняется массив. Запустите программу\n" +
                                    "и посмотрите, будут ли выводиться сообщения при вызове конструкторов." +
                                    "\npackage InitialinlizationCleanup_5.Exercise17;\n" +
                                    "\n" +
                                    "class Person {\n" +
                                    "    Person(String s) {\n" +
                                    "        System.out.println(\"String sent: \" + s);\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "public class People {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Person[] arr = new Person[5];\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            People.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 21:
                            System.out.println("\n21.  Создайте перечисление с названиями шести типов бумажных денег. Переберите\n" +
                                    "результат values() с выводом каждого значения и его ordinal()."+
                                    "\npackage InitialinlizationCleanup_5.Exercise21;\n" +
                                    "\n" +
                                    "public class Money {\n" +
                                    "\n" +
                                    "    public enum Currency {USD, RUB, EUR, CHF, UAH, GBP}\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        for (Currency b : Currency.values()) {\n" +
                                    "                System.out.println(b + \" is at the following position in the enum: \" + b.ordinal());\n" +
                                    "        }\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            Money.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("\nОшибка! Упражнение не найдено");
                    }
                    Scanner ch5_in = new Scanner(System.in);
                        System.out.print("\nХотите продолжить работать в главе 5?(y/n): ");
                        char ch5 = ch5_in.next().charAt(0);
                        if(ch5 == 'y' || ch5 == 'Y'){
                            flag_ch5=true;
                        }
                        else
                            flag_ch5=false;
                    }
                    break;
                case 6:
                    System.out.println("\n***Выберите упражнение из главы 6***" +
                            "\n1.   Определите класс в пакете. Создайте экземпляр класса за пределами пакета." +
                            "\n5.  Создайте класс с полями и методами, обладающими разными уровнями доступа:\n" +
                            "public, private, protected, доступом в пределах пакета. Создайте объект этого\n" +
                            "класса и посмотрите, какие сообщения выдает компилятор при попытке обращения\n" +
                            "к разным членам класса. Учтите, что классы, находящиеся в одном каталоге, входят\n" +
                            "в «пакет по умолчанию»." +
                            "\n9. Поместите следующий файл в каталог access/local (предположительно заданный\n" +
                            "в переменной CLASSPATH). Объясните, почему компилятор выдает сообщение об ошибке. Изменит ли чтонибудь\n" +
                            "помещение класса Foreign в пакет access.local?\n");
                    while(flag_ch6){
                    Scanner chapter6 = new Scanner(System.in);
                    System.out.print("\n**Введите номер упражнение из списка: ");
                    int num_chapter6 = chapter6.nextInt();
                    switch (num_chapter6) {
                        case 1:
                            System.out.println( "\n1.   Определите класс в пакете. Создайте экземпляр класса за пределами пакета." +
                                   "\npackage AccessControl_6.Exercise1.FirstPackage;\n" +
                                    "\n" +
                                    "public class ClassA {\n" +
                                    "    public ClassA() {\n" +
                                    "        System.out.println(\"I'm from First package\");\n" +
                                    "    }\n" +
                                    "}" +
                                    "\n" +
                                    "package AccessControl_6.Exercise1.SecondPackage;\n" +
                                    "\n" +
                                    "import AccessControl_6.Exercise1.FirstPackage.ClassA;\n" +
                                    "\n" +
                                    "public class ClassB {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        System.out.println(\"In second package:\");\n" +
                                    "        ClassA obj = new ClassA();\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("---------------------------------Работа программы-------------------------------------");
                            ClassB.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 5:
                            System.out.println( "\n5.  Создайте класс с полями и методами, обладающими разными уровнями доступа:\n" +
                                    "public, private, protected, доступом в пределах пакета. Создайте объект этого\n" +
                                    "класса и посмотрите, какие сообщения выдает компилятор при попытке обращения\n" +
                                    "к разным членам класса. Учтите, что классы, находящиеся в одном каталоге, входят\n" +
                                    "в «пакет по умолчанию»." +
                                    "\npackage AccessControl_6.Exercise5;\n" +
                                    "\n" +
                                    "class MyClass {\n" +
                                    "    public void publicMethod() { System.out.println(\"public method\"); }\n" +
                                    "    public int publicVariable = 2;\n" +
                                    "    protected void protectedMethod() { System.out.println(\"protected method\"); }\n" +
                                    "    protected int protectedVariable = 4;\n" +
                                    "    private void privateMethod() { System.out.println(\"private method\"); }\n" +
                                    "    private int privateVariable = 8;\n" +
                                    "    void packageMethod() {System.out.println(\"method with package access\"); }\n" +
                                    "    int packageVariable = 16;\n" +
                                    "}\n" +
                                    "public class AccessModifiers {\n" +
                                    "\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        MyClass obj = new MyClass();\n" +
                                    "        obj.publicMethod();\n" +
                                    "        obj.publicVariable = 3;\n" +
                                    "        System.out.println(\"public int variable = \" + obj.publicVariable);\n" +
                                    "        obj.protectedMethod();\n" +
                                    "        obj.protectedVariable = 5;\n" +
                                    "        System.out.println(\"protected int variable = \" + obj.protectedVariable);\n" +
                                    "        //The method privateMethod() from the type MyClass is not visible\n" +
                                    "        //obj.privateMethod();\n" +
                                    "        //The field MyClass.privateVariable is not visible\n" +
                                    "        //obj.privateVariable = 9;\n" +
                                    "        //System.out.println(obj.privateVariable);\n" +
                                    "        obj.packageMethod();\n" +
                                    "        obj.packageVariable = 17;\n" +
                                    "        System.out.println(\"int variable with package access = \" + obj.packageVariable);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("---------------------------------Работа программы-------------------------------------");
                            AccessModifiers.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 9:
                            System.out.println("\n9. Поместите следующий файл в каталог access/local (предположительно заданный\n" +
                                    "в переменной CLASSPATH). Объясните, почему компилятор выдает сообщение об ошибке. Изменит ли чтонибудь\n" +
                                    "помещение класса Foreign в пакет access.local?\n"+
                                    "\npackage AccessControl_6.Exercise9.access.foreign;\n" +
                                    "\n" +
                                    "import AccessControl_6.Exercise9.access.local.*;\n" +
                                    "\n" +
                                    "public class Foreign {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        //PackagedClass pc = new PackagedClass();\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "// PackagedClass is not visible.\n" +
                                    "// Moving Foreign class to access.local package solves the problem." +
                                    "\n" +
                                    "package AccessControl_6.Exercise9.access.local;\n" +
                                    "class PackagedClass {\n" +
                                    "    public PackagedClass(){\n" +
                                    "        System.out.println(\"Create class in package\");}\n" +
                                    "}" +
                                    "\n" +
                                    "package AccessControl_6.Exercise9.access.local;\n" +
                                    "\n" +
                                    "public class Foreign {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        PackagedClass pc = new PackagedClass();\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("---------------------------------Работа программы-------------------------------------");
                            Foreign.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("Ошибка! Упражнение не найдено");
                    }
                        Scanner ch6_in = new Scanner(System.in);
                        System.out.print("\nХотите продолжить работать в главе 6?(y/n): ");
                        char ch6 = ch6_in.next().charAt(0);
                        if(ch6 == 'y' || ch6 == 'Y'){
                            flag_ch6=true;
                        }
                        else
                            flag_ch6=false;
                    }
                    break;
                case 7:
                    System.out.println("\n***Выберите упражнение из главы 7***" +
                            "\n1. Создайте простой класс. Во втором классе определите ссылку на объект первого\n" +
                            "класса. Используйте отложенную инициализацию для создания экземпляров\n" +
                            "этого класса." +
                            "\n5. Создайте два класса А и в, имеющие конструкторы по умолчанию (с пустым списком\n" +
                            "аргументов), которые выводят сообщение о вызове. Создайте новый класс с,\n" +
                            "производный от А; создайте в с поле типа в. Не создавайте конструктор С. Создайте\n" +
                            "объект класса с и проследите за происходящим." +
                            "\n9. Создайте класс Root, содержащий экземпляры каждого из классов (также\n" +
                            "созданных вами) Componentl, Component2 и Components. Объявите класс Stem производным\n" +
                            "от класса Root, так чтобы в нем также содержались экземпляры каждого\n" +
                            "из упомянутых классов Component. Каждый класс должен содержать конструктор\n" +
                            "по умолчанию, который выводит сообщение о своем вызове." +
                            "\n13. Создайте класс с троекратно перегруженным методом. Объявите новый класс\n" +
                            "производным от него, добавьте новую перегрузку метода и покажите, что все четыре\n" +
                            "метода доступны в производном классе." +
                            "\n17. Измените упражнение 16 так, чтобы класс Frog переопределял методы базового\n" +
                            "класса (предоставляя новые определения с той же сигнатурой метода). Посмотрите,\n" +
                            "что произойдет в методе main()." +
                            "\n21. Создайте класс с неизменным (final) методом. Создайте производный класс и попытайтесь\n" +
                            "переопределить этот метод.");
                    while(flag_ch7){
                    Scanner chapter7 = new Scanner(System.in);
                    System.out.print("\n**Введите номер упражнение из списка: ");
                    int num_chapter7 = chapter7.nextInt();
                    switch (num_chapter7) {
                        case 1:
                            System.out.println("\n1. Создайте простой класс. Во втором классе определите ссылку на объект первого\n" +
                                    "класса. Используйте отложенную инициализацию для создания экземпляров\n" +
                                    "этого класса." +
                                    "\npackage ReusingClasses_7.Exercise1;\n" +
                                    "\n" +
                                    "class One {\n" +
                                    "    public String toString() {\n" +
                                    "        return \"One class constructed\";\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Two {\n" +
                                    "    One oneObject;\n" +
                                    "    public String toString() {\n" +
                                    "        if(oneObject == null) //отложенная инициализация\n" +
                                    "            oneObject = new One();\n" +
                                    "        return \"\"+ oneObject;\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "public class SimpleClass {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "         Two two = new Two();\n" +
                                    "        System.out.println(two);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("---------------------------------Работа программы-------------------------------------");;
                            ReusingClasses_7.Exercise1.SimpleClass.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 5:
                            System.out.println("\n5. Создайте два класса А и в, имеющие конструкторы по умолчанию (с пустым списком\n" +
                                    "аргументов), которые выводят сообщение о вызове. Создайте новый класс с,\n" +
                                    "производный от А; создайте в с поле типа в. Не создавайте конструктор С. Создайте\n" +
                                    "объект класса с и проследите за происходящим." +
                                    "\npackage ReusingClasses_7.Exercise5;\n" +
                                    "\n" +
                                    "class A{\n" +
                                    "    A(){\n" +
                                    "        System.out.println(\"Constructor class A\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class B{\n" +
                                    "    B(){\n" +
                                    "        System.out.println(\"Constructor class B\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "public class C extends A{\n" +
                                    "    B b = new B();\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        C c = new C();\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("---------------------------------Работа программы-------------------------------------");
                            C.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 9:
                            System.out.println("\n9. Создайте класс Root, содержащий экземпляры каждого из классов (также\n" +
                                    "созданных вами) Componentl, Component2 и Components. Объявите класс Stem производным\n" +
                                    "от класса Root, так чтобы в нем также содержались экземпляры каждого\n" +
                                    "из упомянутых классов Component. Каждый класс должен содержать конструктор\n" +
                                    "по умолчанию, который выводит сообщение о своем вызове." +
                                    "\npackage ReusingClasses_7.Exercise9;\n" +
                                    "\n" +
                                    "class Root {\n" +
                                    "    Root() { System.out.println(\"Root()\"); }\n" +
                                    "    Component1 component1Root = new Component1();\n" +
                                    "    Component2 component2Root = new Component2();\n" +
                                    "    Component3 component3Root = new Component3();\n" +
                                    "}\n" +
                                    "class Stem extends Root {\n" +
                                    "    Stem() {\n" +
                                    "        System.out.println(\"Stem()\");\n" +
                                    "    }\n" +
                                    "    Component1 component1Stem;\n" +
                                    "    Component2 component2Stem;\n" +
                                    "    Component3 component3Stem;\n" +
                                    "\n" +
                                    "}\n" +
                                    "class Component1 {\n" +
                                    "    Component1() { System.out.println(\"Component1()\"); }\n" +
                                    "}\n" +
                                    "class Component2 {\n" +
                                    "    Component2() { System.out.println(\"Component2()\"); }\n" +
                                    "}\n" +
                                    "class Component3 {\n" +
                                    "    Component3() { System.out.println(\"Component3()\"); }\n" +
                                    "}\n" +
                                    "public class Exercise9 {\n" +
                                    "\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Stem stem = new Stem();\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("---------------------------------Работа программы-------------------------------------");
                            ReusingClasses_7.Exercise9.Exercise9.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 13:
                            System.out.println("\n13. Создайте класс с троекратно перегруженным методом. Объявите новый класс\n" +
                                    "производным от него, добавьте новую перегрузку метода и покажите, что все четыре\n" +
                                    "метода доступны в производном классе." +
                                    "\npackage ReusingClasses_7.Exercise13;\n" +
                                    "\n" +
                                    "class Base {\n" +
                                    "    public void test() {\n" +
                                    "        System.out.println(\"Base.test()\");\n" +
                                    "\n" +
                                    "    }\n" +
                                    "    public void test(int i) {\n" +
                                    "        System.out.println(\"Base.test(int i)\");\n" +
                                    "\n" +
                                    "    }\n" +
                                    "    public void test(String s) {\n" +
                                    "        System.out.println(\"Base.test(String s)\");\n" +
                                    "\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "\n" +
                                    "class Derived extends Base {\n" +
                                    "    public void test(float f) {\n" +
                                    "        System.out.println(\"Derived.test(float f)\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "\n" +
                                    "public class Exercise13 {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Derived obj = new Derived();\n" +
                                    "        obj.test();\n" +
                                    "        obj.test(2);\n" +
                                    "        obj.test(\"Sample string\");\n" +
                                    "        obj.test(2.0f);\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("---------------------------------Работа программы-------------------------------------");
                            Exercise13.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 17:
                            System.out.println("\n17. Измените упражнение 16 так, чтобы класс Frog переопределял методы базового\n" +
                                    "класса (предоставляя новые определения с той же сигнатурой метода). Посмотрите,\n" +
                                    "что произойдет в методе main()." +
                                    "\npackage ReusingClasses_7.Exercise17;\n" +
                                    "\n" +
                                    "class Amphibian {\n" +
                                    "    public void nutrition() {\n" +
                                    "        System.out.println(\"Method nutrition()\");\n" +
                                    "    }\n" +
                                    "    public void breeding() {\n" +
                                    "        System.out.println(\"Method breeding()\");\n" +
                                    "    }\n" +
                                    "    public void hibernation() {\n" +
                                    "        System.out.println(\"Method hibernation()\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "\n" +
                                    "class Frog extends Amphibian {\n" +
                                    "    public void breeding() {\n" +
                                    "        System.out.println(\"Method class Frog breeding()\");\n" +
                                    "    }\n" +
                                    "    public void appearance() {\n" +
                                    "        System.out.println(\"Method appearance()\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "\n" +
                                    "public class Exercise17 {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        //Upcasting - Восходящее преобразование\n" +
                                    "        Amphibian amphibian = new Frog();\n" +
                                    "        amphibian.nutrition();\n" +
                                    "        amphibian.breeding();//вызывается метод класса Frog\n" +
                                    "        amphibian.hibernation();\n" +
                                    "        ((Frog) amphibian).appearance();\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("---------------------------------Работа программы-------------------------------------");
                            Exercise17.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 21:
                            System.out.println("\n21. Создайте класс с неизменным (final) методом. Создайте производный класс и попытайтесь\n" +
                                    "переопределить этот метод."+"\npackage ReusingClasses_7.Exercise21;\n" +
                                    "\n" +
                                    "class Basic{\n" +
                                    "    //Спецификатор final означает, что метод является неизменным и не может быть переопредлен\n" +
                                    "    public final void test() {\n" +
                                    "        System.out.println(\"Base.test()\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Derived extends Basic{\n" +
                                    "    /*невозможно переопределить, поскольку метод является final\n" +
                                    "    public void test(){\n" +
                                    "        System.out.println(\"Derived.test()\");\n" +
                                    "    }*/\n" +
                                    "}\n" +
                                    "public class Exercise21 {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        System.out.println(\"Неудается переопределить метод, поскольку он является final\");\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("---------------------------------Работа программы-------------------------------------");
                            Exercise21.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("Ошибка! Упражнение не найдено");
                    }
                        Scanner ch7_in = new Scanner(System.in);
                        System.out.print("\nХотите продолжить работать в главе 7?(y/n): ");
                        char ch7 = ch7_in.next().charAt(0);
                        if(ch7 == 'y' || ch7 == 'Y'){
                            flag_ch7=true;
                        }
                        else
                            flag_ch7=false;
                    }
                    break;
                case 8:
                    System.out.println("\n***Выберите упражнение из главы 4***" +
                            "\n1.   Создайте класс Cycle с производными классами Unicycle, Bicycle и Tricycle.\n" +
                            "Покажите, что экземпляр каждого из производных типов может быть преобразован\n" +
                            "в Cycle, на примере вызова метода ride()." +
                            "\n5.   В упражнении 1 добавьте в класс Cycle метод wheels(), возвращающий количество\n" +
                            "колес каждого транспортного средства. Измените метод ride() так, чтобы он\n" +
                            "вызывал wheels(), и убедитесь в том, что полиморфизм успешно работает." +
                            "\n9.  Создайте иерархию наследования, используя в качестве основы различные типы\n" +
                            "грызунов. Базовым классом станет Rodent (грызун), а производными классами будут\n" +
                            "Mouse (мышь), Hamster (хомяк) и т. п. В базовом классе определите несколько общих\n" +
                            "методов, которые затем переопределите в производных классах, для того чтобы они\n" +
                            "производили действие, свойственное конкретному типу объекта. Создайте массив\n" +
                            "из объектов Rodent, заполните его различными производными типами и вызовите\n" +
                            "методы базового класса, чтобы увидеть результат работы программы." +
                            "\n13. Присоединяя к классу общий объект, необходимо вызвать addRef (), но метод dispose()\n" +
                            "будет следить за состоянием счетчика ссылок и сам решит, когда нужно выполнить\n" +
                            "завершающие действия. Подсчет ссылок требует дополнительных усилий со стороны\n" +
                            "программиста, но при совместном использовании объектов, требующих завершения,\n" +
                            "у вас нет особого выбора." +
                            "\n17. По образцу Transmogrify.java создайте класс S t a r s h i p со ссылкой на объект\n" +
                            "Alertstatus, который может обозначать одно из трех состояний. Включите методы\n" +
                            "для изменения состояния.");
                    while(flag_ch8){
                    Scanner chapter8 = new Scanner(System.in);
                    System.out.print("\n**Введите номер упражнение из списка: ");
                    int num_chapter8 = chapter8.nextInt();
                    switch (num_chapter8) {
                        case 1:
                            System.out.println("\n1.   Создайте класс Cycle с производными классами Unicycle, Bicycle и Tricycle.\n" +
                                    "Покажите, что экземпляр каждого из производных типов может быть преобразован\n" +
                                    "в Cycle, на примере вызова метода ride()." +
                                    "\npackage Polymorphism_8.Exercise1;\n" +
                                    "\n" +
                                    "class Cycle{\n" +
                                    "    public void ride(){\n" +
                                    "        System.out.println(\"Method Cycle.ride()\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Unicycle extends Cycle{\n" +
                                    "    public void test(){\n" +
                                    "        System.out.println(\"Unicycle.test()\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Bicycle extends Cycle{\n" +
                                    "    public void test(){\n" +
                                    "        System.out.println(\"Bicycle.test()\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Tricycle extends Cycle{\n" +
                                    "    public void test(){\n" +
                                    "        System.out.println(\"Tricycle.test()\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "public class Exercise1 {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Cycle cycle = new Unicycle();\n" +
                                    "        Cycle cycle1 = new Bicycle();\n" +
                                    "        Cycle cycle2 = new Tricycle();\n" +
                                    "        cycle.ride();\n" +
                                    "        cycle1.ride();\n" +
                                    "        cycle2.ride();\n" +
                                    "        //((Unicycle) cycle).test();\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            Exercise1.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 5:
                            System.out.println("\n5.   В упражнении 1 добавьте в класс Cycle метод wheels(), возвращающий количество\n" +
                                    "колес каждого транспортного средства. Измените метод ride() так, чтобы он\n" +
                                    "вызывал wheels(), и убедитесь в том, что полиморфизм успешно работает." +
                                    "\npackage Polymorphism_8.Exercise5;\n" +
                                    "\n" +
                                    "class Cycle{\n" +
                                    "    private int count;\n" +
                                    "    public void ride(){\n" +
                                    "        System.out.println(\"Method Cycle.ride()\");\n" +
                                    "    }\n" +
                                    "    public int wheels(){\n" +
                                    "        return count;\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Unicycle extends Cycle{\n" +
                                    "    @Override\n" +
                                    "    public void ride(){\n" +
                                    "        System.out.print(\"Unicycle. \");\n" +
                                    "    }\n" +
                                    "    public int wheels(){\n" +
                                    "        return 2;\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Bicycle extends Cycle{\n" +
                                    "    @Override\n" +
                                    "    public void ride(){\n" +
                                    "        System.out.print(\"Bicycle. \");\n" +
                                    "    }\n" +
                                    "    public int wheels(){\n" +
                                    "        return 2;\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Tricycle extends Cycle{\n" +
                                    "    @Override\n" +
                                    "    public void ride(){\n" +
                                    "        System.out.print(\"Tricycle. \");\n" +
                                    "    }\n" +
                                    "    public int wheels(){\n" +
                                    "        return 3;\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "public class Exercise5 {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Cycle cycle = new Unicycle();\n" +
                                    "        Cycle cycle1 = new Bicycle();\n" +
                                    "        Cycle cycle2 = new Tricycle();\n" +
                                    "\n" +
                                    "        //((Unicycle) cycle).test();\n" +
                                    "        cycle.ride();\n" +
                                    "        System.out.println(\"Number of wheels \"+ cycle.wheels());\n" +
                                    "        cycle1.ride();\n" +
                                    "        System.out.println(\"Number of wheels \"+ cycle1.wheels());\n" +
                                    "        cycle2.ride();\n" +
                                    "        System.out.println(\"Number of wheels \"+ cycle2.wheels());\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            Exercise5.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 9:
                            System.out.println("\n9.  Создайте иерархию наследования, используя в качестве основы различные типы\n" +
                                    "грызунов. Базовым классом станет Rodent (грызун), а производными классами будут\n" +
                                    "Mouse (мышь), Hamster (хомяк) и т. п. В базовом классе определите несколько общих\n" +
                                    "методов, которые затем переопределите в производных классах, для того чтобы они\n" +
                                    "производили действие, свойственное конкретному типу объекта. Создайте массив\n" +
                                    "из объектов Rodent, заполните его различными производными типами и вызовите\n" +
                                    "методы базового класса, чтобы увидеть результат работы программы." +
                                    "\npackage Polymorphism_8.Exercise9;\n" +
                                    "\n" +
                                    "import java.util.Random;\n" +
                                    "\n" +
                                    "public class RandomRodentGenerator{\n" +
                                    "    private Random rand = new Random(47);\n" +
                                    "    public Rodent next(){\n" +
                                    "        switch (rand.nextInt(3)){\n" +
                                    "            default:\n" +
                                    "            case 0: return new Mouse();\n" +
                                    "            case 1: return new Hamster();\n" +
                                    "            case 2: return new Rat();\n" +
                                    "        }\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "package Polymorphism_8.Exercise9;\n" +
                                    "\n" +
                                    "class Rodent{\n" +
                                    "    public void eat(){\n" +
                                    "        System.out.println(\"Rodent eat\");\n" +
                                    "    }\n" +
                                    "    public void sleep(){\n" +
                                    "        System.out.println(\"Rodent sleep\");\n" +
                                    "    }\n" +
                                    "    public void move(){\n" +
                                    "        System.out.println(\"Rodent move\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "\n" +
                                    "class Mouse extends Rodent{\n" +
                                    "    public void eat(){\n" +
                                    "        System.out.println(\"Mouse eat\");\n" +
                                    "    }\n" +
                                    "    public void sleep(){\n" +
                                    "        System.out.println(\"Mouse sleep\");\n" +
                                    "    }\n" +
                                    "    public void move(){\n" +
                                    "        System.out.println(\"Mouse move\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Rat extends Rodent{\n" +
                                    "    public void eat(){\n" +
                                    "        System.out.println(\"Rat eat\");\n" +
                                    "    }\n" +
                                    "    public void sleep(){\n" +
                                    "        System.out.println(\"Rat sleep\");\n" +
                                    "    }\n" +
                                    "    public void move(){\n" +
                                    "        System.out.println(\"Rat move\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Hamster extends Rodent{\n" +
                                    "    public void eat(){\n" +
                                    "        System.out.println(\"Hamster eat\");\n" +
                                    "    }\n" +
                                    "    public void sleep(){\n" +
                                    "        System.out.println(\"Hamster sleep\");\n" +
                                    "    }\n" +
                                    "    public void move(){\n" +
                                    "        System.out.println(\"Hamster move\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "\n" +
                                    "public class Exercise9 {\n" +
                                    "    private static RandomRodentGenerator gen = new RandomRodentGenerator();\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Rodent[] rodents = new Rodent[9];\n" +
                                    "        for(int i=0;i<rodents.length;i++){\n" +
                                    "            rodents[i] = gen.next();\n" +
                                    "        }\n" +
                                    "        for(Rodent rodent : rodents){\n" +
                                    "            //rodent.eat();\n" +
                                    "            //rodent.sleep();\n" +
                                    "            rodent.move();\n" +
                                    "        }\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            Polymorphism_8.Exercise9.Exercise9.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 13:
                            System.out.println("\n13. Присоединяя к классу общий объект, необходимо вызвать addRef (), но метод dispose()\n" +
                                    "будет следить за состоянием счетчика ссылок и сам решит, когда нужно выполнить\n" +
                                    "завершающие действия. Подсчет ссылок требует дополнительных усилий со стороны\n" +
                                    "программиста, но при совместном использовании объектов, требующих завершения,\n" +
                                    "у вас нет особого выбора." +
                                    "\npackage Polymorphism_8.Exercise13;\n" +
                                    "\n" +
                                    "class Shared{\n" +
                                    "    private int refcount = 0;\n" +
                                    "    private static long counter = 0;\n" +
                                    "    private final long id = counter++;\n" +
                                    "    public Shared(){\n" +
                                    "        System.out.println(\"Создаем \" + this);\n" +
                                    "    }\n" +
                                    "    public void addRef(){\n" +
                                    "        refcount++;\n" +
                                    "    }\n" +
                                    "    protected void dispose(){\n" +
                                    "        if(--refcount == 0)\n" +
                                    "            System.out.println(\"Disposing \" + this);\n" +
                                    "    }\n" +
                                    "    public String toString(){\n" +
                                    "        return \"Shared \" + id;\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "class Composing{\n" +
                                    "    private Shared shared;\n" +
                                    "    private static long counter = 0;\n" +
                                    "    private final long id = counter++;\n" +
                                    "    public Composing(Shared shared){\n" +
                                    "        System.out.println(\"Создаем \" + this);\n" +
                                    "        this.shared = shared;\n" +
                                    "        this.shared.addRef();\n" +
                                    "    }\n" +
                                    "    protected void dispose(){\n" +
                                    "        System.out.println(\"disposing \"+this);\n" +
                                    "        shared.dispose();\n" +
                                    "    }\n" +
                                    "    public String toString(){\n" +
                                    "        return \"Composing \"+id;\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "public class ReferenceCounting {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Shared shared = new Shared();\n" +
                                    "        Composing[] composings = {new Composing(shared),\n" +
                                    "        new Composing(shared), new Composing(shared),\n" +
                                    "        new Composing(shared), new Composing(shared)};\n" +
                                    "        for(Composing c : composings)\n" +
                                    "            c.dispose();\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            ReferenceCounting.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        case 17:
                            System.out.println("\n17. По образцу Transmogrify.java создайте класс S t a r s h i p со ссылкой на объект\n" +
                                    "Alertstatus, который может обозначать одно из трех состояний. Включите методы\n" +
                                    "для изменения состояния."+"\npackage Polymorphism_8.Exercise17;\n" +
                                    "\n" +
                                    "class AlertStatus {\n" +
                                    "    public void alert() {}\n" +
                                    "}\n" +
                                    "class NormalAlert extends AlertStatus {\n" +
                                    "    public void alert() { System.out.println(\"AlertStatus Normal\"); }\n" +
                                    "}\n" +
                                    "class HighAlert extends AlertStatus {\n" +
                                    "    public void alert() { System.out.println(\"AlertStatus High\"); }\n" +
                                    "}\n" +
                                    "class MaximumAlert extends AlertStatus {\n" +
                                    "    public void alert() {\n" +
                                    "        System.out.println(\"AlertStatus Maximum\"); }\n" +
                                    "}\n" +
                                    "\n" +
                                    "class Starship {\n" +
                                    "    private AlertStatus alertStatus = new NormalAlert();\n" +
                                    "    public void normalAlert() { alertStatus = new NormalAlert(); }\n" +
                                    "    public void highAlert() { alertStatus = new HighAlert(); }\n" +
                                    "    public void maximumAlert() { alertStatus = new MaximumAlert(); }\n" +
                                    "    public void checkAlertStatus() { alertStatus.alert(); }\n" +
                                    "}\n" +
                                    "\n" +
                                    "public class Transmogrify {\n" +
                                    "    public static void main(String[] args) {\n" +
                                    "        Starship starship = new Starship();\n" +
                                    "        starship.checkAlertStatus();\n" +
                                    "        starship.highAlert();\n" +
                                    "        starship.checkAlertStatus();\n" +
                                    "        starship.maximumAlert();\n" +
                                    "        starship.checkAlertStatus();\n" +
                                    "        starship.normalAlert();\n" +
                                    "        starship.checkAlertStatus();\n" +
                                    "    }\n" +
                                    "}\n");
                            System.out.println("--------------------------Работа программы--------------------------------------------");
                            Transmogrify.main(new String[0]);
                            System.out.println("--------------------------------------------------------------------------------------");
                            break;
                        default:
                            System.out.println("\nОшибка! Упражнение не найдено");
                    }
                        Scanner ch8_in = new Scanner(System.in);
                        System.out.print("\nХотите продолжить работать в главе 8?(y/n): ");
                        char ch8 = ch8_in.next().charAt(0);
                        if(ch8 == 'y' || ch8 == 'Y'){
                            flag_ch8=true;
                        }
                        else
                            flag_ch8=false;
                    }
                    break;
                default:
                    System.out.println("\nОшибка! Глава не найдена(главы от 2 до 8)");
            }
            Scanner input = new Scanner(System.in);
            System.out.print("\nХотите продолжить?(y/n): ");
            char prog = input.next().charAt(0);
            if(prog == 'y' || prog == 'Y'){
                flag=true;
            }
            else
                flag=false;
        }
    }
}
