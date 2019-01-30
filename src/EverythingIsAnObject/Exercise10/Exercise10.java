package EverythingIsAnObject.Exercise10;
/*Program that prints three arguments taken from the command line. To do this, you’ll need to index into the command-line array of Strings*/
public class Exercise10 {
    public static void main(String[] args) {

        args = new String[3];
        for (int i = 0; i < args.length; i++) {
            args[i] = "hello"+i;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] : " + args[i]);
        }
    }
}
