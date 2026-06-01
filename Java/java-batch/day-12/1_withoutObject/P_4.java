class Q
{
    static int x;
    static void display(){
        System.out.println(x);
    }
}
class P_4
{
    public static void main(String[] args) {
    
        Q.x=15;
        Q.display();

    }
}