public class test_static {
    public static int x =10;
}
class Entry {
    public static void main (String [] args) {
        test_static m1 = new test_static ();
        test_static m2 = new test_static ();
        // it's still no change    x:10
        System.out.println("First: "+m1.x);

        // it changed variable  x:10  -> x:30 
        m2.x =  30;         // static changed "x"

        System.out.println(m1.x + " " + m2.x);

    }
}