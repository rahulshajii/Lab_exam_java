//Add complex numbers
import java.util.Scanner;
class complex{
    int real,imag;
    complex(int r,int i){
        real=r;
        imag=i;
    }
    complex add(complex c){
        return  new complex (real+c.real ,imag+c.imag);
    }
    void display(){
    System.out.println(real+" + "+imag+" i ");
    }
    public static void main(String [] args){
        complex c1=new complex(3,5);
        complex c2 =new complex(4,3);

        c2=c1.add(c2);
        c2.display();    
    }
} 