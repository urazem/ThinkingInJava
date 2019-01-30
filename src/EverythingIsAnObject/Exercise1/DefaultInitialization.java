package EverythingIsAnObject.Exercise1;
import java.util.Scanner;
/*A class that demonstrates that Java performs initialization by default*/
public class DefaultInitialization {
    public static void main(String[] args) {
        int myInt;
        String myString;

        //Scanner the class that is used to get input from the user
        Scanner inputName = new Scanner(System.in);
        Scanner inputAge = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        myString = inputName.nextLine();

        System.out.print("Please enter your age: ");
        myInt = inputAge.nextInt();

        System.out.printf("Name: %s\nAge: %d", myString, myInt);
    }
}
