/*Program to create a class for Employee having attributes eNo, eName,eSalary. Read n
employ information and Search for an employee given eNo, using the concept of Array of
Objects.*/
import java.util.Scanner;
class Employee{
    int eNo;
    String eName;
    double eSalary;

Employee(int a,String b,double c){
    this.eNo=a;
    this.eName=b;
    this.eSalary=c;
}
void display(){
    System.out.println("Details of searched Employee");
    System.out.println("employee no:"+eNo);
    System.out.println("Employee Name:"+eName);
    System.out.println("Employee Salary:"+eSalary);
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Limit of Employees:");
    int n =sc.nextInt();
    Employee[] arr = new Employee[n];
    int i;
    for( i=0;i<n;i++){
        System.out.println("*******Enter the Details of  Employee******");
        System.out.println("Enter the employee number:");
        int a=sc.nextInt();
        System.out.println("Enter the employee name:");
        String b=sc.next();
        System.out.println("Enter the employees salary:");
        double c=sc.nextDouble();
        arr[i] = new Employee(a,b,c); 
    }
    System.out.println("Enter the employee number to search:");
    int e=sc.nextInt();
    for(i=0;i<n;i++){
        if(arr[i].eNo==e){
            arr[i].display();
        }
    }
}
}