public class classAndObject {
    public static void main(String[] args) {
        class1 a = new class1();  // a is a constructor of class names class1
        String k = a.add();
        String b = new class1().addd();    // static method we can call without creating object.

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.x);
        int d = a.x; // accessing class attribute
        System.out.println(d);
        a.x = 10000; // modify or override class attribute
        System.out.println(a.x);
        System.out.println(a.y);
        // a.y = 2000; // it gives error because we declared y with finally key word
    }
}
class class1{
    int x = 100;
    final int y = 200; // if you want to declare attribute of class which should not be change
                       // then finally keyword is used
    static String add(){
        return "static";
    }
    public String addd(){
        return "public";
    }
    // difference between static and public method is,
    // static method we can call without creating object.
    // public method we can not call without creating object.

}
