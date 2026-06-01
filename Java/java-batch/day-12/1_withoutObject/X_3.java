class M{
    static int x;
    static int display(){
        return x;
    }
}
class X_3{
    public static void main(String[] args) {
        int r;
        M_1.x=15;
        r=M_1.display();
        System.out.println(r);
    }
}