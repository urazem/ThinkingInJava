package EverythingIsAnObject.Exercise6;
/*Simple class when used ,method storage*/
public class SimpleClass {
    //The method indicates how many bytes are required to store the data of a specific string
    static int storageString(String s){
        return s.length()*2;
    }
    public static void main(String[] args) {
        String greating = "Salaam";
        System.out.println(storageString(greating)+" bytes");
    }
}
