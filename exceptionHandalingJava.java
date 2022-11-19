import java.util.Scanner;
public class exceptionHandalingJava {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int k = 0;
        try {
            double j = i / k;
            System.out.println(j);
            }
        catch (Exception e) {
            System.out.println("e");
            }
        finally {
            System.out.println("task executed");
             }

        if (i==12){
            System.out.println("success");
        }
        else {
            throw new ArithmeticException("smaller number");  // if we want to add error manually
            // if we want to remove access for those students whose age is below 18 them throw error.
        }

    }
}