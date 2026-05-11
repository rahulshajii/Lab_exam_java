package graphics;
public class Circle implements Shape{
    int r;
   public Circle (int r){
        this.r=r;
    }
    public void area(){
    System.out.println("AREA of Circle:"+(3.14*r*r));
}
}