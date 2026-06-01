class A {
    int a;
    double b; 
    String c; 
    boolean d;

    // default Constructor
    A(){
        a=10;
        b=14.78;
        c="Kohli";
        d=true;
    }
    //Parametrized Constructor
    A(int x,double y){
        a=x;
        b=y;
    }
    void show(){
        System.out.println("  "+a+"    "+b);
    }
}
class Adefault1{
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        A obj2=new A(100,190.03);
        obj2.show();
    }
}