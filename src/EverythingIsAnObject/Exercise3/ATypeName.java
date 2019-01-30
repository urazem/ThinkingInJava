package EverythingIsAnObject.Exercise3;
/*OOP example
* The class defines methods for displaying the class name and the author, the method for changing the class name*/
public class ATypeName {
    private String typeName;
    private String author;

    ATypeName(){
        typeName = "ATypeName";
        author = "Emine";
    }
    public String getTypeName() {
        return typeName;
    }

    public String getAuthor() {
        return author;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public static void main(String[] args) {
        ATypeName myClass = new ATypeName();
        System.out.println("Class name - "+ myClass.getTypeName());
        System.out.println("Author this class - "+ myClass.getAuthor());

        String myNameClass = "MyClass";
        myClass.setTypeName(myNameClass);
        System.out.println("\nClass name changed - "+ myClass.getTypeName());
    }
}