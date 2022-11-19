import java.util.Scanner;

public class useInputByScanner {
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // variableName.nextInt() is used to get data in the form of Int.
    float b = sc.nextFloat(); // variableName.netFloat() is used to get data in the form of Float.
    String c = sc.next(); // variableName.next() is used to get data from user in the form of String.
    boolean d = sc.hasNext(); // variableName.hasNext() is used to get data from user in the form of Boolean.
    System.out.println(a+" data type: "+((Object)a).getClass().getSimpleName());
    System.out.println(b+" data type: "+((Object)b).getClass().getSimpleName());
    System.out.println(c+" data type: "+((Object)c).getClass().getSimpleName());
    System.out.println(d+" data type: "+((Object)d).getClass().getSimpleName());
    }
}

