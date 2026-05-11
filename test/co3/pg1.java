//Area of different shapes using overloaded functions
 class shape{
    void area(double b,double h){
        //triangle
        System.out.println("area of triangle:"+(.5*b*h));
    }
    int area(int a){
        //square
        System.out.println("area of square:"+(a*a));
        return 0;
    }
    double area(double r){
        //circle
        double pi=3.14;
        System.out.println("area of circle"+(pi*r*r));
        return 0;
    }
    double area(int l,int b){
        //rectangle
        System.out.println("area of Rectangle:"+(l*b));
        return 0;
    }
public static void main(String [] args){
   shape obj=new shape();
   obj.area(3.0,5.0);
   obj.area(4);
   obj.area(5.0);
   obj.area(7,3);


}
}