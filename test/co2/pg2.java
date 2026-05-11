/*Perform string manipulations: Given the string "Java is awesome", use string functions
to:
Find the length of the string.
Convert the string to uppercase.
Convert the string to lowercase.
Extract the substring "script".
Replace the word "awesome" with "fantastic".
Concatenate the string with " and fun!"
Find the index of the first occurrence of the letter "a".
Find the index of the last occurrence of the letter "s". */
import java.util.Scanner;
class main{
    void length(Scanner sc){
    System.out.println("Enter the String:");
    String str=sc.next();
    System.out.println("The Lenght of the String is:"+str.length());
    }
    void upper(Scanner sc){
    System.out.println("Enter the String:");
    String str=sc.next();
    System.out.println("String to UpperCase:"+str.toUpperCase());    
    }
    void lower(Scanner sc){
    System.out.println("Enter the String:");
    String str=sc.next();
    System.out.println("String to UpperCase:"+str.toLowerCase());  
    }
    void substring(Scanner sc){
    System.out.println("Enter the String:");
    String str=sc.next();
    System.out.println("Substring :"+str.substring(4)); 
    }
    void replace(Scanner sc){
    System.out.println("Enter the String:");
    sc.nextLine(); 
    String str = sc.nextLine();
    System.out.println("Replaced string"+str.replace("awesome","fantastic"));
    }
    void concate(Scanner sc){
    System.out.println("Enter the String:");
    String str=sc.next();
    System.out.println("concatend"+str.concat(" and fun!"));
    }
    void firstindex(Scanner sc){
    System.out.println("Enter the String:");
    String str=sc.next();
    System.out.println("first index "+str.indexOf("a"));
    }
    void lastindex(Scanner sc){
    System.out.println("Enter the String:");
    String str=sc.next();
    System.out.println("last index "+str.lastIndexOf("s"));
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        main obj=new main();
    int choice;
    while(true){
        System.out.println("1.length \n2.upper \n3.lower \n4.substring \n5.Replace \n6.concate \n7.first index of a \n8.last index of s \n9.exit \nEnter your choice:");
        choice =sc.nextInt();
        switch(choice){
            case 1: obj.length(sc);
                   break;
            case 2:obj.upper(sc);
                  break;
            case 3:obj.lower(sc);
                  break;
            case 4:obj.substring(sc);
                  break;
            case 5:obj.replace(sc);
                  break;
            case 6:obj.concate(sc);
                  break;
            case 7:obj.firstindex(sc);
                  break;
            case 8:obj.lastindex(sc);
                  break;
            case 9:System.exit(0);
                 break;
            default:System.out.println("wrong choice!!");
                break;
        }
    }

    }
}