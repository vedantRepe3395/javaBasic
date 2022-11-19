public class operatorsInJava {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        System.out.println("a="+a);
        System.out.println("b="+b);
        // arithmetic operators
        System.out.println(a+b); // + add
        System.out.println(a-b); // - sub
        System.out.println(a*b); // * multiplication
        System.out.println(a/b); // / divide
        System.out.println(a%b); // % mod

        // increment decrement operators

        a++;
        a--;
        --a;
        ++a;

        // shift operator
        a = 10;
        System.out.println(a);
        a = a<<1; // right shift
        System.out.println(a);
        a = a>>1; // left shift
        System.out.println(a);

        // logical operators
        System.out.println(true && false); // && logical and
        System.out.println(true || false); // || logical or

        // assignment operators
        a = 10;
        a += 10; // a = a + 10
        a -= 10; // a = a - 10
        a *= 10; // a = a * 10
        a /= 10; // a = a / 10
        a %= 10; // a = a % 10
        a <<=10; // a = a << 10
        a >>= 10;// a = a >> 10

        // relational operators
        /*

        a < b;
        a > b;
        a =>b;
        a <=b;
        a==b;
        a!=b;

        */




    }
}
