import java.util.Scanner;

public class circleArea {

    public static void main(String[] args) {
	// write your code here
        // Area = pi * r^2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = input.nextFloat();
        final double pi = 3.14;
        double area = pi * (radius*radius);
        System.out.println("The area of the circle is: "+area);
    }
}
