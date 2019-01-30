package EverythingIsAnObject.Exercise4;
/*Output values*/
public class DataOnly {
    private int integerNumber;
    private double doubleNumber;
    private boolean booleaValue;

    DataOnly(){
        integerNumber = 19;
        doubleNumber = 23.5;
        booleaValue = true;
    }
    public int getIntegerNumber() {
        return integerNumber;
    }
    public double getDoubleNumber() {
        return doubleNumber;
    }
    public boolean isBooleaValue() {
        return booleaValue;
    }
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        System.out.printf("integerNumber: %d\ndoubleNumber: %.1f\nbooleaValue: %b",
                dataOnly.getIntegerNumber(), dataOnly.getDoubleNumber(), dataOnly.isBooleaValue());

    }
}
