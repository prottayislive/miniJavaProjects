import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // subtractProductAndSum
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = in.nextInt();
        for (int j = 1; j < i; j++){
            if (i % j == 0){
                System.out.println(j);
            }
        }
    }
}
