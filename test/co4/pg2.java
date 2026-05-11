//Write a user defined exception class to authenticate the user name and password.
import java.util.Scanner;
class base{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the user Name:");
String name=sc.nextLine();
System.out.println("Enter the password:");
String pass=sc.nextLine();
try{
    if(!name.equals("admin") || !pass.equals("Asiet@123"))

        throw new myexception("Invalid login!");
    
    System.out.println("Login Successfull!!");
    
}
catch (myexception e){
    
    System.out.println(e.getMessage());
}

}

}
class myexception extends Exception{
   myexception(String s){
    super(s);
 }
}