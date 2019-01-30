package EverythingIsAnObject.Exercise16;

import static jdk.nashorn.internal.objects.Global.print;

/** that class creates type Tree
 */
class Tree {
    /** field storing height of the tree
     */
    int height;
    /** constructor with no arguments
     */
    Tree() {
        print("Planting a seedling");
        height = 0;
    }
    /** constructor taking an int argument
     * which is assigned to height
     */
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }
    /** method printing height of the tree
     */
    void info() {
        print("Tree is " + height + " feet tall");
    }
    /** method printing string argument and height of the tree
     */
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");

    }
}

