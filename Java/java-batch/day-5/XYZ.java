class X {
    int x;

    int display(){
        return x;
    }
}
class XYZ{
    public static void main(String args[]){
        X arun=new X();

        arun.x=20;
        int R=arun.display();

        System.out.println("R :"+R);
    }
}