public class arrayJava {
    public static void main(String[] arg) {
        int[] a = {1,2,3,4};
        int b = a.length;
        System.out.println(b);
        for (int j : a)
            System.out.println(j);



        for (int i=0;i<a.length;i++)
            if (i<a.length-1)
                System.out.print(a[i]+",");
            else
                System.out.println(a[i]);


        a[0] = 10;
        System.out.println("");
        System.out.println(a[0]);



    }
}
