class BasicJava{
    int a; String b;

    void show(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        BasicJava r=new BasicJava();
        r.a=10;
        r.b="jublee";
        r.show();
    }
}