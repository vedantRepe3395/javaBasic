public class breakAndContinue {
    public static void main(String[] args) {
        for (int i =0; i<=5; i++){
            if (i==3)
                continue; // skip next part of loop and continue loop
            if (i==5)
                break;   // exit from loop
            else
                System.out.println(i);
        }
    }
}
