import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {
	// write your code here
        // Fibonacci Series - 1,1,2,3,5,8,13,21,34,55
        Scanner input = new Scanner(System.in);
        System.out.println("How many terms do you want to display?");
        int i = input.nextInt();
        int n = 2;
        int a = 1;
        int b = 1;
        System.out.print("1, 1, ");
        while (n < i) {

            int z = a + b;
            b = a;
            a = z;
            n = n + 1;
            System.out.print(z+", ");
        }
    }
}
