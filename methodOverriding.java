/*
method overriding means many methods having same name but different parameter
 */

public class methodOverriding {
    static  int fun(int k){
        return k;
    }
    static float fun(float k){
        return k;
    }

    static double fun(double k){
        return k;
    }
    static String fun(String k){
        return k;
    }
    public static void main(String[] args) {
        System.out.println(fun(1));
        System.out.println(fun(1.1f));
        System.out.println(fun(1.1));
        System.out.println(fun("asdf"));

    }
}
