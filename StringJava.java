import java.util.Locale;
import java.util.Scanner;

public class StringJava {
    public static void main(String[] args) {
        String a = "Vedant";
        String b = "Repe";

        System.out.println(a);
        System.out.println(a.length()); // length of string

        System.out.println(a+b); // concatenation operation
        System.out.println(a.concat(b)); //
        System.out.println(a.toUpperCase()); // convert whole string into upper case.
        System.out.println(b.toLowerCase()); // convert whole string into lower case.

        System.out.println(a.indexOf("a")); // index of letter
        System.out.println(a.charAt(2));    // letter at particular index

        System.out.println("This is special char \'a."); // \' is used to add single inverted comma(') in sentence
        System.out.println("This is special char \"a\"."); // \" is used to add double inverted comma(") in sentence
        System.out.println("This is special char \\a\\."); // \\ is used to add \ in sentence

        System.out.println(a.codePointAt(1));
        System.out.println(a.codePointBefore(1));
        System.out.println(a.compareTo(b));

        System.out.println(a.contains("nt")); // check that value contain in string or not
        System.out.println(a.contentEquals("nt")); // check that value contain in string or not sequentially
        System.out.println(a.endsWith("t")); // return true if string ends with char
        System.out.println(a.replace("t","T")); // replace char from string
        System.out.println(a.replaceAll("t","T")); // replace all char which match w
        System.out.println(a.replaceFirst("t","T")); // replace char at first place in index wise

        System.out.println(a+3);

    }
}
