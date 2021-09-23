import java.util.Scanner;

public class Interestrate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter P: ");
        float principle = input.nextFloat();
        System.out.println("Enter R: ");
        float rate = input.nextFloat();
        System.out.println("Enter T: ");
        float time = input.nextFloat();
        float interest = (principle*rate*time)/100;
        System.out.println("The interest rate is " + interest);
    }
}
