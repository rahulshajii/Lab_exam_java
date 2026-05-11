/*Create an interface having prototypes of functions area() and perimeter(). Create two
classes Circle and Rectangle which implements the above interface. Create a menu driven
program to find area and perimeter of objects.*/
import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

// Circle class
class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter of circle: " + (2 * 3.14 * r));
    }
}

// Rectangle class
class Rectangle implements Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (l + b)));
    }
}

// Main class
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                    System.out.print("Enter length and breadth: ");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    Rectangle rect = new Rectangle(l, b);
                    rect.area();
                    rect.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}