package Operators_3.Exercise13;
/*char values in binary form*/
public class BinaryForm {
    public static void showBinaryForm(char character) {
        System.out.println(character + " = " + Integer.toBinaryString(character));
    }
    public static void main(String[] args) {
        showBinaryForm('A');
        showBinaryForm('a');
        showBinaryForm('p');
        showBinaryForm('U');
    }
}
/*Output
* A = 1000001
* a = 1100001
* p = 1110000
* U = 1010101*/
