package graphics;
public class Rectangle implements Shape{
    int l,b;
   public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("area of rectangle"+(l*b));
    }
}