/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
to initialize the data members and another class ‘Employee’ that inherits the properties of
class Person and also contains its own data members like Empid, Company_name,
Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits 
the properties of class Employee and contains its own data members like Subject,
Department, Teacherid and contain constructors and methods to display the data members.
Use array of objects to display details of N teachers.*/
import java.util.Scanner;
class person{
    String name,gender,address;
    int age;
    person(String name,String gender,String address,int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}
class Employee extends person{
    int empid;
    String companyname,qualification;
    double salary;
    Employee(int empid,
    String companyname,String qualification,
    double salary,String name,String gender,String address,int age){
        super(name, gender, address, age);
        this.empid=empid;
        this.qualification=qualification;
        this.salary=salary;
    }
}
class Teacher extends Employee{
   String subject,department;
int teacherid;
Teacher(String subject,String department,
int teacherid,int empid,
    String companyname,String qualification,
    double salary,String name,String gender,String address,int age){
        super( empid,companyname,qualification,salary,name,gender, address,age);
        this.subject=subject;
        this.department=department;
        this.teacherid=teacherid;
    }
    void display(){
            System.out.println("********Details of Teacher********");
            System.out.println("Subject:"+subject);
            System.out.println("department:"+department);
            System.out.println("teacherid:"+teacherid);
            System.out.println("*******Details of Employee********");
            System.out.println("empid:"+empid);
            System.out.println("companyname:"+companyname);
            System.out.println("qualification:"+qualification);
            System.out.println("salary:"+salary);
            System.out.println("*********Details of Person********");
            System.out.println("Name:"+name);
            System.out.println("Gender:"+gender);
            System.out.println("address:"+address);
            System.out.println("age:"+age);
    }
}
class main{
     public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Limit:");
     int n=sc.nextInt();
     Teacher [] t=new Teacher[n];
     for(int i=0;i<n;i++){
                System.out.println("***Enter the Details of Teacher***");
                System.out.println("Enter the subject:");
                String subject=sc.next();
                System.out.println("Enter the Department:");
                String department=sc.next();
                System.out.println("Enter the teacherid:");
                int teacherid=sc.nextInt();
                System.out.println("***Enter the Details of Employee***");
                System.out.println("Enter the empid:");
                int empid=sc.nextInt();
                System.out.println("Enter the companyname:");
                String companyname=sc.next();
                System.out.println("Enter the qualification:");
                String qualification=sc.next();
                System.out.println("Enter the salary:");
                double salary=sc.nextDouble();
                System.out.println("***Enter the Details of Person***");
                System.out.println("Enter the Name:");
                String name=sc.next();
                System.out.println("Enter the gender:");
                String gender=sc.next();
                System.out.println("Enter the address:");
                String address=sc.next();
                System.out.println("Enter the Age:");
                int age=sc.nextInt();
                t[i]=new Teacher(subject,department,teacherid, empid,companyname,qualification,salary,name,gender, address, age);
}
for(int i=0; i<n; i++) {
    t[i].display();
}
}
}