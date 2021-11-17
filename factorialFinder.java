import java.util.Scanner;

public class factorialFinder {

    public static void main(String[] args) {
	// write your code here
        // factorial program
        Scanner in = new Scanner(System.in);
        int fac = 1;
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        for (int i = 1; i < n; i++){
            fac = fac * i;
        }
        n = n*fac;
        System.out.println(n);
    }
}
