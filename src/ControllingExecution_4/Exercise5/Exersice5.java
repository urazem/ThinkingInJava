package ControllingExecution_4.Exercise5;

public class Exersice5 {
    static void printb(int i){
        System.out.print(i);
    }
    static void integerToBinary (int a) {
        if(a == 0) printb(0);
        else {
            int b = Integer.numberOfLeadingZeros(a);
            a <<= b;
            for(int p = 0; p < 32 - b; p++) {
                int n = (Integer.numberOfLeadingZeros(a) == 0) ? 1 : 0;
                printb(n);
                a <<= 1;
            }
        }
        System.out.print("");
    }
    public static void main(String[] args) {
        int i = 0xAAAA;
        int j = 0x5555;
        System.out.print("i = ");
        integerToBinary(i);
        System.out.print("\nj = ");
        integerToBinary(j);
        System.out.print("\ni & j = ");
        integerToBinary(i & j);
        System.out.print("\ni | j = ");
        integerToBinary(i | j);
        System.out.print("\ni ^ j = ");
        integerToBinary(i ^ j);
        System.out.print("\n~i = ");
        integerToBinary(~i);
        System.out.print("\n~j = ");
        integerToBinary(~j);
    }
}
