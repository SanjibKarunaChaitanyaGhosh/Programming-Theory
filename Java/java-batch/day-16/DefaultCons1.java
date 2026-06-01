// Syntax of Default Constructor

class A{
    int a;
    String b;
    boolean c;

    // A(){
    //     a=100;
    //     b="Sanjib";
    //     c=true;
    // }

    void display(){
        System.out.println("Value of a="+a+" Value of b="+b+" value of c="+c);
    }
}
class DefaultCons1{
    public static void main(String[] args) {
        A obj=new A();
        obj.display();
    }
}