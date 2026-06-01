class A{
    int x,y;

    A(int a,int b){
        x=a;
        y=b;
    }

    void abhisek(){
        System.out.println("the value of x is="+x+" and the value of y is "+y);
        System.out.println("I am a Liar");
    }
}
class B{
    public static void main(String args[]){
        A r=new A(100,200);
        r.abhisek();
    }
}

// javac fileName.java

// java className