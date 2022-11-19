public class typeCasting {
    public static void main(String[] args) {
        int a = 5;
        float b = a;
        String c = String.valueOf(a);
        System.out.println(a+" "+((Object)a).getClass().getSimpleName());
        System.out.println(b+" "+((Object)b).getClass().getSimpleName());
        System.out.println(c+" "+((Object)c).getClass().getSimpleName());


    }
}
