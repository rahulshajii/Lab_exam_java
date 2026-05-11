package graphics;
public class Triangle implements Shape{
    int b,h;
   public Triangle(int b,int h){
        this.b=b;
        this.h=h;
    }
     public void area(){
        System.out.println("area of triangle:"+(.5*b*h));
    }
}