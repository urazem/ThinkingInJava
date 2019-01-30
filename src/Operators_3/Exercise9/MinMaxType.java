package Operators_3.Exercise9;

public class MinMaxType {
    public static void main(String[] args) {
        float largestFloat = java.lang.Float.MAX_VALUE;
        float smallestFloat = java.lang.Float.MIN_VALUE;
        double largestDouble = java.lang.Double.MAX_VALUE;
        double smallestDouble = java.lang.Double.MIN_VALUE;
        System.out.println("Largest float = " + largestFloat+"\nSmallest float = " + smallestFloat+"\nLargest double = " + largestDouble+"\nSmallest double = " + smallestDouble);
    }
}
/* Output:
Largest float = 3.4028235E38
Smallest float = 1.4E-45
Largest double = 1.7976931348623157E308
Smallest double = 4.9E-324
*/