class P{
    int a; String b;
    private P(){
        a=10;
        b="Jublee";

        System.out.println("My name is "+b+" and my age is "+a);
    }
    P(P ref){
        a=ref.a;
        b=ref.b;

        System.out.println("a="+a+" and b="+b);
    }
    public static void main(String[] args) {
        P r=new P();
        P objRef=new P(r);
    }
}