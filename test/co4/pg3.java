/*3.Define 2 classes; one for generating Fibonacci numbers and other for displaying even
numbers in a given range. Implement using threads. (Runnable Interface).*/
import java.util.Scanner;
class fib implements Runnable{
int n;
fib(int n){
    this.n=n;
}
public void run(){
    int a=0,b=1;
    for(int i=0;i<n;i++){
        System.out.print(a+" ");
        int c=a+b;
        a=b;
        b=c;
    }
System.out.println("\nEnter the start and end of even number:");
}
}
class even implements Runnable{
    int start,end;
    public even(int start,int end){
        this.start=start;
        this.end=end;
    }
    public void run(){
        for(int i=start;i<end;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
class threadExample{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Limit of Fibonacii:");
int n=sc.nextInt();
fib f=new fib(n);
Thread t1=new Thread(f);
t1.start();
int start=sc.nextInt();
int end=sc.nextInt();
even e=new even(start,end);
Thread t2=new Thread(e);
t2.start();

}
}