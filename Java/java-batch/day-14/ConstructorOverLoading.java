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
    A(int x,double y,String p){
        a=x;
        b=y;
        c=p;
    }
    void show(){
        System.out.println("  "+a+"    "+b+"   "+c);
    }
}
class ConstructorOverLoading{
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        A obj2=new A(100,190.03);
        obj2.show();
        A obj3=new A(104,78.9,"Arunangshu");
        obj3.show();
    }
}