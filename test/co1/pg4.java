/*Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)
and static nested class RAM (memory, manufacturer). Create an object of CPU and print
information of Processor and RAM*/
class cpu {
    double price;
    cpu(double p) {
        price=p;
    }
    void display(){
         System.out.println("details of CPU");
        System.out.println("CPU price:"+price);
       
    }
class processor {
    int no_of_cores;
    String manufacturer;
    void read(int c,String m){
        no_of_cores=c;
        manufacturer=m;
    }
    void display(){
         System.out.println("details of PROCESSOR");
        System.out.println("PROCESSOR NO_OF_CORES:"+no_of_cores);
        System.out.println("PROCESSOR MANUFACTURES:"+manufacturer);

    }
}
static class ram {
    int memmory;
    String manufacturer;
    void read(int m,String manu){
        memmory=m;
        manufacturer=manu;
    }
    void display(){
        System.out.println("details of RAM");
        System.out.println("RAM MEMMORY:"+memmory);
        System.out.println("RAM MANUFACTURES:"+manufacturer);
    }
}
public static void main(String [] args){
    cpu c=new cpu(19999);
    c.display();

    //inner class object
    cpu.processor p=c.new processor();
    p.read(3,"intel");
    p.display();

    //nested static class object

    cpu.ram r=new cpu.ram();
    r.read(256,"GIGABYTES");
    r.display();
   
}
}