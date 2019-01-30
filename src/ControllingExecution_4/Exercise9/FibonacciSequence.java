package ControllingExecution_4.Exercise9;
/* A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
34, and so on, where each number (from the third on) is the sum of the previous two. Create
a method that takes an integer as an argument and displays that many Fibonacci numbers
starting from the beginning, e.g., If you run java Fibonacci 5 (where Fibonacci is the
name of the class) the output will be: 1, 1, 2, 3, 5. */
import java.util.Scanner;

public class FibonacciSequence {

    int showFibonacciNumber(int n) {
        if (n < 2) return 1;
        return (showFibonacciNumber(n - 2) + showFibonacciNumber(n - 1));
    }
    public static void main(String[] args) {
        FibonacciSequence obj = new FibonacciSequence();
        int num;
        Scanner inputCount = new Scanner(System.in);
        System.out.print("Please enter count numbers: ");
        num = inputCount.nextInt();
        //Print result
        System.out.println("\n"+num + " Fibonacci number(s) to show: ");
        for (int i = 0; i < num; i++)
            System.out.print(obj.showFibonacciNumber(i)+" ");
    }
}