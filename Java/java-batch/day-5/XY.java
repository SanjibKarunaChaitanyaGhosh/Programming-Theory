class X {
    int x;

    void display(){
        System.out.println(x);
    }
}
class XY{
    public static void main(String args[]){
        X arun=new X();

        arun.x=20;
        arun.display();
    }
}