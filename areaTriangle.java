import java.util.Scanner;

public class areaTriangle {

    public static void main(String[] args) {
	// write your code here
        // Triangle area 1/2*base*height
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Base of the Triangle: ");
        float base = input.nextFloat();
        System.out.println("Enter the Height of the Triangle: ");
        float height = input.nextFloat();
        double area = 0.5 * base * height;
        System.out.println("The Area of the Triangle is: "+area);
    }
}
