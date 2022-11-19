import java.util.*;
public class varDeclaration {
    public static void main(String [] ar){
        int i = 1;
        float j = 1.1f;
        char k = 'a';
        String a = "This is string.";
        boolean t =  true;
        boolean f = false;
        System.out.println("i = "+i+" \tData Type: "+((Object)i).getClass().getSimpleName());
        System.out.println("j = "+j+" \tData Type: "+((Object)j).getClass().getSimpleName());
        System.out.println("k = "+k+" \tData Type: "+((Object)k).getClass().getSimpleName());
        System.out.println("a = "+a+" \tData Type "+((Object)a).getClass().getSimpleName());
        System.out.println("t = "+t+" \tData Type: "+((Object)t).getClass().getSimpleName());
        System.out.println("f = "+f+" \tData Type: "+((Object)f).getClass().getSimpleName());
        //((Object)variable_name).getClass().getSimpleName())
        // above line of syntax is used for check data type of variable
    }
}
