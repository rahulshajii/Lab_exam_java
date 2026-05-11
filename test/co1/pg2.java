//Read 2 matrices from the console and perform matrix addition.
import java.util.Scanner;
class matrix{
    int [][] arr;
    int r,c;
    
    void read(Scanner sc){
        System.out.println("Enter the Size of rows size:");
        r =sc.nextInt();
        System.out.println("Enter the Size of colums size:");
        c =sc.nextInt();
        arr = new int[r][c];
        System.out.println("Enter the Elements of Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        } 

    }
public static  void main(String [] args){
    Scanner sc=new Scanner(System.in);
    matrix m1=new matrix();
    matrix m2=new matrix();
    m1.read(sc);
    m2.read(sc);

   int r=m1.r;
   int c=m1.c;
   int [][] sum =new int[r][c];
   System.out.println("*******sum of matrix******");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
        sum[i][j]=m1.arr[i][j] + m2.arr[i][j];
        System.out.print(sum[i][j]+" ");
        }
        System.out.println();
    }
}
}