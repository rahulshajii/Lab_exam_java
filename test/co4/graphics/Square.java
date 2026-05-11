package graphics;
 public class Square implements Shape{
    int s;
   public Square(int s){
        this.s=s;
    }
   public void area(){
        System.out.println("Area of Square:"+(s*s));
    }
}