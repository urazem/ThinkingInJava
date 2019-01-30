package AccessControl_6.Exercise5;

class MyClass {
    public void publicMethod() { System.out.println("public method"); }
    public int publicVariable = 2;
    protected void protectedMethod() { System.out.println("protected method"); }
    protected int protectedVariable = 4;
    private void privateMethod() { System.out.println("private method"); }
    private int privateVariable = 8;
    void packageMethod() {System.out.println("method with package access"); }
    int packageVariable = 16;
}
public class AccessModifiers {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.publicMethod();
        obj.publicVariable = 3;
        System.out.println("public int variable = " + obj.publicVariable);
        obj.protectedMethod();
        obj.protectedVariable = 5;
        System.out.println("protected int variable = " + obj.protectedVariable);
        //The method privateMethod() from the type MyClass is not visible
        //obj.privateMethod();
        //The field MyClass.privateVariable is not visible
        //obj.privateVariable = 9;
        //System.out.println(obj.privateVariable);
        obj.packageMethod();
        obj.packageVariable = 17;
        System.out.println("int variable with package access = " + obj.packageVariable);
    }
}
