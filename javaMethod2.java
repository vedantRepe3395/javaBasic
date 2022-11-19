public class javaMethod2 {
    static int fun(int k, int j){
        int a =k+j;
        return a;
    }
    static String fun1(String k){
        String a ="asdf";

        return a+k;
    }

    static boolean fun2(String k){
        String a = "asdf";
        return a.equals(k);
    }
    static float fun3(float k){
        return k;
    }
    static double fun4(double k){
        return k;
    }
    static char fun5(char a){
        return a;
    }
    public static void main(String[] args) {
        System.out.println(fun(1,2));
        System.out.println(fun1(" asdf"));
        System.out.println(fun2("asdf"));
        System.out.println(fun3(1.1f));
        System.out.println(fun4(1.1));
        System.out.println(fun5('a'));

        
    }
}
