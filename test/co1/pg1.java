//Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of 
// the class and find the product having the lowest price
import java.util.Scanner;
class product {
    int pcode;
    String pname;
    double price;
    void read(Scanner sc){
    System.out.println("Enter the product code:");
    pcode=sc.nextInt();
    System.out.println("Enter the product name:");
    pname=sc.next();
    System.out.println("Enter the product price:");
    price=sc.nextDouble();

}
public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    product obj1=new product();
    product obj2=new product();
    product obj3=new product();
    obj1.read(sc);
    obj2.read(sc);
    obj3.read(sc);
    if(obj1.price<obj2.price && obj1.price<obj3.price){
        System.out.println("lowest price is : "+obj1.price);
    }
    else if(obj2.price<obj1.price&&obj2.price<obj3.price){
        System.out.println("lowest price is : "+obj2.price);
    }
    else{
        System.out.println("lowest price is : "+obj3.price);
    }

}   

}