import java.math.*;
public class mathJava {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(Math.max(a,b)); // max number
        System.out.println(Math.min(a,b)); // min number
        System.out.println(Math.abs(-12)); // abs value
        System.out.println(Math.sqrt(64)); // square root of number
        System.out.println(Math.random()); // random value between 0.0 and 1.0 value!=1.0
        System.out.println((int)(Math.random()*101)); // random int value between 1 to 100
        System.out.println(Math.round(1.1)); // nearest int value to float or double
        System.out.println(Math.log10(1)); // log to the base 10
        System.out.println(Math.log(1)); // log to the base e
        System.out.println(Math.pow(3,2)); // 3**2
        System.out.println(Math.signum(-100)); // sign of value
        System.out.println(Math.signum(100));
        System.out.println(Math.toDegrees(6));  // radian to degree
        System.out.println(Math.toRadians(360)); // degree to radian
        System.out.println(Math.sin(0)); // sin of theta in radian
        System.out.println(Math.cos(0)); // cos of theta in radian
        System.out.println(Math.tan(0)); // tan of theta in radian
        System.out.println(Math.sinh(0)); // hyperbolic sin of theta in radian
        System.out.println(Math.cosh(0)); // hyperbolic cos of theta in radian
        System.out.println(Math.tanh(0)); // hyperbolic tan of theta in radian

    }
}
