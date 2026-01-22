class X{
    int x;
    int display(){
        return(x);
    }
}

class Syntax3{
    public static void main(String arg[]){
        int r;
        X a=new X();
        a.x=50;
        r=a.display();
        System.out.println(r);
    }
}