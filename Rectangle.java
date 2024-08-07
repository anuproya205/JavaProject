import java.util.Scanner;
public class Rectangle{
        public static void main(String[] args) {
//            scanner object to take input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the width of rectangle: ");
            double width = scanner.nextDouble();

            System.out.println("Enter the height of rectangle: ");
            double height = scanner.nextDouble();
            Rectangle r=new Rectangle();

            // Calculate the area and perimeter
            double area = r.calculateArea(width, height);
            double perimeter = r.calculatePerimeter(width, height);

            // Print the results
            System.out.println(area);
            System.out.println(perimeter);
        }
        public double calculateArea(double width, double height) {
            return width * height;
        }
        public double calculatePerimeter(double width, double height) {
            return 2 * (width + height);
        }
    }


