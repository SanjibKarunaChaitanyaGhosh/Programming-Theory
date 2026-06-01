class A{
    int a,b,c;
    A(){
        System.out.println("This is default constructor");
    }

    A(int x){
        a=x;
        System.out.println(x);
    }
    A(int x,int y){
        a=x;
        b=y;
        System.out.println(x+y);
    }
    A(int x,int y,int z){
        a=x;
        b=y;
        c=z;
        System.out.println(x+y+z);
    }
}
class B{
    public static void main(String args[]){
        A r=new A();

        A r1=new A(30);

        A r2=new A(10,30,40);

        A r3=new A(10,30);
    }
}