//1. Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle,
//Square and Circle. Test the package by finding the area of these figures.
import graphics.*;
import java.util.Scanner;
class testgraphics{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int choice;
while(true){
    System.out.println("Area of Shapes\n1.Rectangle \n2.Triangle \n3.Square \n4.Circle \n5.Exit");
    choice=sc.nextInt();
    switch(choice){
        case 1: System.out.println("Enter the length & breadth:");
               int l=sc.nextInt();
               int br=sc.nextInt();
               Rectangle re = new Rectangle(l,br);
               re.area();
               break;
        case 2:System.out.println("Enter the  breadth & Height:");
              int b=sc.nextInt();
              int h=sc.nextInt();
              Triangle t = new Triangle(b,h);
              t.area();
              break;
        case 3:System.out.println("Enter the Side:");
              int side=sc.nextInt();
              Square s = new Square(side);
              s.area();
              break;
        case 4:System.out.println("Enter the radius:");
               int r = sc.nextInt();
               Circle c = new Circle(r);
               c.area();
               break;
        case 5:System.exit(0);
               break;
        default:System.out.println("Not valid");
               break;
    }

}
}
}
