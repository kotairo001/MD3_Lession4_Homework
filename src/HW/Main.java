package HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width");
        double width = scanner.nextDouble();
        System.out.println("Input height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle" + rectangle.display());
        System.out.println("Your rectangle's area: " + rectangle.getArea());
        System.out.println("Your rectangle's perimeter: " + rectangle.getPerimeter());
    }
}
