package InitialinlizationCleanup_5.Exercise21;

public class Money {

    public enum Currency {USD, RUB, EUR, CHF, UAH, GBP}
    public static void main(String[] args) {
        for (Currency b : Currency.values()) {
                System.out.println(b + " is at the following position in the enum: " + b.ordinal());
        }
    }
}
