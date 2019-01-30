package EverythingIsAnObject.Exercise5;
/*Set values*/
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

    public void setIntegerNumber(int integerNumber) {
        this.integerNumber = integerNumber;
    }

    public void setDoubleNumber(double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public void setBooleaValue(boolean booleaValue) {
        this.booleaValue = booleaValue;
    }
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.setIntegerNumber(20);
        dataOnly.setDoubleNumber(12.89);
        dataOnly.setBooleaValue(false);
        System.out.printf("integerNumber: %d\ndoubleNumber: %.1f\nbooleaValue: %b",
                dataOnly.getIntegerNumber(), dataOnly.getDoubleNumber(), dataOnly.isBooleaValue());
    }
}
