/* Program to Sort strings. Write a Java program that takes a list of programming languages
as input from the user, sorts them in alphabetical order, and displays the sorted list.*/
import java.util.Scanner;
class strings{
String [] str;
int size;

void read(Scanner sc){
    System.out.println("Enter the Limit of String Array:");
    size=sc.nextInt();
    str=new String [size];
    System.out.println("Enter the Elements of String Array:");
    for(int i=0;i<size;i++){
        str[i]=sc.next();
    }
}
String temp;
void sort(){
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if(str[i].compareTo(str[j])>0){
              temp=str[i];
              str[i]=str[j];
              str[j]=temp;
            }
        }
    }
}
void display(){
    for(int i=0;i<size;i++){
    System.out.println(str[i]);
    }
}
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    strings obj=new strings();
    obj.read(sc);
    obj.sort();
    obj.display();
}


}
