/*
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to
group classes that belong together, which makes your code more readable and maintainable.
To access the inner class, create an object of the outer class, and then create an object of the inner class.
 */
public class innerClass {
    public static void main(String[] args) {
        class_outer outer = new class_outer();
        class_outer.class_inner inner = outer.new class_inner();
        System.out.println(outer.i);
        System.out.println(inner.j);

    }
}
class class_outer{
    String i = "outer class";
    class class_inner{
        String j = "inner class";
    }
}
