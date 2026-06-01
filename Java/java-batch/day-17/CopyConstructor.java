class A{
    int a; String b;
    A(){
        a=10;
        b="Jublee";

        System.out.println("My name is "+b+" and my age is "+a);
    }
    A(A ref){
        a=ref.a;
        b=ref.b;

        System.out.println("a="+a+" and b="+b);
    }
}
class B{
    public static void main(String[] args) {
        A r=new A();

        A objRef=new A(r);
    }
}